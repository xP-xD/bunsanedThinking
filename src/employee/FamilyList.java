package employee;


/**
 * @author KimChan
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:25
 */
public interface FamilyList {

	/**
	 * 
	 * @param family
	 */
	public void add(FamilyArray familyArray);

	/**
	 * 
	 * @param id
	 */
	public void delete(int id);

	/**
	 * 
	 * @param id
	 */
	public FamilyArray get(int id);

	/**
	 * 
	 * @param id
	 */
	public void update(int id);
	
	public void initialize();
	
	public void run();
	
	public void finalize() throws Throwable;

}