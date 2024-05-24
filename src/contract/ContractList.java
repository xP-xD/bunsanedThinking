package contract;


/**
 * @author KimChan
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:23
 */
public interface ContractList {

	/**
	 * 
	 * @param contract
	 */
	public void add(Contract contract);

	/**
	 * 
	 * @param id
	 */
	public void delete(int id);

	/**
	 * 
	 * @param id
	 */
	public Contract get(int id);

	/**
	 * 
	 * @param id
	 */
	public void update(int id);
	
	public void initialize();
	
	public void run();
	
	public void finalize() throws Throwable;

}