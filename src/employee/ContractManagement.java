package employee;

/**
 * @author Administrator
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:23
 */
public class ContractManagement extends Employee {
	
	public static String serialNumber = "120";

	public ContractManagement(Employee uploadEmployeeData) {
	}
	
	public void initialize() {
	}
	
	public boolean work(int index) {
		
		switch (index) {
		case 1:
			handlePayment();
			return true;
		case 2:
			requestTerminationFee();
			return true;
		case 3:
			reviewEndorsement();
			return true;
		case 4:
			reviewRecontract();
			return true;
		case 5:
			reviewRevival();
			return true;
		case 6:
			return true;
		default:
			return false;
		}
		
	}

	public void handlePayment(){
		System.out.println("Handle Payment");
	}

	public void requestTerminationFee(){
		System.out.println("Request Termination Fee");
	}

	public void reviewEndorsement(){
		System.out.println("Review Endorsement");
	}

	public void reviewRecontract(){
		System.out.println("Review Recontract");
	}

	public void reviewRevival(){
		System.out.println("Review Revival");
	}

}