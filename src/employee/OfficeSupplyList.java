package employee;

/**
 * @author KimChan
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:26
 */
public interface OfficeSupplyList {

	/**
	 * 
	 * @param officeSupply
	 */
	public void add(OfficeSupply officeSupply);

	/**
	 * 
	 * @param id
	 */
	public void delete(int id);

	/**
	 * 
	 * @param id
	 */
	public OfficeSupply get(int id);

	/**
	 * 
	 * @param id
	 */
	public void update(int id);

	public void initialize();

	public void run();

	public void finalize() throws Throwable;

}