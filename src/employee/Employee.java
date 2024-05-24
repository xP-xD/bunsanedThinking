package employee;

import java.util.Date;

import customer.Customer;
import partner.PartnerCompanyListImpl;
import product.Product;

/**
 * @author ����ȯ
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:24
 */
public abstract class Employee {

	private String address;
	private String bankAccount;
	private int departmentID;
	private Date employmentDate;
	private FamilyList familyRelationship;
	private int id;
	private String name;
	private PaymentDetailList paymentDetailList;
	private String phoneNumber;
	private EmployeePosition position;
	private String residentRegistrationNumber;
	private int salary;
	public EmployeePosition m_EmployeePosition;
	public Customer m_Customer;
	public Product m_Product;
	public PartnerCompanyListImpl m_PartnerCompanyListImpl;
	public PaymentDetail m_PaymentDetail;
	public FamilyListImpl m_FamilyListImpl;
	public DepartmentListImpl m_DepartmentListImpl;
	
	static int employSerialNum = 600;
	
	public Employee() {
	}
	
	public abstract boolean work(int index);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}