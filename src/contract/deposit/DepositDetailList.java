package contract.deposit;

import java.util.ArrayList;

import exception.NotExistException;

/**
 * @author KimChan
 * @version 1.0
 * @created 27-5-2024 ���� 4:40:41
 */
public interface DepositDetailList {

	/**
	 * 
	 * @param depositDetail
	 */
	public void add(DepositDetail depositDetail);

	/**
	 * 
	 * @param id
	 */
	public void delete(int id);

	/**
	 * 
	 * @param id
	 * @throws NotExistException 
	 */
	public DepositDetail get(int id) throws NotExistException;

	/**
	 * 
	 * @param id
	 * @throws NotExistException 
	 */
	public void update(DepositDetail depositDetail) throws NotExistException;

	public ArrayList<DepositDetail> getAllDepositDetail();

}