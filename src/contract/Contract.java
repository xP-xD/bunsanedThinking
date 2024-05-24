package contract;

import java.util.Date;

import product.Product;

/**
 * @author ����ȯ
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:23
 */
public class Contract {

	private CompensationDetail compensationDetail;
	private ContractStatus contractStatus;
	private int customerID;
	private Date date;
	private DepositDetailList depositDetailList;
	private int employeeID;
	private Date expirationDate;
	private int id;
	private InsuranceMoneyList insuranceMoneyList;
	private Date paymentDate;
	private Product product;
	public ContractStatus m_ContractStatus;
	public DepositDetailListImpl m_DepositDetailListImpl;
	public InsuranceMoneyListImpl m_InsuranceMoneyListImpl;
	public CompensationDetailListImpl m_CompensationDetailListImpl;

	public Contract(){

	}

	public void finalize() throws Throwable {

	}

	public void manage(){

	}

	public void review(){

	}

}