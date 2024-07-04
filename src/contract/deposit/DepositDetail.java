package contract.deposit;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ����ȯ
 * @version 1.0
 * @created 27-5-2024 ���� 4:40:41
 */
public class DepositDetail {

	public static final int DEPOSIT_DETAIL_SERIAL = 810;
	private int contractID;
	private Date date;
	private String depositorName;
	private int id;
	private int money;
	private DepositPath path;

	public DepositDetail(String depositorName, int contractId, int money, DepositPath path){
		this.contractID = contractId;
		this.date = new Date();
		this.depositorName = depositorName;
		this.money = money;
		this.path = path;
	}
	
	private DepositDetail(DepositDetail depositDetail) {
		this.contractID = depositDetail.getContractId();
		this.date = (Date) depositDetail.date.clone();
		this.depositorName = depositDetail.getDepositorName() + "";
		this.id = depositDetail.getId();
		this.money = depositDetail.getMoney();
		this.path = depositDetail.getPath();
		
	}
	
	public DepositDetail clone() {
		return new DepositDetail(this);
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getContractId() {
		return this.contractID;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(this.date);
	}
	
	public String getDepositorName() {
		return this.depositorName;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public DepositPath getPath() {
		return this.path;
	}

	public void finalize() throws Throwable {

	}
}