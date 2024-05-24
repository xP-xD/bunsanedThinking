package employee;

/**
 * @author Administrator
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:22
 */
public class Compensation extends Employee {

	public static String serialNumber = "030";
	
	public Compensation(Employee uploadEmployeeData) {
	}
	
	public void initialize() {
	}
	
	@Override
	public boolean work(int index) {
		switch (index) {
		case 1:
			requestCompensation();
			return true;
		case 2:
			return true;
		default:
			return false;
		}
	}

	public void requestCompensation(){
		System.out.println("Request Compensation");
	}

}