package product.loan;

import product.Product;

/**
 * @author ����ȯ
 * @version 1.0
 * @created 27-5-2024 ���� 4:40:42
 */

//2024-06-02 김대현
//2024-06-04 김대현
public class InsuranceContract extends Loan {

	private int productID;

	public InsuranceContract(LoanType loanType, String name, int interestRate, int limit, int minimumAsset,
			int parameter) {
		this.setLoanType(loanType);
		this.setName(name);
		this.setInterestRate(interestRate);
		this.setLimit(limit);
		this.setMinimumAsset(minimumAsset);
		this.setProductID(parameter);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	@Override
	public Product clone() {
		InsuranceContract insuranceContractLoan = new InsuranceContract(getLoanType(), getName(),getInterestRate(), getLimit(), getMinimumAsset(),getProductID());
		insuranceContractLoan.setId(getId());
		return insuranceContractLoan;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

}