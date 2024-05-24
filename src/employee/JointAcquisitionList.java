package employee;


/**
 * @author KimChan
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:26
 */
public interface JointAcquisitionList {

	/**
	 * 
	 * @param joinAcquisition
	 */
	public void add(JointAcquisition joinAcquisition);

	/**
	 * 
	 * @param id
	 */
	public void delete(int id);

	/**
	 * 
	 * @param id
	 */
	public JointAcquisition get(int id);

	/**
	 * 
	 * @param id
	 */
	public void update(int id);
	
	public void initialize();
	
	public void run();
	
	public void finalize() throws Throwable;

}