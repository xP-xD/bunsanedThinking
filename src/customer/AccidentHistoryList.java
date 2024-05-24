package customer;


/**
 * @author KimChan
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:21
 */
public interface AccidentHistoryList {

	/**
	 * 
	 * @param accidentHistory
	 */
	public void add(AccidentHistory accidentHistory);

	/**
	 * 
	 * @param id
	 */
	public void delete(int id);

	/**
	 * 
	 * @param id
	 */
	public AccidentHistory get(int id);

	/**
	 * 
	 * @param id
	 */
	public void update(int id);
	
	public void initialize();
	
	public void run();
	
	public void finalize() throws Throwable;

}