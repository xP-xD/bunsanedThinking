package employee;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Administrator
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:25
 */
public class HumanResource extends Employee {

	public static String serialNumber = "060";
	private EmployeeList employeeList;

	public HumanResource(Employee uploadEmployeeData) {
	}

	public void initialize(EmployeeList employeeList) {
		this.employeeList = employeeList;
	}

	@Override
	public boolean work(int index) {
		
		switch (index) {
		case 1:
			addEmployee();
			return true;
		case 2:
			deleteEmployee();
			return true;
		case 3:
			getEmployee();
			return true;
		case 4:
			updateEmployee();
			return true;
		case 5:
			requestAdditionalAllowance();
			return true;
		case 6:
			requestBenefit();
			return true;
		case 7:
			return true;
		default:
			return false;
		}
	}

	public void addEmployee() {
//		try {
//			System.out.println("Please input Employee Information");
//			System.out.println("Adress : ");
//			String address = scanner.next();
//			System.out.println("Bank Account : ");
//			String bankAccount = scanner.next();
//			System.out.println("Department ID : ");
//			System.out.println(
//					"1. Financial Accountant 2. Administractive 3. Compensation 4. CustommerSupport 5. ManagementPlanning 6. Human Resource 7. Customer Information Management 8. Sales 9. Product Management");
//			int departmentID = Integer.parseInt(scanner.next());
//			System.out.println("Employment Year : ");
//			int employmentDateYear = Integer.parseInt(scanner.next());
//			System.out.println("Employment Month : ");
//			int employmentDateMonth = Integer.parseInt(scanner.next());
//			System.out.println("Employment Day : ");
//			int employmentDateDay = Integer.parseInt(scanner.next());
//			Date employeementDate = makeDate(employmentDateYear, employmentDateMonth, employmentDateDay);
//			System.out.println("Family Relationship : ");
//			
//			FamilyList familyRelationship = new FamilyListImpl();
//			
//			System.out.println("Name : ");
//			String name = scanner.next();
//			System.out.println("Phone Number : ");
//			String phoneNumber = scanner.next();
//			System.out.println("Position : ");
//			EmployeePosition employeePosition = makePosition(scanner);
//			System.out.println("Resident Registration Number : ");
//			String residentRegistrationNumber = scanner.next();
//			System.out.println("Salary : ");
//			int salary = Integer.parseInt(scanner.next());
//			Employee employee = null;
//			switch (departmentID) {
//			case 1:
//				employee = new FinancialAccountant(address, bankAccount, departmentID, employeementDate,
//						familyRelationship, name, phoneNumber, employeePosition, residentRegistrationNumber, salary);
//				break;
//			case 2:
//				employee = new Administrative(address, bankAccount, departmentID, employeementDate, familyRelationship,
//						name, phoneNumber, employeePosition, residentRegistrationNumber, salary);
//				break;
//			case 3:
//				employee = new CompensationPlanning(address, bankAccount, departmentID, employeementDate,
//						familyRelationship, name, phoneNumber, employeePosition, residentRegistrationNumber, salary);
//				break;
//			case 4:
//				employee = new CustommerSupport(address, bankAccount, departmentID, employeementDate,
//						familyRelationship, name, phoneNumber, employeePosition, residentRegistrationNumber, salary);
//				break;
//			case 5:
//				employee = new ManagementPlanning(address, bankAccount, departmentID, employeementDate,
//						familyRelationship, name, phoneNumber, employeePosition, residentRegistrationNumber, salary);
//				break;
//			case 6:
//				employee = new HumanResource(address, bankAccount, departmentID, employeementDate, familyRelationship,
//						name, phoneNumber, employeePosition, residentRegistrationNumber, salary);
//				break;
//			case 7:
//				employee = new CustomerInformationManagement(address, bankAccount, departmentID, employeementDate,
//						familyRelationship, name, phoneNumber, employeePosition, residentRegistrationNumber, salary);
//				break;
//			case 8:
//				employee = new Sales(address, bankAccount, departmentID, employeementDate, familyRelationship, name,
//						phoneNumber, employeePosition, residentRegistrationNumber, salary);
//				break;
//			case 9:
//				employee = new ProductManagement(address, bankAccount, departmentID, employeementDate,
//						familyRelationship, name, phoneNumber, employeePosition, residentRegistrationNumber, salary);
//				break;
//			}
//			if (employee == null) {
//				System.out.println("Incorrect Department ID");
//				return;
//			} else {
//				this.employeeList.add(employee);
//			}
//		} catch (Exception e) {
//			System.out.println("Input Error");
//		}
	}

	private Date makeDate(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, day);
		return new Date(cal.getTimeInMillis());
	}

	private EmployeePosition makePosition(Scanner scanner) {
		int index = 0;
		String input;
		EmployeePosition employeePosition = null;
		while (true) {
			try {
				System.out.println(
						"1. GeneralManager 2. Manager 3. DeputyGeneralManager 4. SeniorStaff 5. Staff 6. Intern");
				input = scanner.next();
				index = Integer.parseInt(input);
				switch (index) {
				case 1:
					return EmployeePosition.GeneralManager;
				case 2:
					return EmployeePosition.Manager;
				case 3:
					return EmployeePosition.DeputyGeneralManager;
				case 4:
					return EmployeePosition.SeniorStaff;
				case 5:
					return EmployeePosition.Staff;
				case 6:
					return EmployeePosition.Intern;
				default:
					System.out.println("Please select in 1~6.");
				}

			} catch (Exception e) {
				System.out.println("Please input number.");
			}
		}
	}

	public void deleteEmployee() {
//		System.out.println("Please input Employee ID want to delete");
//		String input;
//		int id = -1;
//		boolean isNumeric = false;
//		while (!isNumeric) {
//			input = scanner.next();
//			if (input.chars().allMatch(Character::isDigit)) {
//				isNumeric = true;
//				id = Integer.parseInt(input);
//			} else {
//				System.out.println("Please input number.");
//			}
//		}
//		if (id != -1) {
//			this.employeeList.delete(id);
//		}
	}

	public void getEmployee() {
//		System.out.println("Please input Employee ID want to get");
//		String input;
//		int id = -1;
//		boolean isNumeric = false;
//		while (!isNumeric) {
//			input = scanner.next();
//			if (Pattern.matches("^\\d+$", input)) {
//				isNumeric = true;
//				id = Integer.parseInt(input);
//			} else {
//				System.out.println("Please input number.");
//			}
//		}
//		Employee employee = null;
//		if (id != -1) {
//			employee = employeeList.get(id);
//		}
//		if (employee != null) {
//			System.out.println("ID : " + employee.getId());
//			System.out.println("Name : " + employee.getName());
//			System.out.println("Position : " + employee.getPosition().name());
//		}
	}

	public void updateEmployee() {
//		System.out.println("Please input Employee ID want to update");
//		String input;
//		int id = -1;
//		boolean isNumeric = false;
//		while (!isNumeric) {
//			input = scanner.next();
//			if (Pattern.matches("^\\d+$", input)) {
//				isNumeric = true;
//				id = Integer.parseInt(input);
//			} else {
//				System.out.println("Please input number.");
//			}
//		}
//		if (id != -1) {
//			this.employeeList.update(id, scanner);
//		}
	}

	public void requestAdditionalAllowance() {
		System.out.println("Request Additional Allowance");
	}

	public void requestBenefit() {
		System.out.println("Request Benefit");
	}

}