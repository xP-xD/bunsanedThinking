package customer;

import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import contract.Contract;
import contract.ContractList;
import contract.ContractStatus;
import contract.Endorsement;
import contract.EndorsementList;
import contract.Recontract;
import contract.RecontractList;
import contract.Revival;
import contract.RevivalList;
import contract.Termination;
import contract.TerminationList;
import contract.deposit.DepositDetail;
import contract.deposit.DepositDetailList;
import contract.deposit.DepositPath;
import contract.insuranceMoney.InsuranceMoney;
import contract.insuranceMoney.InsuranceMoneyList;
import customer.accident.Accident;
import customer.accident.AccidentList;
import customer.accidentHistory.AccidentHistory;
import customer.accidentHistory.AccidentHistoryList;
import customer.complaint.Complaint;
import customer.complaint.ComplaintList;
import customer.complaint.ComplaintType;
import customer.counsel.Counsel;
import customer.counsel.CounselList;
import customer.diseaseHistory.DiseaseHistory;
import customer.diseaseHistory.DiseaseHistoryList;
import customer.surgeryHistory.SurgeryHistory;
import customer.surgeryHistory.SurgeryHistoryList;
import exception.AlreadyRequestingException;
import exception.DuplicateResidentRegistrationNumberException;
import exception.NotExistContractException;
import exception.NotExistException;
import exception.NotExistExpiredContract;
import exception.NotExistMaintainedContract;
import exception.NotExistTerminatedContract;
import product.ProductList;
import product.insurance.Insurance;
import product.insurance.ServiceType;
import product.loan.Loan;

/**
 * @author 占쏙옙占쏙옙환
 * @version 1.0
 * @created 27-5-2024 占쏙옙占쏙옙 4:40:41
 */

//2024-06-04 源����쁽
public class Customer implements Cloneable {

	private ArrayList<AccidentHistory> accidentHistoryList;
	private ArrayList<Accident> accidentList;
	private String address;
	private int age;
	private String bankAccount;
	private String bankName;
	private ArrayList<Complaint> complaintList;
	private ArrayList<Contract> contractList;
	private ArrayList<Counsel> counselList;
	private ArrayList<DiseaseHistory> diseaseHistoryList;
	private Gender gender;
	private int id;
	private String job;
	private String name;
	private String phoneNumber;
	private long property;
	private String residentRegistrationNumber;
	private ArrayList<SurgeryHistory> surgeryHistoryList;

	public static final int CUSTOMER_SERIAL_NUMBER = 200;

	public Customer(String name, String phoneNumber, String job, int age, Gender gender,
			String residentRegistrationNumber, String address, long property, String bankName, String bankAccount) {
		this.accidentList = new ArrayList<>();
		this.address = address;
		this.age = age;
		this.bankAccount = bankAccount;
		this.bankName = bankName;
		this.complaintList = new ArrayList<>();
		this.contractList = new ArrayList<>();
		this.counselList = new ArrayList<>();
		this.gender = gender;
		this.job = job;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.property = property;
		this.residentRegistrationNumber = residentRegistrationNumber;
		this.accidentHistoryList = new ArrayList<>();
		this.diseaseHistoryList = new ArrayList<>();
		this.surgeryHistoryList = new ArrayList<>();
	}

	public Customer() {
	}

	public void finalize() throws Throwable {

	}

	public void signUp(String name, String phoneNumber, String job, int age, Gender gender,
			String residentRegistrationNumber, String address, long property,
			ArrayList<AccidentHistory> tempAccidentHistoryList, ArrayList<SurgeryHistory> tempSurgeryHistoryList,
			ArrayList<DiseaseHistory> tempDiseaseHistoryList, String bankName, String bankAccount,
			CustomerList customerList, AccidentHistoryList accidentHistoryList, SurgeryHistoryList surgeryHistoryList,
			DiseaseHistoryList diseaseHistoryList) throws DuplicateResidentRegistrationNumberException {
		for (Customer customer : customerList.getAll()) {
			if (customer.getResidentRegistrationNumber().equals(residentRegistrationNumber)) {
				throw new DuplicateResidentRegistrationNumberException();
			}
		}

		this.setAccidentList(new ArrayList<>());
		this.setComplaintList(new ArrayList<>());
		this.setCounsel(new ArrayList<>());
		this.setContractList(new ArrayList<>());
		this.setName(name);
		this.setPhoneNumber(phoneNumber);
		this.setJob(job);
		this.setAge(age);
		this.setGender(gender);
		this.setResidentRegistrationNumber(residentRegistrationNumber);
		this.setAddress(address);
		this.setProperty(property);
		this.setBankName(bankName);
		this.setBankAccount(bankAccount);

		customerList.add(this);
		if (tempAccidentHistoryList != null) {
			for (AccidentHistory e : tempAccidentHistoryList) {
				e.setCustomerID(this.getId());
				accidentHistoryList.add(e);
			}
			this.setAccidentHistoryList(tempAccidentHistoryList);
		}
		if (tempSurgeryHistoryList != null) {
			for (SurgeryHistory e : tempSurgeryHistoryList) {
				e.setCustomerID(this.getId());
				surgeryHistoryList.add(e);
			}
			this.setSurgeryHistoryList(tempSurgeryHistoryList);
		}
		if (tempDiseaseHistoryList != null) {
			for (DiseaseHistory e : tempDiseaseHistoryList) {
				e.setCustomerID(this.getId());
				diseaseHistoryList.add(e);
			}
			this.setDiseaseHistoryList(tempDiseaseHistoryList);
		}
	}

	public void applyEndorsement(ContractList contractList, EndorsementList endorsementList, int index,
			Contract contract) throws NotExistContractException {
		contract.setContractStatus(ContractStatus.EndorsementRequesting);
		contractList.update(contract);
		Endorsement endorsement = new Endorsement(contract);
		endorsementList.add(endorsement);
		endorsement.setPaymentDate(index);

	}

	public void applyInsuranceRevival(ContractList contractList, RevivalList revivalList, Contract contract,
			Customer customer) throws NotExistContractException, NotExistTerminatedContract {
		if (contract.getContractStatus() == ContractStatus.Terminating && contract.getExpirationDate() != null) {
			contract.setContractStatus(ContractStatus.RevivalRequesting);
			contractList.update(contract);
			Revival revival = new Revival(contract);
			revivalList.add(revival);
		} else {
			throw new NotExistTerminatedContract();
		}
	}

	public void applyInsuranceTermination(ContractList contractList, TerminationList terminationList, Contract contract,
			Customer customer) throws NotExistContractException, NotExistMaintainedContract {
		if (contract.getContractStatus() == ContractStatus.Maintaining) {
			contract.setContractStatus(ContractStatus.TerminationRequesting);
			contractList.update(contract);
			Termination termination = new Termination(contract);
			terminationList.add(termination);
		} else {
			throw new NotExistMaintainedContract();
		}
	}

	public void applyRecontract(ContractList contractList, RecontractList recontractList, Contract contract,
			Customer customer) throws NotExistContractException, NotExistExpiredContract {
		if (contract.getContractStatus() == ContractStatus.Maturing) {
			contract.setContractStatus(ContractStatus.RecontractRequesting);
			contractList.update(contract);
			Recontract recontract = new Recontract(contract);
			recontractList.add(recontract);
		} else {
			throw new NotExistExpiredContract();
		}
	}

	public void askInsuranceCounsel(Insurance insurance, String name, String phoneNumber,
			Date counselDate, String job, int age, Gender gender, CounselList counselList) {
		Counsel counsel = new Counsel(this.getId(), insurance.getId(), name, phoneNumber, counselDate, job, age, gender);
		this.counselList.add(counsel);
		counselList.add(counsel);
	}

	public boolean buyInsurance(Insurance insurance, ContractList contractList) {
		try {
			Contract contract = new Contract(this.id, insurance);
			this.contractList.add(contract);
			contractList.add(contract);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public void complain(ComplaintList complaintList, CustomerList customerList, ComplaintType complainType, String title, String content) {
		Complaint complaint = new Complaint(complainType, content, this.id, title);
		this.complaintList.add(complaint);
		complaintList.add(complaint);
	}

	public boolean loan(Loan loan, ContractList contractList) throws AlreadyRequestingException {
		ArrayList<Contract> myContractList = null;
		try {
			myContractList = contractList.getAllByCustomer(this.id);
		} catch (NotExistContractException e) {
			myContractList = new ArrayList<>();
		}
		for (Contract contract : myContractList) {
			if (contract.getProduct().getId() == loan.getId()) {
				throw new AlreadyRequestingException();
			}
		}
		Contract contract = new Contract(this.id, loan);
		this.contractList.add(contract);
		contractList.add(contract);
		return true;
	}

	public void payInsurancefee(Customer customer, Contract contract, int money, DepositPath path,
			DepositDetailList depositDetailList) {
		DepositDetail depositDetail = new DepositDetail(customer.getName(), contract.getId(), money, path);
		depositDetailList.add(depositDetail);
		contract.getDepositDetailList().add(depositDetail);
	}

	public void receiveInsurance(Contract contract, Image medicalCertificateImage,
			Image receiptImage, Image residentRegistrationCardImage, InsuranceMoneyList insuranceMoneyList)
			throws IOException {
		InsuranceMoney insuranceMoney = new InsuranceMoney(contract.getId(), this.bankName, this.bankAccount,
				medicalCertificateImage, receiptImage, residentRegistrationCardImage);
		insuranceMoneyList.add(insuranceMoney);
	}

	public void reportAccident(String customerName, String customerPhoneNumber, Date date, String location,
			ServiceType serviceType, AccidentList accidentList) {
		Accident accident = new Accident();
		try {
			accident.report(this.id, customerName, customerPhoneNumber, date, location, serviceType);
			int accidentId = accidentList.add(accident);
			this.accidentList.add(accidentList.get(accidentId));
		} catch (NotExistException e) {
			e.getMessage();
		}
	}

	public Insurance viewInsuranceProductList(ProductList productList, int id) throws NotExistException{
		ArrayList<Insurance> insuranceList = productList.getAllInsurance();
		for (Insurance insurance : insuranceList) {
			if (insurance.getId() == id) {
				return insurance;
			}
		}
		throw new NotExistException();
	}

	public Loan viewLoanProductList(ProductList productList, int id) throws NotExistException {
		ArrayList<Loan> loanList = productList.getAllLoan();
		for (Loan loan : loanList) {
			if (loan.getId() == id) {
				return loan;
			}
		}
		throw new NotExistException();
	}

	public ArrayList<AccidentHistory> getAccidentHistoryList() {
		return accidentHistoryList;
	}

	public void setAccidentHistoryList(ArrayList<AccidentHistory> accidentHistoryList) {
		this.accidentHistoryList = accidentHistoryList;
	}

	public ArrayList<Accident> getAccidentList() {
		return accidentList;
	}

	public void setAccidentList(ArrayList<Accident> accidentList) {
		this.accidentList = accidentList;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public ArrayList<Complaint> getComplaintList() {
		return complaintList;
	}

	public void setComplaintList(ArrayList<Complaint> complaintList) {
		this.complaintList = complaintList;
	}

	public ArrayList<Contract> getContractList() {
		return contractList;
	}

	public void setContractList(ArrayList<Contract> contractList) {
		this.contractList = contractList;
	}

	public ArrayList<Counsel> getCounsel() {
		return counselList;
	}

	public void setCounsel(ArrayList<Counsel> counsel) {
		this.counselList = counsel;
	}

	public ArrayList<DiseaseHistory> getDiseaseHistoryList() {
		return diseaseHistoryList;
	}

	public void setDiseaseHistoryList(ArrayList<DiseaseHistory> diseaseHistoryList) {
		this.diseaseHistoryList = diseaseHistoryList;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public long getProperty() {
		return property;
	}

	public void setProperty(long property) {
		this.property = property;
	}

	public String getResidentRegistrationNumber() {
		return residentRegistrationNumber;
	}

	public void setResidentRegistrationNumber(String residentRegistrationNumber) {
		this.residentRegistrationNumber = residentRegistrationNumber;
	}

	public ArrayList<SurgeryHistory> getSurgeryHistoryList() {
		return surgeryHistoryList;
	}

	public void setSurgeryHistoryList(ArrayList<SurgeryHistory> surgeryHistoryList) {
		this.surgeryHistoryList = surgeryHistoryList;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankName() {
		return this.bankName;
	}

	public Customer clone() {

		Customer customer = new Customer(getName(), getPhoneNumber(), getJob(), getAge(), getGender(),
				getResidentRegistrationNumber(), getAddress(), getProperty(), getBankName(), getBankAccount());
		customer.setId(getId());
		customer.setAccidentHistoryList(getAccidentHistoryList());
		customer.setSurgeryHistoryList(getSurgeryHistoryList());
		customer.setDiseaseHistoryList(getDiseaseHistoryList());

		return customer;
	}

}