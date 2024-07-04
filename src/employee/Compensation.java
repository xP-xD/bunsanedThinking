package employee;

import java.util.Date;

import contract.insuranceMoney.InsuranceMoney;
import contract.insuranceMoney.InsuranceMoneyList;
import contract.insuranceMoney.InsuranceMoneyStatus;
import customer.Customer;
import customer.accident.AccidentList;
import customer.report.Report;
import customer.report.ReportList;
import customer.report.ReportProcessStatus;
import exception.AlreadyProcessedException;
import exception.NotExistException;

/**
 * @author Administrator
 * @version 1.0
 * @created 27-5-2024 占쏙옙占쏙옙 4:40:40
 */
//2024-06-06 源����쁽
public class Compensation extends Employee {


	public static final int COMPENSATION_SERIAL_NUMBER = 130;

	public Compensation(String name, EmployeePosition employeePosition, String address, String phoneNumber,
			String bankName, String bankAccount, String residentRegistrationNumber, int departmentID, int salary,
			Date dateOfemployment) {
		super(name, employeePosition, address, phoneNumber, bankName, bankAccount, residentRegistrationNumber, departmentID,
				salary, dateOfemployment);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void requestCompensation(String accountHolder, String bank, String bankAccount, int money,
			PaymentType paymentType, int contractId, PaymentDetailList paymentDetailList, Report report, ReportList reportList, AccidentList accidentList)
					throws NotExistException, AlreadyProcessedException{
		if (report.getProcessStatus() == ReportProcessStatus.Completed) {
			throw new AlreadyProcessedException();
		}
		PaymentDetail payment = new PaymentDetail(accountHolder, bank, bankAccount, money, paymentType, contractId);
		paymentDetailList.add(payment);
		report.setProcessStatus(ReportProcessStatus.Completed);
		reportList.update(report);
		report.getAccident().complete();
		accidentList.update(report.getAccident());
	}
	
	public void requestInsuranceMoney(Customer customer, int money, InsuranceMoney insuranceMoney, InsuranceMoneyList insuranceMoneyList,
			PaymentType paymentType, int contractId, PaymentDetailList paymentDetailList) throws NotExistException, AlreadyProcessedException{
		if (insuranceMoney.getProcessStatus() == InsuranceMoneyStatus.Completed) {
			throw new AlreadyProcessedException();
		}
		PaymentDetail payment = new PaymentDetail(customer.getName(), customer.getBankName(), customer.getBankAccount(), money, paymentType, contractId);
		paymentDetailList.add(payment);
		insuranceMoney.setProcessStatus(InsuranceMoneyStatus.Completed);
		insuranceMoney.handle();
		insuranceMoneyList.update(insuranceMoney);
	}
	@Override
	public Employee clone() {
		Employee employee = new Compensation(getName(), getPosition(),getAddress(), getPhoneNumber(), getBankName(), getBankAccount(),getResidentRegistrationNumber(), getDepartmentID(), getSalary(),this.employmentDate);
		employee.setId(getId());
		return employee;
	}
}