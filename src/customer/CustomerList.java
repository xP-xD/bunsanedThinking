package customer;

/**
 * @author KimChan
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:23
 */
public interface CustomerList {

	/**
	 * 
	 * @param customer
	 */
	public void add(Customer customer);

	/**
	 * 
	 * @param id
	 */
	public void delete(int id);

	/**
	 * 
	 * @param id
	 */
	public Customer get(int id);

	/**
	 * 
	 * @param id
	 */
	public void update(int id);

}