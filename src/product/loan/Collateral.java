package product.loan;

import product.Product;

/**
 * @author ����ȯ
 * @version 1.0
 * @created 27-5-2024 ���� 4:40:40
 */
//2024-06-02 김대현
public class Collateral extends Loan {

	private CollateralType collateralType;
	private int minimumValue;

	public Collateral(LoanType loanType, String name, int interestRate, int limit, int minimumAsset,
			CollateralType collateralType, int minimumValue) {
		this.setLoanType(loanType);
		this.setName(name);
		this.setInterestRate(interestRate);
		this.setLimit(limit);
		this.setMinimumAsset(minimumAsset);
		this.setCollateralType(collateralType);
		this.setMinimumValue(minimumValue);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public CollateralType getCollateralType() {
		return collateralType;
	}

	public void setCollateralType(CollateralType collateralType) {
		this.collateralType = collateralType;
	}

	public int getMinimumValue() {
		return minimumValue;
	}

	public void setMinimumValue(int minimumValue) {
		this.minimumValue = minimumValue;
	}
	
	@Override
	public Product clone() {
		Collateral collateralLoan = new Collateral(getLoanType(), getName(),getInterestRate(), getLimit(), getMinimumAsset(), getCollateralType() ,getMinimumValue());
		collateralLoan.setId(getId());
		return collateralLoan;
	}

}