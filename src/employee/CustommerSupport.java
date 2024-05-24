package employee;

/**
 * @author Administrator
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:24
 */
public class CustommerSupport extends Employee {

	public static String serialNumber = "040";
	
	public CustommerSupport(Employee uploadEmployeeData) {
	}
	
	public void initialize() {
	}
	
	@Override
	public boolean work(int index) {
		
		switch (index) {
		case 1:
			handleComplaint();
			return true;
		case 2:
			handleReport();
			return true;
		case 3:
			return true;
		default:
			return false;
		}
	}

	public void handleComplaint(){
		System.out.println("Handle Complaint");
	}

	public void handleReport(){
		System.out.println("Handle Report");
	}

}