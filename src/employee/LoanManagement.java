package employee;

/**
 * @author Administrator
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:26
 */
public class LoanManagement extends Employee {

	public static String serialNumber = "130";

	public LoanManagement(Employee uploadEmployeeData) {
	}

	@Override
	public boolean work(int index) {
		
		switch (index) {
		case 1:
			addLoanProduct();
			return true;
		case 2:
			collectLoanPrincipalInterest();
			return true;
		case 3:
			deleteLoanProduct();
			return true;
		case 4:
			getLoanProduct();
			return true;
		case 5:
			requestLoan();
			return true;
		case 6:
			updateLoanProduct();
			return true;
		case 7:
			return true;
		default:
			return false;
		}
	}

	public void addLoanProduct() {
		System.out.println("Add Loan Product");
	}

	public void collectLoanPrincipalInterest() {
		System.out.println("Collect Loan Principal Interest");
	}

	public void deleteLoanProduct() {
		System.out.println("Delete Loan Product");
	}

	public void getLoanProduct() {
		System.out.println("Get Loan Product");
	}

	public void requestLoan() {
		System.out.println("Request Loan");
	}

	public void updateLoanProduct() {
		System.out.println("Update Loan Product");
	}

}