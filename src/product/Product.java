package product;


/**
 * @author ����ȯ
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:27
 */
public abstract class Product {

	private int id;
	private int limit;
	private String name;

	public Product() {
	}

	public abstract void add();

	public abstract void buy();

	public abstract void delete();

	public abstract void get();

	public abstract void update();

	public abstract void view();
}