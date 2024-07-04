package employee.department;

import java.util.ArrayList;

import exception.NotExistException;

/**
 * @author KimChan
 * @version 1.0
 * @created 27-5-2024 ���� 4:40:43
 */

//2024-06-02 김대현
//2024-06-04 김대현
public class OfficeSupplyListImpl implements OfficeSupplyList {

	private ArrayList<OfficeSupply> officeSupplyList;
	public static int index = 0;

	public OfficeSupplyListImpl(){
		officeSupplyList = new ArrayList<OfficeSupply>();
		officeSupplyList.add(new OfficeSupply("모나미 볼펜", "문구", 370));
		officeSupplyList.add(new OfficeSupply("지우개", "문구", 400));
		officeSupplyList.add(new OfficeSupply("A4", "문구", 20000));
		officeSupplyList.add(new OfficeSupply("B5", "문구", 5000));
		officeSupplyList.add(new OfficeSupply("스테이플러", "문구", 20));
		officeSupplyList.add(new OfficeSupply("가위", "문구", 70));
		officeSupplyList.add(new OfficeSupply("칼", "문구", 20));
		officeSupplyList.add(new OfficeSupply("에어컨", "전자제품", 37));
		officeSupplyList.add(new OfficeSupply("선풍기", "전자제품", 760));
		officeSupplyList.add(new OfficeSupply("컴퓨터", "전자제품", 3000));
		officeSupplyList.add(new OfficeSupply("모니터", "전자제품", 3000));
	}

	public void finalize() throws Throwable {
		
	}

	/**
	 * 
	 * @param officeSupply
	 */
	public void add(OfficeSupply officeSupply){
		index++;
		String compound = OfficeSupply.OFFICESUPPLY_SERIAL_NUMBER +""+ index;
		officeSupply.setId(Integer.parseInt(compound));
		officeSupplyList.add(officeSupply);
	}

	/**
	 * 
	 * @param id
	 * @throws NotExistException 
	 */
	public void delete(int id) throws NotExistException {
		for (OfficeSupply e : officeSupplyList) {
			if (e != null && e.getId() == id) {
				officeSupplyList.remove(e);
				return;
			}
		}
		throw new NotExistException();
	}

	/**
	 * 
	 * @param id
	 * @throws NotExistException 
	 */
	public OfficeSupply get(int id) throws NotExistException{
		for (OfficeSupply e : officeSupplyList) {
			if (e != null && e.getId() == id) {
				return e.clone();
			}
		}
		throw new NotExistException();
	}

	/**
	 * 
	 * @param id
	 * @throws NotExistException 
	 */
	public void update(OfficeSupply officeSupply) throws NotExistException{
		for (int i = 0; i < officeSupplyList.size(); i++) {
			if (officeSupplyList.get(i).getId() == officeSupply.getId()) {
				officeSupplyList.set(i, officeSupply);
				return;
			}
		}
		throw new NotExistException();
	}

	@Override
	public ArrayList<OfficeSupply> getAll() {
		ArrayList<OfficeSupply> result = new ArrayList<>();
		for (OfficeSupply officeSupply : officeSupplyList) {
			result.add(officeSupply.clone());
		}
		return result;
	}

	@Override
	public int getTotalInventory() {
		int totalInventory = 0;
		for (OfficeSupply e : officeSupplyList) {
			totalInventory += e.getInventory();
		}
		return totalInventory;
	}
	
}