package employee;

/**
 * @author Administrator
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:29
 */
public class Underwriting extends Employee {

	public Reinsurance m_Reinsurance;
	public JointAcquisition m_JointAcquisition;
	
	public static String serialNumber = "100";

	public Underwriting(Employee uploadEmployeeData){
	}
	
	public void initialize() {
	}
	
	@Override
	public boolean work(int index) {
		
		switch (index) {
		case 1:
			applyCoperation();
			return true;
		case 2:
			applyReinsurance();
			return true;
		case 3:
			reviewAcquisition();
			return true;
		case 4:
			return true;
		default:
			return false;
		}
	}

	public void applyCoperation(){
		System.out.println("Apply Coperation");
	}

	public void applyReinsurance(){
		System.out.println("Apply Reinsurance");
	}

	public void reviewAcquisition(){
		System.out.println("Review Acquisition");
	}

}