package employee;

/**
 * @author Administrator
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:22
 */
public class CompensationPlanning extends Employee {

	public static String serialNumber = "110";

	public CompensationPlanning(Employee uploadEmployeeData) {
	}

	public void initialize() {
	}

	@Override
	public boolean work(int index) {

		switch (index) {
		case 1:
			addPartnerCompany();
			return true;
		case 2:
			deletePartnerCompany();
			return true;
		case 3:
			evaluatePartnerCompany();
			return true;
		case 4:
			getPartnerCompany();
			return true;
		case 5:
			updatePartnerCompany();
			return true;
		case 6:
			return true;
		default:
			return false;
		}
	}

	public void addPartnerCompany() {
		System.out.println("Add PartnerCompany");
	}

	public void deletePartnerCompany() {
		System.out.println("Delete PartnerCompany");
	}

	public void evaluatePartnerCompany() {
		System.out.println("Evaluate PartnerCompany");
	}

	public void getPartnerCompany() {
		System.out.println("Get PartnerCompany");
	}

	public void updatePartnerCompany() {
		System.out.println("Update PartnerCompany");
	}

}