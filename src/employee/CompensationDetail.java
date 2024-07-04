package employee;

import java.util.Date;

/**
 * @author ����ȯ
 * @version 1.0
 * @created 27-5-2024 ���� 4:40:40
 */
public class CompensationDetail {

	private int contractID;
	private int id;
	private int money;
	private Date paymentDate;

	public CompensationDetail(int contractId, int money){
		this.contractID = contractId;
		this.money = money;
		this.paymentDate = new Date();
	}
	
	public CompensationDetail(CompensationDetail compensationDetail) {
		this.id = compensationDetail.getId();
		this.contractID = compensationDetail.getContractId();
		this.money = compensationDetail.getMoney();
		this.paymentDate = (Date) compensationDetail.getPaymentDate().clone();
	}

	public CompensationDetail clone() {
		return new CompensationDetail(this);
	}

	public void finalize() throws Throwable {

	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Date getPaymentDate() {
		return this.paymentDate;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getContractId() {
		return this.contractID;
	}
	
	public int getMoney() {
		return this.money;
	}

}