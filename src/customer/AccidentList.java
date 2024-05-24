package customer;

/**
 * @author KimChan
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:21
 */
public interface AccidentList {

	/**
	 * 
	 * @param accident
	 */
	public void add(Accident accident);

	/**
	 * 
	 * @param id
	 */
	public void delete(int id);

	/**
	 * 
	 * @param id
	 */
	public Accident get(int id);

	/**
	 * 
	 * @param id
	 */
	public void update(int id);
	
	public void initialize();
	
	public void run();
	
	public void finalize() throws Throwable;

}