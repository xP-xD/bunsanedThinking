package employee;

/**
 * @author KimChan
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:27
 */
public interface PerformanceList {

	/**
	 * 
	 * @param performance
	 */
	public void add(Performance performance);

	/**
	 * 
	 * @param id
	 */
	public void delete(int id);

	/**
	 * 
	 * @param id
	 */
	public Performance get(int id);

	/**
	 * 
	 * @param id
	 */
	public void update(int id);

	public void initialize();

	public void run();

	public void finalize() throws Throwable;

}