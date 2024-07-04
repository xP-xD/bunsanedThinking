package product.loan;

import product.Product;

/**
 * @author ����ȯ
 * @version 1.0
 * @created 27-5-2024 ���� 4:40:42
 */

//2024-06-02 김대현
//2024-06-04 김대현
public class FixedDeposit extends Loan {

	private int minimumAmount;

	public FixedDeposit(LoanType loanType, String name, int interestRate, int limit, int minimumAsset, int minimumValue){
		this.setLoanType(loanType);
		this.setName(name);
		this.setInterestRate(interestRate);
		this.setLimit(limit);
		this.setMinimumAsset(minimumAsset);
		this.setMinimumAmount(minimumAsset);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public int getMinimumAmount() {
		return minimumAmount;
	}

	public void setMinimumAmount(int minimumAmount) {
		this.minimumAmount = minimumAmount;
	}
	
	@Override
	public Product clone() {
		FixedDeposit fixedDepositLoan = new FixedDeposit(getLoanType(), getName(),getInterestRate(), getLimit(), getMinimumAsset(), getMinimumAmount());
		fixedDepositLoan.setId(getId());
		return fixedDepositLoan;
	}

}