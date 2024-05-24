package employee;


/**
 * @author KimChan
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:27
 */
public interface PaymentDetailList {

	/**
	 * 
	 * @param paymentDetail
	 */
	public void add(PaymentDetail paymentDetail);

	/**
	 * 
	 * @param id
	 */
	public void delete(int id);

	/**
	 * 
	 * @param id
	 */
	public PaymentDetail get(int id);

	/**
	 * 
	 * @param id
	 */
	public void update(int id);

	
	public void initialize();
	
	public void run();
	
	public void finalize() throws Throwable;
}