package customer;

import contract.ContractList;
import contract.ContractListImpl;
import employee.ComplaintList;
import employee.ComplaintListImpl;
import product.Insurance;
import product.Loan;
import product.Product;
import product.ProductList;
import product.ProductListImpl;

/**
 * @author ����ȯ
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:23
 */
public class Customer {

	private AccidentList accident;
	private AccidentHistoryList accidentHistory;
	private String address;
	private int age;
	private String bankAccount;
	private ComplaintList complaint;
	private ContractList contract;
	private CounselList counsel;
	private DiseaseHistoryList diseaseHistory;
	private Gender gender;
	private int id;
	private String job;
	private String name;
	private String phoneNumber;
	private long property;
	private String residentRegistrationNumber;
	private SurgeryHistoryList surgeryHistory;

	public Gender m_Gender;
	public Product m_Product;
	public DiseaseHistoryListImpl m_DiseaseHistoryListImpl;
	public ComplaintListImpl m_ComplaintListImpl;
	public CounselListImpl m_CounselListImpl;
	public AccidentListImpl m_AccidentListImpl;
	public AccidentHistoryListImpl m_AccidentHistoryListImpl;
	public SurgeryHistoryListImpl m_SurgeryHistoryListImpl;
	public ContractListImpl m_ContractListImpl;

	static int customerSerialNum = 200;

	public Customer(Customer customerData) {
		// TODO Auto-generated constructor stub
	}

	// getters and setters
	public AccidentList getAccident() {
		return accident;
	}

	public void setAccident(AccidentList accident) {
		this.accident = accident;
	}

	public AccidentHistoryList getAccidentHistory() {
		return accidentHistory;
	}

	public void setAccidentHistory(AccidentHistoryList accidentHistory) {
		this.accidentHistory = accidentHistory;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String adress) {
		this.address = adress;
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

	public ComplaintList getComplaint() {
		return complaint;
	}

	public void setComplaint(ComplaintList complaint) {
		this.complaint = complaint;
	}

	public ContractList getContract() {
		return contract;
	}

	public void setContract(ContractList contract) {
		this.contract = contract;
	}

	public CounselList getCounsel() {
		return counsel;
	}

	public void setCounsel(CounselList counsel) {
		this.counsel = counsel;
	}

	public DiseaseHistoryList getDiseaseHistory() {
		return diseaseHistory;
	}

	public void setDiseaseHistory(DiseaseHistoryList diseaseHistory) {
		this.diseaseHistory = diseaseHistory;
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

	public SurgeryHistoryList getSurgeryHistory() {
		return surgeryHistory;
	}

	public void setSurgeryHistory(SurgeryHistoryList surgeryHistory) {
		this.surgeryHistory = surgeryHistory;
	}

	public void add() {

	}

	public void delete() {

	}

	public void get() {

	}
	
	public void update() {

	}

	public ProductList viewProductList(int index) {
		
		switch (index) {
		case 1:
			return viewInsuranceProductList();
		case 2:
			return viewLoanProductList();
		case 3:
			break;
		default:
			break;
		}
		return null;
	}

	public ProductList viewInsuranceProductList() {
		ProductList insuranceList = new ProductListImpl();
		Product insurance = new Insurance();
		insuranceList.add(insurance);
		return insuranceList;
	}

	public void buyInsurance() {
		System.out.println("Buy Insurance");
	}

	public void askInsuranceCounsel() {
		System.out.println("Ask InsuranceCounsel");
	}

	public ProductList viewLoanProductList() {
		ProductList LoanList = new ProductListImpl();
		Product Loan = new Loan();
		LoanList.add(Loan);
		return LoanList;
	}

	public void loan() {
		System.out.println("Loan");
	}

	public void manageInsurance(int index) {
		
		switch (index) {
		case 1:
			applyRecontract();
			break;
		case 2:
			viewLoanProductList();
			break;
		case 3:
			applyInsuranceRevival();
			break;
		case 4:
			applyEndorsement();
			break;
		case 5:
			payInsurancefee();
			break;
		case 6:
			receiveInsurance();
			break;
		case 7:
			break;
		default:
			break;
		}
	}

	public void applyEndorsement() {
		System.out.println("Apply Endorsement");
	}

	public void applyInsuranceRevival() {
		System.out.println("Apply InsuranceRevival");
	}

	public void applyInsuranceTermination() {
		System.out.println("Apply InsuranceTermination");
	}

	public void applyRecontract() {
		System.out.println("Apply Recontract");
	}

	public void payInsurancefee() {
		System.out.println("PayInsurancefee");
	}

	public void receiveInsurance() {
		System.out.println("Receive Insurance");
	}

	public void reportAccident() {
		System.out.println("Report Accident");
	}

	public void complain() {
		System.out.println("Complain");
	}

}