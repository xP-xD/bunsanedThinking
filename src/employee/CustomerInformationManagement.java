package employee;

import java.util.Scanner;

import customer.Customer;
import customer.CustomerList;

/**
 * @author Administrator
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:23
 */
public class CustomerInformationManagement extends Employee {

	public static String serialNumber = "070";
	private CustomerList customerList;
	
	public CustomerInformationManagement(Employee uploadEmployeeData) {
	}
	
	public void initialize(CustomerList customerList) {
		this.customerList = customerList;
	}
	
	@Override
	public boolean work(int index) {
		
		switch (index) {
		case 1:
			addCustomerInformation();
			return true;
		case 2:
			deleteCustomerInformation();
			return true;
		case 3:
			getCustomerInformation();
			return true;
		case 4:
			updateCustomerInformation();
			return true;
		case 5:
			return true;
		default:
			return false;
		}
		
	}

	public void addCustomerInformation(){
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Please input Customer Information");
			/*
			 * Customer ���� �Է¹ޱ�
			 */
//			Customer customer = new Customer();
//			this.customerList.add(customer);
		} catch (Exception e) {
			System.out.println("Inpurt Error");
		}
		scanner.close();
	}

	public void deleteCustomerInformation(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input Customer ID want to delete");
		String input;
		int id = -1;
		boolean isNumeric = false;
		while(!isNumeric) {
			input = scanner.next();
			if (input.chars().allMatch(Character::isDigit)) {
				isNumeric = true;
				id = Integer.parseInt(input);
			} else {
				System.out.println("Please input number.");
			}
		}
		if (id != -1) {
			this.customerList.delete(id);
		}
		scanner.close();
	}

	public void getCustomerInformation(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input Customer ID want to get");
		String input;
		int id = -1;
		boolean isNumeric = false;
		while(!isNumeric) {
			input = scanner.next();
			if (input.chars().allMatch(Character::isDigit)) {
				isNumeric = true;
				id = Integer.parseInt(input);
			} else {
				System.out.println("Please input number.");
			}
		}
		Customer customer = null;
		if (id != -1) {
			customer = customerList.get(id);
		}
		if (customer != null) {
			/*
			 * �� ���� ���
			 */
//			System.out.println("ID : " + customer.getId());
//			System.out.println("Name : " + customer.getName());
//			System.out.println("Phone Number : " + customer.getPhoneNumber());
		}
		scanner.close();
	}

	public void updateCustomerInformation(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input Customer ID want to update");
		String input;
		int id = -1;
		boolean isNumeric = false;
		while(!isNumeric) {
			input = scanner.next();
			if (input.chars().allMatch(Character::isDigit)) {
				isNumeric = true;
				id = Integer.parseInt(input);
			} else {
				System.out.println("Please input number.");
			}
		}
		if (id != -1) {
			this.customerList.update(id);
		}
		scanner.close();
	}

}