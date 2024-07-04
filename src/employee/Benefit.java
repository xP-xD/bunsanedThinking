package employee;

/**
 * @author ����ȯ
 * @version 1.0
 * @created 27-5-2024 ���� 4:40:40
 */
public class Benefit extends PaymentDetail {

	private int employeeID;
	private Benefit type;

	public Benefit(String accountHolder, String bank, String bankAccount, int money, PaymentType paymentType,
			int contractId) {
		super(accountHolder, bank, bankAccount, money, paymentType, contractId);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}