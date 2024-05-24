package product;


/**
 * @author KimChan
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:27
 */
public interface ProductList {

	/**
	 * 
	 * @param product
	 */
	public void add(Product product);

	/**
	 * 
	 * @param id
	 */
	public void delete(int id);

	/**
	 * 
	 * @param id
	 */
	public Product get(int id);

	/**
	 * 
	 * @param id
	 */
	public void update(int id);
	
	public void initialize();
	
	public void run();
	
	public void finalize() throws Throwable;

}