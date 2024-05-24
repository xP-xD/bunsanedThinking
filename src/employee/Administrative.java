package employee;

/**
 * @author Administrator
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:22
 */
public class Administrative extends Employee {

	public static String serialNumber = "020";
	
	public Administrative(Employee uploadEmployeeData) {
	}
	
	public void initialize() {
	}
	
	@Override
	public boolean work(int index) {
		
		switch (index) {
		case 1:
			addOfficeSupply();
			return true;
		case 2:
			deleteOfficeSupply();
			return true;
		case 3:
			getOfficeSupply();
			return true;
		case 4:
			updateOfficeSupply();
			return true;
		case 5:
			return true;
		default:
			return false;
		}
	}
	
	public void addOfficeSupply(){
		System.out.println("Add OfficeSupply");
	}

	public void deleteOfficeSupply(){
		System.out.println("Delete OfficeSupply");
	}

	public void getOfficeSupply(){
		System.out.println("Get OfficeSupply");
	}

	public void updateOfficeSupply(){
		System.out.println("Update OfficeSupply");
	}

}