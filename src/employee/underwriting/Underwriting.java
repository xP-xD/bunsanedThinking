package employee.underwriting;

import java.util.Date;

import contract.Contract;
import contract.ContractList;
import contract.ContractStatus;
import employee.Employee;
import employee.EmployeePosition;
import exception.AlreadyProcessedException;
import exception.NotExistContractException;

/**
 * @author Administrator
 * @version 1.0
 * @created 27-5-2024 4:40:44
 */
//2024-06-06 김대현
public class Underwriting extends Employee {

	public static final int UNDERWRITING_SERIAL_NUMBER = 200;

	public Underwriting(String name, EmployeePosition employeePosition, String address, String phoneNumber,
			String bankName, String bankAccount, String residentRegistrationNumber, int departmentID, int salary,
			Date dateOfemployment) {
		super(name, employeePosition, address, phoneNumber, bankName, bankAccount, residentRegistrationNumber,
				departmentID, salary, dateOfemployment);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void applyCoperation() {

	}

	public void applyReinsurance() {

	}

	public boolean reviewAcquisition(Contract contract, boolean result, ContractList contractList)
			throws AlreadyProcessedException, NotExistContractException {
		if (contract.getContractStatus() != ContractStatus.ContractRequesting) {
			throw new AlreadyProcessedException();
		}
		contract.review(result, contractList);
		return result;
	}

	@Override
	public Employee clone() {
		Employee employee = new Underwriting(getName(), getPosition(), getAddress(), getPhoneNumber(), getBankName(),
				getBankAccount(), getResidentRegistrationNumber(), getDepartmentID(), getSalary(),  this.employmentDate);
		return employee;
	}

}