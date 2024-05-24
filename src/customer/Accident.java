package customer;

import java.util.Date;

import product.ServiceType;

/**
 * @author ����ȯ
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:21
 */
public class Accident {

	private int customerID;
	private Date date;
	private int id;
	private String location;
	private AccidentProcessStatus processStatus;
	private ServiceType serviceType;
	private Date time;
	public AccidentProcessStatus m_AccidentProcessStatus;

	public Accident(){

	}

	public void finalize() throws Throwable {

	}

	public void report(){

	}

}