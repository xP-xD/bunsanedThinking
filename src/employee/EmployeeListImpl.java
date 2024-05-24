package employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author KimChan
 * @version 1.0
 * @created 20-5-2024 占쏙옙占쏙옙 7:52:24
 */
public class EmployeeListImpl implements EmployeeList {

	private ArrayList<Employee> employeeList;
	private Employee m_Employee;

	private Scanner scanner;
	private File file;
	private String filePath = "data/employee";
	private FileWriter fileWriter;
	private PrintWriter printWriter;

	public EmployeeListImpl() {
		employeeList = new ArrayList<Employee>();

		try {
			file = new File(filePath);
			this.scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void initialize() {

//		while (scanner.hasNextLine()) {
//			int id = scanner.nextInt();
//			String address = scanner.next();
//			String bankAccount = scanner.next();
//			int departmentID = scanner.nextInt();
//
//			String dateString = scanner.next();
//			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//			Date employmentDate = null;
//			try {
//				employmentDate = dateFormat.parse(dateString);
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//			int familyRelationshipId = scanner.nextInt();
//			FamilyList familyRelationship = new FamilyListImpl();
//
//			String name = scanner.next();
//			String phoneNumber = scanner.next();
//			int positionId = scanner.nextInt();
//
//			String residentRegistrationNumber = scanner.next();
//			int salary = scanner.nextInt();
//
//			String idString = Integer.toString(id);
//
//			if (idString.matches("600010\\d+")) {
//				m_Employee = new FinancialAccountant(address, bankAccount, departmentID, employmentDate,
//						familyRelationship, name, phoneNumber, EmployeePosition.values()[positionId],
//						residentRegistrationNumber, salary);
//				m_Employee.setId(id);
//			} else if (idString.matches("600020\\d+")) {
//				m_Employee = new Administrative(address, bankAccount, departmentID, employmentDate, familyRelationship,
//						name, phoneNumber, EmployeePosition.values()[positionId], residentRegistrationNumber, salary);
//				m_Employee.setId(id);
//			} else if (idString.matches("600030\\d+")) {
//				m_Employee = new Compensation(address, bankAccount, departmentID, employmentDate, familyRelationship,
//						name, phoneNumber, EmployeePosition.values()[positionId], residentRegistrationNumber, salary);
//				m_Employee.setId(id);
//			} else if (idString.matches("600040\\d+")) {
//				m_Employee = new CustommerSupport(address, bankAccount, departmentID, employmentDate,
//						familyRelationship, name, phoneNumber, EmployeePosition.values()[positionId],
//						residentRegistrationNumber, salary);
//				m_Employee.setId(id);
//			} else if (idString.matches("600050\\d+")) {
//				m_Employee = new ManagementPlanning(address, bankAccount, departmentID, employmentDate,
//						familyRelationship, name, phoneNumber, EmployeePosition.values()[positionId],
//						residentRegistrationNumber, salary);
//				m_Employee.setId(id);
//			} else if (idString.matches("600060\\d+")) {
//				m_Employee = new HumanResource(address, bankAccount, departmentID, employmentDate, familyRelationship,
//						name, phoneNumber, EmployeePosition.values()[positionId], residentRegistrationNumber, salary);
//				m_Employee.setId(id);
//			} else if (idString.matches("600070\\d+")) {
//				m_Employee = new CustomerInformationManagement(address, bankAccount, departmentID, employmentDate,
//						familyRelationship, name, phoneNumber, EmployeePosition.values()[positionId],
//						residentRegistrationNumber, salary);
//				m_Employee.setId(id);
//			} else if (idString.matches("600080\\d+")) {
//				m_Employee = new HumanResource(address, bankAccount, departmentID, employmentDate, familyRelationship,
//						name, phoneNumber, EmployeePosition.values()[positionId], residentRegistrationNumber, salary);
//				m_Employee.setId(id);
//			} else if (idString.matches("600090\\d+")) {
//				// 추가해야함
//				// performance
//				// previousMonthEvaluation
//				m_Employee = new Sales(address, bankAccount, departmentID, employmentDate, familyRelationship, name,
//						phoneNumber, EmployeePosition.values()[positionId], residentRegistrationNumber, salary);
//				m_Employee.setId(id);
//			} else if (idString.matches("600100\\d+")) {
//				m_Employee = new Underwriting(address, bankAccount, departmentID, employmentDate, familyRelationship,
//						name, phoneNumber, EmployeePosition.values()[positionId], residentRegistrationNumber, salary);
//				m_Employee.setId(id);
//			} else if (idString.matches("600110\\d+")) {
//				m_Employee = new CompensationPlanning(address, bankAccount, departmentID, employmentDate,
//						familyRelationship, name, phoneNumber, EmployeePosition.values()[positionId],
//						residentRegistrationNumber, salary);
//				m_Employee.setId(id);
//			} else if (idString.matches("600120\\d+")) {
//				m_Employee = new ContractManagement(address, bankAccount, departmentID, employmentDate,
//						familyRelationship, name, phoneNumber, EmployeePosition.values()[positionId],
//						residentRegistrationNumber, salary);
//				m_Employee.setId(id);
//			} else if (idString.matches("600130\\d+")) {
//				m_Employee = new LoanManagement(address, bankAccount, departmentID, employmentDate, familyRelationship,
//						name, phoneNumber, EmployeePosition.values()[positionId], residentRegistrationNumber, salary);
//				m_Employee.setId(id);
//			}
//			m_Employee.initialize(this);
//			employeeList.add(m_Employee);
//		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	public void finalize() throws Throwable {
		employeeList.clear();
		this.scanner.close();
	}

	/**
	 * 
	 * @param employee
	 */
	public void add(Employee employee) {

//		boolean hasDummy = false;
//		for (int i = 0; i < this.employeeList.size(); i++) {
//			if (this.employeeList.get(i) == null) {
//				hasDummy = true;
//				String id = "" + employee.getId() + i;
//				employee.setId(Integer.parseInt(id));
//				this.employeeList.set(i, employee);
//				break;
//			}
//		}
//		if(!hasDummy) {
//			this.employeeList.add(employee);
//		}
//
//		try {
//			this.fileWriter = new FileWriter(new File(filePath), true);
//			this.printWriter = new PrintWriter(fileWriter);
//
//			employee.setId(Integer.parseInt(employee.getId() + "" + employeeList.size()));
//			printWriter.println();
//			printWriter.print(employee.getId() + " ");
//			printWriter.print(employee.getAddress() + " ");
//			printWriter.print(employee.getBankAccount() + " ");
//			printWriter.print(employee.getDepartmentID() + " ");
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//			String formattedDate = sdf.format(employee.getEmploymentDate());
//			printWriter.print(formattedDate + " ");
//			printWriter.print(1 + " ");
//			printWriter.print(employee.getName() + " ");
//			printWriter.print(employee.getPhoneNumber() + " ");
//			printWriter.print(employee.getPosition().ordinal() + " ");
//			printWriter.print(employee.getResidentRegistrationNumber() + " ");
//			printWriter.print(employee.getSalary());
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		printWriter.close();
	}

	/**
	 * 
	 * @param id
	 */
	public void delete(int id) {

//		try {
//			fileWriter = new FileWriter(file, false);
//			printWriter = new PrintWriter(fileWriter);
//
//			int j = 0;
//			for (Employee e : employeeList) {
//				if(e == null) {
//					continue;
//				}
//				if (e.getId() == id) {
//					this.employeeList.set(j, null);
//				} else {
//					if (j > 0) {
//						printWriter.println();
//					}
//					printWriter.print(e.getId() + " ");
//					printWriter.print(e.getAddress() + " ");
//					printWriter.print(e.getBankAccount() + " ");
//					printWriter.print(e.getDepartmentID() + " ");
//					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//					String formattedDate = sdf.format(e.getEmploymentDate());
//					printWriter.print(formattedDate + " ");
//					printWriter.print(1 + " ");
//					printWriter.print(e.getName() + " ");
//					printWriter.print(e.getPhoneNumber() + " ");
//					printWriter.print(e.getPosition().ordinal() + " ");
//					printWriter.print(e.getResidentRegistrationNumber() + " ");
//					printWriter.print(e.getSalary());
//					j++;
//				}
//			}
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} // Open file in overwrite mode
//
//		printWriter.close();

	}

	/**
	 * 
	 * @param id
	 */
	public Employee get(int id) {
//		for (Employee e : employeeList) {
//			if (e != null && e.getId() == id) {
//				return e;
//			}
//		}
		return null;
	}

	/**
	 * 
	 * @param id
	 */
	public void update(int id, Scanner scanner) {
//		Employee employee = null;
//		for (Employee e : employeeList) {
//			if (e != null && e.getId() == id) {
//				employee = e;
//				break;
//			}
//		}
//		if (employee == null) {
//			System.out.println("Not exist employee");
//			return;
//		}
//
//		int index = 0;
//		while (index != 9) {
//			System.out.println("Please select an item to update.");
//			System.out.println(
//					"1.Name 2.Phone Number 3.Address 4.Bank Account 5.DepartmentID 6.FamilyList 7.Position 8.Salary 9.Cancel");
//			try {
//				String input = scanner.next();
//				index = Integer.parseInt(input);
//				switch (index) {
//				case 1:
//					changeName(employee, scanner);
//					break;
//				case 2:
//					changePhoneNumber(employee, scanner);
//					break;
//				case 3:
//					changeAddress(employee, scanner);
//					break;
//				case 4:
//					changeBankAccount(employee, scanner);
//					break;
//				case 5:
//					changeDepartmentID(employee, scanner);
//					break;
//				case 6:
//					changeFamilyList(employee, scanner);
//					break;
//				case 7:
//					changePosition(employee, scanner);
//					break;
//				case 8:
//					changeSalary(employee, scanner);
//					break;
//				case 9:
//					break;
//				default:
//					System.out.println("Please select in 1~9.");
//				}
//
//			} catch (Exception e) {
//				System.out.println("Please input number.");
//			}
//		}

	}

	private void changeName(Employee employee, Scanner scanner) {
//		System.out.println("Please input name.");
//
//		String input = scanner.next();
//		while (!Pattern.matches("^\\D+$", input.trim())) {
//			System.out.println("Please input String.");
//			input = scanner.next();
//		}
//		employee.setName(input);
//
//		try {
//			fileWriter = new FileWriter(file, false);
//			printWriter = new PrintWriter(fileWriter);
//
//			int i = 0;
//			for (Employee e : employeeList) {
//				if(e == null) {
//					continue;
//				}
//				if (i > 0) {
//					printWriter.println();
//				}
//				printWriter.print(e.getId() + " ");
//				printWriter.print(e.getAddress() + " ");
//				printWriter.print(e.getBankAccount() + " ");
//				printWriter.print(e.getDepartmentID() + " ");
//				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//				String formattedDate = sdf.format(e.getEmploymentDate());
//				printWriter.print(formattedDate + " ");
//				printWriter.print(1 + " ");
//				printWriter.print(e.getName() + " ");
//				printWriter.print(e.getPhoneNumber() + " ");
//				printWriter.print(e.getPosition().ordinal() + " ");
//				printWriter.print(e.getResidentRegistrationNumber() + " ");
//				printWriter.print(e.getSalary());
//				i++;
//			}
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} // Open file in overwrite mode
//
//		printWriter.close();

	}

	private void changePhoneNumber(Employee employee, Scanner scanner) {
		System.out.println("Please input PhoneNumber.");

	}

	private void changeAddress(Employee employee, Scanner scanner) {
		System.out.println("Please input Address.");

	}

	private void changeBankAccount(Employee employee, Scanner scanner) {
		System.out.println("Please input Bank Account.");

	}

	private void changeDepartmentID(Employee employee, Scanner scanner) {
		System.out.println("Please input DepartmentID.");

	}

	private void changeFamilyList(Employee employee, Scanner scanner) {
		System.out.println("Please input FamilyList.");

	}

	private void changePosition(Employee employee, Scanner scanner) {
		System.out.println("Please input Position.");

	}

	private void changeSalary(Employee employee, Scanner scanner) {
		System.out.println("Please input Salary.");
	}
}