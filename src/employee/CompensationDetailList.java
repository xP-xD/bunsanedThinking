package employee;

import exception.NotExistException;

/**
 * @author KimChan
 * @version 1.0
 * @created 27-5-2024 ���� 4:40:40
 */
public interface CompensationDetailList {

	/**
	 * 
	 * @param compensationDetail
	 */
	public void add(CompensationDetail compensationDetail);

	/**
	 * 
	 * @param id
	 * @throws NotExistException 
	 */
	public void delete(int id) throws NotExistException;

	/**
	 * 
	 * @param id
	 * @throws NotExistException 
	 */
	public CompensationDetail get(int id) throws NotExistException;

	/**
	 * 
	 * @param id
	 */
	public void update(CompensationDetail compensationDetail) throws NotExistException;

}