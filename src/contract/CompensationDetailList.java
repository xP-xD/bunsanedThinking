package contract;


/**
 * @author KimChan
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:22
 */
public interface CompensationDetailList {

	/**
	 * 
	 * @param compensationDetail
	 */
	public void add(CompensationDetail compensationDetail);

	/**
	 * 
	 * @param id
	 */
	public void delete(int id);

	/**
	 * 
	 * @param id
	 */
	public CompensationDetail get(int id);

	/**
	 * 
	 * @param id
	 */
	public void update(int id);
	
	public void initialize();
	
	public void run();
	
	public void finalize() throws Throwable;

}