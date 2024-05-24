package product;

import java.util.Scanner;

/**
 * @author ����ȯ
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:26
 */
public class Loan extends Product {

	private int interestRate;
	private LoanType loanType;
	private int minimumAsset;
	private int monthlyIncome;
	public LoanType m_LoanType;

	public Loan() {
	}
	
	public void initialize() {
		
	}
	
	public void run(Scanner scanner, int id) {
		System.out.println("Welcome!. Please select Loan task.");
		String idString = Integer.toString(id);
		int index = 0;
		String input;
		if(idString.matches("600060\\d+")) {
			while (index != 6) {
				System.out.println("1. Add Loan Product 2. Update Loan Product 3. Delete Loan Product 4. Get Loan Product 5. View Loan Product 6. Cancel");
				try {
					input = scanner.next();
					index = Integer.parseInt(input);
					switch (index) {
					case 1:
						add();
						break;
					case 2:
						update();
						break;
					case 3:
						delete();
						break;
					case 4:
						get();
						break;
					case 5:
						view();
						break;
					case 6:
						break;
					default:
						System.out.println("Please select in 1~6.");
					}

				} catch (Exception e) {
					System.out.println("Please input number.");
				}
			}
		}else if(idString.matches("200\\d+")) {
			while (index != 2) {
				System.out.println("1. Buy Loan Product 2. Cancel");
				try {
					input = scanner.next();
					index = Integer.parseInt(input);
					switch (index) {
					case 1:
						buy();
						break;
					case 2:
						break;
					default:
						System.out.println("Please select in 1~2.");
					}
				} catch (Exception e) {
					System.out.println("Please input number.");
				}
			}
		}
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void add(){
		System.out.println("Add");
	}

	public void delete(){
		System.out.println("Delete");
	}

	public void get(){
		System.out.println("Get");
	}

	public void update(){
		System.out.println("Update");
	}

	public void view(){
		System.out.println("View");
	}
	
	public void buy(){
		System.out.println("Buy");
	}

}