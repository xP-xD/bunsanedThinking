package customer;


/**
 * @author KimChan
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:23
 */
public interface CounselList {

	/**
	 * 
	 * @param counsel
	 */
	public void add(Counsel counsel);

	/**
	 * 
	 * @param id
	 */
	public void delete(int id);

	/**
	 * 
	 * @param id
	 */
	public Counsel get(int id);

	/**
	 * 
	 * @param id
	 */
	public void update(int id);
	
	public void initialize();
	
	public void run();
	
	public void finalize() throws Throwable;

}