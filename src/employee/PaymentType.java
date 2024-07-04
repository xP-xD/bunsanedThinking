package employee;

/**
 * @author ����ȯ
 * @version 1.0
 * @created 27-5-2024 ���� 4:40:43
 */
public enum PaymentType {

	Cash("현금"), AccountTransfer("계좌이체");

	private String name;

	PaymentType(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}