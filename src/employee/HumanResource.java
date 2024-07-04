package employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import employee.sales.Sales;
import employee.underwriting.Underwriting;
import exception.DuplicateResidentRegistrationNumberException;
import exception.NotExistException;

/**
 * @author Administrator
 * @version 1.0
 * @created 27-5-2024 占쏙옙占쏙옙 4:40:42
 */
//2024-06-06 源����쁽
public class HumanResource extends Employee {

	public static final int HUMANRESOURCE_SERIAL_NUMBER = 160;

	public HumanResource(String name, EmployeePosition employeePosition, String address, String phoneNumber,
			String bankName, String bankAccount, String residentRegistrationNumber, int departmentID, int salary,
			Date dateOfemployment) {
		super(name, employeePosition, address, phoneNumber, bankName, bankAccount, residentRegistrationNumber, departmentID,
				salary, dateOfemployment);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void addEmployee(int teamId, String name, EmployeePosition employeePosition, String address, String phoneNumber, String bankName, String bankAccount, String residentRegistrationNumber, int departmentID, int salary, String dateOfemployment, EmployeeList employeeList, ArrayList<Family> tempFamilyList, FamilyList familyList) throws DuplicateResidentRegistrationNumberException{
		for (Employee employee : employeeList.getAll()) {
			if (employee.getResidentRegistrationNumber().equals(residentRegistrationNumber)) {
				throw new DuplicateResidentRegistrationNumberException();
			}
		}
		Date date = null;
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse(dateOfemployment);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Employee employee = null;
//		1. �옱臾댄쉶怨꾪� 2. 珥앸Т愿�由ы� 3. 蹂댁긽泥섎━�� 4. 怨좉컼吏��썝�� 5. 寃쎌쁺愿�由ы� 6. �씤�궗�� 7. 怨좉컼�젙蹂닿�由ы� 8. �쁺�뾽�� 9. �긽�뭹愿�由ы� 10.U/W�� 11. 蹂댁긽湲고쉷�� 12. 怨꾩빟愿�由ы� 13. �쑖�옄�슫�슜��
		if(teamId ==110) {
			employee = new FinancialAccountant(name, employeePosition,address, phoneNumber, bankName, bankAccount,residentRegistrationNumber, departmentID, salary,date);
			employeeList.add(employee);
		}else if(teamId ==120) {
			employee = new Administrative(name, employeePosition,address, phoneNumber, bankName, bankAccount,residentRegistrationNumber, departmentID, salary,date);
			employeeList.add(employee);
		}else if(teamId ==130) {
			employee = new Compensation(name, employeePosition,address, phoneNumber, bankName, bankAccount,residentRegistrationNumber, departmentID, salary,date);
			employeeList.add(employee);
		}else if(teamId ==140) {
			employee = new CustomerSupport(name, employeePosition,address, phoneNumber, bankName, bankAccount,residentRegistrationNumber, departmentID, salary,date);
			employeeList.add(employee);
		}else if(teamId ==150) {
			employee = new ManagementPlanning(name, employeePosition,address, phoneNumber, bankName, bankAccount,residentRegistrationNumber, departmentID, salary,date);
			employeeList.add(employee);
		}else if(teamId ==160) {
			employee = new HumanResource(name, employeePosition,address, phoneNumber, bankName, bankAccount,residentRegistrationNumber, departmentID, salary,date);
			employeeList.add(employee);
		}else if(teamId ==170) {
			employee = new CustomerInformationManagement(name, employeePosition,address, phoneNumber, bankName, bankAccount,residentRegistrationNumber, departmentID, salary,date);
			employeeList.add(employee);
		}else if(teamId ==180) {
			employee = new Sales(name, employeePosition,address, phoneNumber, bankName, bankAccount,residentRegistrationNumber, departmentID, salary,date);
			employeeList.add(employee);
		}else if(teamId ==190) {
			employee = new ProductManagement(name, employeePosition,address, phoneNumber, bankName, bankAccount,residentRegistrationNumber, departmentID, salary,date);
			employeeList.add(employee);
		}else if(teamId ==200) {
			employee = new Underwriting(name, employeePosition,address, phoneNumber, bankName, bankAccount,residentRegistrationNumber, departmentID, salary,date);
			employeeList.add(employee);
		}else if(teamId ==210) {
			employee = new CompensationPlanning(name, employeePosition,address, phoneNumber, bankName, bankAccount,residentRegistrationNumber, departmentID, salary,date);
			employeeList.add(employee);
		}else if(teamId ==220) {
			employee = new ContractManagement(name, employeePosition,address, phoneNumber, bankName, bankAccount,residentRegistrationNumber, departmentID, salary,date);
			employeeList.add(employee);
		}else if(teamId ==230) {
			employee = new LoanManagement(name, employeePosition,address, phoneNumber, bankName, bankAccount,residentRegistrationNumber, departmentID, salary,date);
			employeeList.add(employee);
		}
		
		for(Family e:tempFamilyList) {
			e.setEmployeeID(employee.getId());
			familyList.add(e);
		}
		employee.setFamilyList(tempFamilyList);
	}

	public void deleteEmployee(EmployeeList employeeList, int id) throws NotExistException{
		employeeList.delete(id);
	}

	public Employee getEmployee(EmployeeList employeeList, int id) throws NotExistException{
		try {
			return employeeList.get(id);
		} catch (NotExistException e) {
			throw new NotExistException("해당하는 직원 정보가 존재하지 않습니다.");
		}
	}

	public void requestAdditionalAllowance(){
		System.out.println("Additional Allowance");
	}

	public void requestBenefit(){
		System.out.println("Request Benefit");
	}

	public void updateEmployee(int index, String input, Employee employee, EmployeeList employeeList) throws NotExistException {
		switch (index) {
		case 1:
			employee.setName(input);
			employeeList.update(employee);
			break;
		case 2:
			if (EmployeePosition.Intern.ordinal() == (Integer.parseInt(input) - 1)) {
				employee.setPosition(EmployeePosition.Intern);
			} else if (EmployeePosition.Staff.ordinal() == (Integer.parseInt(input) - 1)) {
				employee.setPosition(EmployeePosition.Staff);
			}else if (EmployeePosition.SeniorStaff.ordinal() == (Integer.parseInt(input) - 1)) {
				employee.setPosition(EmployeePosition.SeniorStaff);
			}else if (EmployeePosition.Manager.ordinal() == (Integer.parseInt(input) - 1)) {
				employee.setPosition(EmployeePosition.Manager);
			}else if (EmployeePosition.DeputyGeneralManager.ordinal() == (Integer.parseInt(input) - 1)) {
				employee.setPosition(EmployeePosition.DeputyGeneralManager);
			}else if (EmployeePosition.GeneralManager.ordinal() == (Integer.parseInt(input) - 1)) {
				employee.setPosition(EmployeePosition.GeneralManager);
			}
			employeeList.update(employee);
			break;
		case 3:
			employee.setAddress(input);
			employeeList.update(employee);
			break;
		case 4:
			employee.setPhoneNumber(input);
			employeeList.update(employee);
			break;
		case 5:
			employee.setBankName(input);
			employeeList.update(employee);
			break;
		case 6:
			employee.setBankAccount(input);
			employeeList.update(employee);
			break;
		case 8:
			employee.setDepartmentID(Integer.parseInt(input));
			employeeList.update(employee);
			break;
		case 9:
			employee.setSalary(Integer.parseInt(input));
			employeeList.update(employee);
			break;
		default:
			break;
		}
	}

	@Override
	public Employee clone() {
		Employee employee = new HumanResource(getName(), getPosition(),getAddress(), getPhoneNumber(), getBankName(), getBankAccount(),getResidentRegistrationNumber(), getDepartmentID(), getSalary(),this.employmentDate);
		employee.setId(getId());
		return employee;
	}

}