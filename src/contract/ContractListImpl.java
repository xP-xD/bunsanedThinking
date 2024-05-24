package contract;

import java.util.ArrayList;

/**
 * @author KimChan
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:23
 */
public class ContractListImpl implements ContractList {

	private ArrayList<Contract> contractList;
	public Contract m_Contract;

	public ContractListImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param contract
	 */
	public void add(Contract contract){

	}

	/**
	 * 
	 * @param id
	 */
	public void delete(int id){

	}

	/**
	 * 
	 * @param id
	 */
	public Contract get(int id){
		return null;
	}

	/**
	 * 
	 * @param id
	 */
	public void update(int id){

	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}