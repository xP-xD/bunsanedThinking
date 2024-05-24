package customer;


/**
 * @author KimChan
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:28
 */
public interface SurgeryHistoryList {

	/**
	 * 
	 * @param surgeryHistory
	 */
	public void add(SurgeryHistory surgeryHistory);

	/**
	 * 
	 * @param id
	 */
	public void delete(int id);

	/**
	 * 
	 * @param id
	 */
	public SurgeryHistory get(int id);

	public void update(int id);
	
	public void initialize();
	
	public void run();
	
	public void finalize() throws Throwable;

}