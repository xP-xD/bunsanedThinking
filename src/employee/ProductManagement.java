package employee;

import java.util.Scanner;

import product.ProductList;

/**
 * @author Administrator
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:27
 */
public class ProductManagement extends Employee {
	
	public static String serialNumber = "090";
	
	private ProductList productList;

	public ProductManagement(Employee uploadEmployeeData) {
	}
	
	public void initialize(ProductList productList) {
		this.productList = productList;
	}
	
	@Override
	public boolean work(int index) {
		
		switch (index) {
		case 1:
			addInsuranceProduct();
			return true;
		case 2:
			addInsuranceProduct();
			return true;
		case 3:
			getInsuranceProduct();
			return true;
		case 4:
			updateInsuranceProduct();
			return true;
		case 5:
			return true;
		default:
			return false;
		}
	}

	public void addInsuranceProduct(){
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Please input Customer Information");
			/*
			 * Product ���� �Է¹ޱ�
			 */
			/*
			 * Product�� ������ �ʰ� Automobile�̳� Insurance Contractó��
			 * ���� ID�� �Է¹޾Ƽ� switch�� �´� Product ������ add���ֱ�
			 */
//			Product product = new Product();
//			this.productList.add(product);
		} catch (Exception e) {
			System.out.println("Inpurt Error");
		}
		scanner.close();
	}

	public void deleteInsuranceProduct(){

	}

	public void getInsuranceProduct(){

	}

	public void updateInsuranceProduct(){

	}


}