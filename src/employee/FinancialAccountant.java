package employee;

import java.util.Date;

import contract.deposit.DepositDetail;
import contract.deposit.DepositDetailList;
import exception.AlreadyProcessedException;
import exception.NotExistException;

/**
 * @author Administrator
 * @version 1.0
 * @created 27-5-2024 占쏙옙占쏙옙 4:40:42
 */
//2024-06-06 源����쁽
public class FinancialAccountant extends Employee {

	public static final int FINANCIAL_ACCOUNTANT_ACCOUNTANT_SERIAL_NUMBER = 110;
	
	public FinancialAccountant(String name, EmployeePosition employeePosition, String address, String phoneNumber,
			String bankName, String bankAccount, String residentRegistrationNumber, int departmentID, int salary,
			Date dateOfemployment) {
		super(name, employeePosition, address, phoneNumber, bankName, bankAccount, residentRegistrationNumber, departmentID, salary,dateOfemployment);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public DepositDetail getDepositDetail(DepositDetailList depositDetailList, int id) throws NotExistException{
		return depositDetailList.get(id);
	}

	public void getTaxPaymentDetail(){

	}
	public void handlePayment(PaymentDetail paymentDetail, PaymentDetailList paymentDetailList) throws NotExistException, AlreadyProcessedException{
		if (paymentDetail.getProcessStatus() == PaymentProcessStatus.Completed) {
			throw new AlreadyProcessedException("이미 지급이 완료되었습니다.");
		}
		paymentDetail.handle();
		paymentDetailList.update(paymentDetail);
	}

	@Override
	public Employee clone() {
		Employee employee = new FinancialAccountant(getName(), getPosition(),getAddress(), getPhoneNumber(), getBankName(), getBankAccount(),getResidentRegistrationNumber(), getDepartmentID(), getSalary(),this.employmentDate);
		employee.setId(getId());
		return employee;
	}

}