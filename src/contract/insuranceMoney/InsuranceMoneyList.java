package contract.insuranceMoney;

import java.util.ArrayList;

import exception.NotExistException;

/**
 * @author KimChan
 * @version 1.0
 * @created 27-5-2024 ���� 4:40:42
 */
public interface InsuranceMoneyList {

	/**
	 * 
	 * @param insuranceMoney
	 */
	public void add(InsuranceMoney insuranceMoney);

	/**
	 * 
	 * @param id
	 */
	public void delete(int id) throws NotExistException;

	/**
	 * 
	 * @param id
	 */
	public InsuranceMoney get(int id) throws NotExistException;

	/**
	 * 
	 * @param id
	 */
	public void update(InsuranceMoney insuranceMoney) throws NotExistException;

	public ArrayList<InsuranceMoney> getAll();

	public ArrayList<InsuranceMoney> getAllUnprocessed();

	public ArrayList<InsuranceMoney> getAllProcessed();

}