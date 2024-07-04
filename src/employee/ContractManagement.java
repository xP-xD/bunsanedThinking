package employee;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

import contract.Contract;
import contract.ContractList;
import contract.ContractStatus;
import contract.Endorsement;
import contract.EndorsementStatus;
import contract.Recontract;
import contract.RecontractStatus;
import contract.Revival;
import contract.RevivalStatus;
import contract.Termination;
import contract.TerminationStatus;
import contract.deposit.DepositDetail;
import customer.Customer;
import exception.AlreadyProcessedException;
import exception.NotExistContractException;
import product.insurance.Insurance;

/**
 * @author Administrator
 * @version 1.0
 * @created 27-5-2024 占쏙옙占쏙옙 4:40:41
 */

public class ContractManagement extends Employee {

	public static final int CONTRACT_MANAGEMENT_SERIAL_NUMBER = 220;

	public ContractManagement(String name, EmployeePosition employeePosition, String address, String phoneNumber,
			String bankName, String bankAccount, String residentRegistrationNumber, int departmentID, int salary,
			Date dateOfemployment) {
		super(name, employeePosition, address, phoneNumber, bankName, bankAccount, residentRegistrationNumber,
				departmentID, salary, dateOfemployment);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public boolean requestTerminationFee(Termination tercontract, Customer customer,
			PaymentDetailList paymentDetailList, ContractList contractList) throws NotExistContractException, AlreadyProcessedException {
		if (tercontract.getTerminationStatus() == TerminationStatus.Completed) {
			throw new AlreadyProcessedException();
		}
		ArrayList<DepositDetail> depositDetailList = tercontract.getDepositDetailList();
		int totalMoney = 0;
		for (DepositDetail depositDetail : depositDetailList) {
			totalMoney += depositDetail.getMoney();
		}
		totalMoney = (int) (totalMoney * 0.3);
		PaymentDetail paymentDetail = new PaymentDetail(customer.getName(), customer.getBankName(),
				customer.getBankAccount(), totalMoney, PaymentType.AccountTransfer, tercontract.getId());
		paymentDetailList.add(paymentDetail);
		Contract contract = tercontract.getOriginalContract();
		tercontract.setTerminationStatus(TerminationStatus.Completed);
		tercontract.setApplyDate(new Date());
		contract.setTerminationDate(tercontract.getApplyDate());
		contract.setContractStatus(ContractStatus.Terminating);
		contractList.update(contract);
		return true;
	}

	public boolean reviewEndorsement(Endorsement encontract, Customer customer, int index) {
		if (index == 1) {
			encontract.setPaymentDate(encontract.getPaymentDate());
			encontract.setEndorsementStatus(EndorsementStatus.Completed);
		} else if (index == 2) {
			encontract.setEndorsementStatus(EndorsementStatus.Unprocessed);
		}
		return true;
	}

	public boolean reviewRecontract(ContractList contractList, Recontract recontract, Customer customer, int index) throws NotExistContractException {
		if (index == 1) { // �듅�씤
			Contract contract = recontract.getOriginalContract().clone();
			Insurance product = (Insurance) recontract.getOriginalContract().getProduct();
			contract.setContractStatus(ContractStatus.Maintaining);
			contract.setDate(new Date());

			LocalDate currentDate = LocalDate.now();
			LocalDate expirationDate = currentDate.plusYears(product.getContractPeriod());
			contract.setExpirationDate(Date.from(expirationDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
			contractList.update(contract);
			recontract.setRecontractStatus(RecontractStatus.Completed);
		} else if (index == 2) { // 嫄곗젅
			recontract.setRecontractStatus(RecontractStatus.Unprocessed);
		}
		return true;
	}

	public boolean reviewRevival(ContractList contractList, Revival revivalcontract, Customer customer, int index) {
		if (index == 1) {
			Contract contract = revivalcontract.getOriginalContract().clone();
			contract.setContractStatus(ContractStatus.Maintaining);
			contract.setDate(new Date());
			try {
				contractList.update(contract);
			} catch (NotExistContractException e) {
				e.printStackTrace();
			}
			revivalcontract.setRevivalStatus(RevivalStatus.Completed);
		} else if (index == 2) {
			revivalcontract.setRevivalStatus(RevivalStatus.Unprocessed);
		}
		return true;
	}

	@Override
	public Employee clone() {
		Employee employee = new ContractManagement(getName(), getPosition(), getAddress(), getPhoneNumber(),
				getBankName(), getBankAccount(), getResidentRegistrationNumber(), getDepartmentID(), getSalary(),
				this.employmentDate);
		employee.setId(getId());
		return employee;
	}

}