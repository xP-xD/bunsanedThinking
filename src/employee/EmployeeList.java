package employee;

import java.util.Scanner;

/**
 * @author KimChan
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:24
 */
public interface EmployeeList {

	/**
	 * 
	 * @param employee
	 */
	public void add(Employee employee);

	/**
	 * 
	 * @param id
	 */
	public void delete(int id);

	/**
	 * 
	 * @param id
	 */
	public Employee get(int id);

	/**
	 * 
	 * @param id
	 * @param scanner 
	 */
	public void update(int id, Scanner scanner);
	
	public void initialize();
	
	public void run();
	
	public void finalize() throws Throwable;

}