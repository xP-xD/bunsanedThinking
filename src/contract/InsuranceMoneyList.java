package contract;


/**
 * @author KimChan
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:25
 */
public interface InsuranceMoneyList {

	/**
	 * 
	 * @param insuranceMoney
	 */
	public void add(InsuranceMoney insuranceMoney);

	/**
	 * 
	 * @param id
	 */
	public void delete(int id);

	/**
	 * 
	 * @param id
	 */
	public InsuranceMoney get(int id);

	/**
	 * 
	 * @param id
	 */
	public void update(int id);
	
	public void initialize();
	
	public void run();
	
	public void finalize() throws Throwable;

}