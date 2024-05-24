package customer;


/**
 * @author KimChan
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:24
 */
public interface DiseaseHistoryList {

	/**
	 * 
	 * @param diseaseHistory
	 */
	public void add(DiseaseHistory diseaseHistory);

	/**
	 * 
	 * @param id
	 */
	public void delete(int id);

	/**
	 * 
	 * @param id
	 */
	public DiseaseHistory get(int id);

	/**
	 * 
	 * @param id
	 */
	public void update(int id);
	
	public void initialize();
	
	public void run();
	
	public void finalize() throws Throwable;

}