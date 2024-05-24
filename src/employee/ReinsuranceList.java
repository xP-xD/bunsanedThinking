package employee;

/**
 * @author KimChan
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:28
 */
public interface ReinsuranceList {

	/**
	 * 
	 * @param reinsurance
	 */
	public void add(Reinsurance reinsurance);

	/**
	 * 
	 * @param id
	 */
	public void delete(int id);

	/**
	 * 
	 * @param id
	 */
	public Reinsurance get(int id);

	/**
	 * 
	 * @param id
	 */
	public void update(int id);
	
	public void initialize();
	
	public void run();
	
	public void finalize() throws Throwable;

}