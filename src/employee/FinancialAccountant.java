package employee;

/**
 * @author Administrator
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:25
 */
public class FinancialAccountant extends Employee {

	public static String serialNumber = "010";

	public FinancialAccountant(Employee uploadEmployeeData) {

	}

	public boolean work(int index) {
		
		switch (index) {
		case 1:
			getDepositDetail();
			return true;
		case 2:
			getTaxPaymentDetail();
			return true;
		case 3:
			handlePayment();
			return true;
		case 4:
			return true;
		default:
			return false;
		}
	}

	public void getDepositDetail() {
		System.out.println("Get DepositDetail");
	}

	public void getTaxPaymentDetail() {
		System.out.println("Get TaxPaymentDetail");
	}

	public void handlePayment() {
		System.out.println("Handle Payment");
	}

}