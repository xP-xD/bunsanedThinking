package employee;

/**
 * @author KimChan
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:22
 */
public interface ComplaintList {

	/**
	 * 
	 * @param complaint
	 */
	public void add(Complaint complaint);

	/**
	 * 
	 * @param id
	 */
	public void delete(int id);

	/**
	 * 
	 * @param id
	 */
	public Complaint get(int id);

	/**
	 * 
	 * @param id
	 */
	public void update(int id);
	
	public void initialize();
	
	public void run();
	
	public void finalize() throws Throwable;

}