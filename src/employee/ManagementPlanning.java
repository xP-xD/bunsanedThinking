package employee;

/**
 * @author Administrator
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:26
 */
public class ManagementPlanning extends Employee {

	public static String serialNumber = "050"; 
	
	public ManagementPlanning(Employee uploadEmployeeData) {
	}
	
	@Override
	public boolean work(int index) {
		
		switch (index) {
		case 1:
			addDepartment();
			return true;
		case 2:
			deleteDepartment();
			return true;
		case 3:
			getDepartment();
			return true;
		case 4:
			updateDepartment();
			return true;
		case 5:
			return true;
		default:
			return false;
		}
	}

	public void addDepartment(){
		System.out.println("Add Department");
	}

	public void deleteDepartment(){
		System.out.println("Delete Department");
	}

	public void getDepartment(){
		System.out.println("Get Department");
	}

	public void updateDepartment(){
		System.out.println("Update Department");
	}

}