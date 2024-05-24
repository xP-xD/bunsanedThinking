package customer;


/**
 * @author KimChan
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:28
 */
public interface ReportList {

	/**
	 * 
	 * @param report
	 */
	public void add(Report report);

	/**
	 * 
	 * @param id
	 */
	public void delete(int id);

	/**
	 * 
	 * @param id
	 */
	public Report get(int id);

	/**
	 * 
	 * @param id
	 */
	public void update(int id);
	
	public void initialize();
	
	public void run();
	
	public void finalize() throws Throwable;

}