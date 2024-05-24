package product;

/**
 * @author ����ȯ
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:22
 */
public class Collateral extends Loan {

	private CollateralType collateralType;
	private int minimumValue;
	public CollateralType m_CollateralType;

	public Collateral() {
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}