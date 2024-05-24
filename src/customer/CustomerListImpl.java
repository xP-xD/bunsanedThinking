package customer;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerListImpl implements CustomerList {

	private ArrayList<Customer> customerList;
	public Customer m_Customer;

	private Scanner scanner;
	private File file;
	private String filePath = "data/customer";
	private FileWriter fileWriter;
	private PrintWriter printWriter;
	
	public CustomerListImpl(){
		customerList = new ArrayList<Customer>();
//		
//		try {
//			file = new File(filePath);
//			this.scanner = new Scanner(file);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	public void initialize() {

		while (scanner.hasNextLine()) {
			int id = scanner.nextInt();
			String name = scanner.next();
			String address = scanner.next();
			String bankAccount = scanner.next();
			String phoneNumber = scanner.next();
			String job = scanner.next();
			long property = scanner.nextLong();
			String residentRegistrationNumber = scanner.next();
			
			DiseaseHistoryList diseaseHistory = new DiseaseHistoryListImpl();
			SurgeryHistoryList surgeryHistory = new SurgeryHistoryListImpl();
			AccidentHistoryList accidentHistory = new AccidentHistoryListImpl();

			String idString = Integer.toString(id);
//			if (idString.matches("200\\d+")) {
//				m_Customer = new HumanResource(address, bankAccount, departmentID, employmentDate, familyRelationship, name,
//						phoneNumber, EmployeePosition.values()[positionId], residentRegistrationNumber, salary);
//				m_Employee.setId(id);
//			}
//			employeeList.add(m_Employee);
		}
	}
	public void run() {
        System.out.println("Running CustomerListImpl..."); //이게 맞나?
    }
	public void finalize() throws Throwable {
		customerList.clear();
	}

	public void add(Customer customer){
//		for (int i = 0; i < this.customerList.size(); i++) {
//			if (this.customerList.get(i) == null) {
//				String id = "" + customer.getId() + i;
//				customer.setId(Integer.parseInt(id));
//				this.customerList.set(i, customer);
//				return;
//			}
//		}
//		String id = "" + customer.getId() + this.customerList.size();
//		customer.setId(Integer.parseInt(id));
//		this.customerList.add(customer);
	}

	/**
	 * 
	 * @param id
	 */
	public void delete(int id){
//		for (int i = 0; i < this.customerList.size(); i++) {
//			if (this.customerList.get(i).getId() == id) {
//				this.customerList.set(i, null);
//			}
//		}
	}

	/**
	 * 
	 * @param id
	 */
	public Customer get(int id){
//		for (int i = 0; i < this.customerList.size(); i++) {
//			if (this.customerList.get(i).getId() == id) {
//				return this.customerList.get(i);
//			}
//		}
		return null;
	}

	/**
	 * 
	 * @param id
	 */
	public void update(int id){
//		Scanner updateScanner = new Scanner(System.in);
//		Customer customer = null;
//		for (int i = 0; i < this.customerList.size(); i++) {
//			if (this.customerList.get(i).getId() == id) {
//				customer = this.customerList.get(i);
//			}
//		}
//		if (customer == null) {
//			System.out.println("Not exist customer");
//			updateScanner.close();
//			return;
//		}
//		
//		System.out.println("Please select an item to update.");
//		System.out.println(
//				"1.Name 2.PhoneNumber 3.Address 4.BankAccount 5.Job 6.Property 7.DiseaseHistory 8.AccidentHistory 9.SurgeryHistory 10.Cancel");
//		int index = 0;
//		while (index != 10) {
//			try {
//				String input = updateScanner.next();
//				index = Integer.parseInt(input);
//				switch (index) {
//				case 1:
//					System.out.println("Name");
//					changeName(customer);
//					break;
//				case 2:
//					System.out.println("PhoneNumber");
//					changePhoneNumber(customer);
//					break;
//				case 3:
//					System.out.println("Address");
//					changeAddress(customer);
//					break;
//				case 4:
//					System.out.println("BankAccount");
//					changeBankAccount(customer);
//					break;
//				case 5:
//					System.out.println("Job");
//					changeJob(customer);
//					break;
//				case 6:
//					System.out.println("Property");
//					changeProperty(customer);
//					break;
//				case 7:
//					System.out.println("DiseaseHistory");
//					changeDiseaseHistory(customer);
//					break;
//				case 8:
//					System.out.println("AccidentHistory");
//					changeAccidentHistory(customer);
//					break;
//				case 9:
//					System.out.println("SurgeryHistory");
//					changeSurgeryHistory(customer);
//					break;
//				case 10:
//					System.out.println("Cancel");
//					break;
//				default:
//					System.out.println("Please select in 1~10.");
//				}
//
//			} catch (Exception e) {
//				System.out.println("Please input number.");
//			}
//		}
//		updateScanner.close();
	}
	private void changeName(Customer customer) {
//		System.out.println("Please input Name.");
//		
//        String input = scanner.next();
//        while (!Pattern.matches("^\\D+$", input.trim())) {
//            System.out.println("Please input a valid name.");
//            input = scanner.next();
//        }
//        customer.setName(input);
	}
	private void changePhoneNumber(Customer customer) {
		System.out.println("Please input PhoneNumber.");
		
	}
	private void changeAddress(Customer customer) {
		System.out.println("Please input Address.");
		
	}
	private void changeBankAccount(Customer customer) {
		System.out.println("Please input BankAccount.");
		
	}
	private void changeJob(Customer customer) {
		System.out.println("Please input Job.");
		
	}
	private void changeProperty(Customer customer) {
		System.out.println("Please input Property.");
		
	}
	private void changeDiseaseHistory(Customer customer) {
		System.out.println("Please input DiseaseHistory.");
		
	}
	private void changeAccidentHistory(Customer customer) {
		System.out.println("Please input AccidentHistory.");
		
	}
	private void changeSurgeryHistory(Customer customer) {
		System.out.println("Please input SurgeryHistory.");
		
	}
}







