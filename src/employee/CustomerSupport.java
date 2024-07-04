package employee;

import java.util.Date;

import customer.accident.Accident;
import customer.accident.AccidentProcessStatus;
import customer.complaint.Complaint;
import customer.complaint.ComplaintList;
import customer.complaint.ComplaintProcessStatus;
import customer.report.Report;
import customer.report.ReportList;
import exception.AlreadyProcessedException;
import exception.NotExistException;
import partner.PartnerCompany;

/**
 * @author Administrator
 * @version 1.0
 * @created 27-5-2024 占쏙옙占쏙옙 4:40:41
 */
//2024-06-06 源����쁽
public class CustomerSupport extends Employee {

	public static final int CUSTOMER_SUPPORT_SERIAL_NUMBER = 140;

	public CustomerSupport(String name, EmployeePosition employeePosition, String address, String phoneNumber,
			String bankName, String bankAccount, String residentRegistrationNumber, int departmentID, int salary,
			Date dateOfemployment) {
		super(name, employeePosition, address, phoneNumber, bankName, bankAccount, residentRegistrationNumber, departmentID,
				salary, dateOfemployment);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void handleComplaint(CustomerSupport employee, Complaint complaint, String result, ComplaintList complaintList) throws NotExistException, AlreadyProcessedException{
		if (complaint.getProcessStatus() == ComplaintProcessStatus.Completed) {
			throw new AlreadyProcessedException("이미 민원 처리가 완료되었습니다.");
		}
		complaint.handle(employee.getName(), result);
		complaintList.update(complaint);
	}

	public void handleAccident(Accident accident, PartnerCompany damageAssessmentCompany,
			PartnerCompany roadsideAssistanceCompany, ReportList reportList) throws AlreadyProcessedException {
		if (accident.getProcessStatus() == AccidentProcessStatus.Completed) {
			throw new AlreadyProcessedException("이미 신고 처리가 완료되었습니다.");
		} else if (accident.getProcessStatus() == AccidentProcessStatus.Processing) {
			throw new AlreadyProcessedException("신고 처리 중입니다.");
		}
		accident.processing();
		Report report = new Report(accident, damageAssessmentCompany, roadsideAssistanceCompany);
		reportList.add(report);
	}

	@Override
	public Employee clone() {
		Employee employee = new CustomerSupport(getName(), getPosition(),getAddress(), getPhoneNumber(), getBankName(), getBankAccount(),getResidentRegistrationNumber(), getDepartmentID(), getSalary(),this.employmentDate);
		employee.setId(getId());
		return employee;
	}

}