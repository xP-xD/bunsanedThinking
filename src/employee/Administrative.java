package employee;

import java.util.Date;
import employee.department.OfficeSupply;
import employee.department.OfficeSupplyList;
import exception.DuplicateOfficeSupplyException;
import exception.NotExistException;

/**
 * @author Administrator
 * @version 1.0
 * @created 27-5-2024 占쏙옙占쏙옙 4:40:40
 */
//2024-06-02 源����쁽
//2024-06-06 源����쁽
public class Administrative extends Employee {

	public static final int ADMINISTRATIVE_SERIAL_NUMBER = 120;

	public Administrative(String name, EmployeePosition employeePosition, String address, String phoneNumber,
			String bankName, String bankAccount, String residentRegistrationNumber, int departmentID, int salary,
			Date dateOfemployment) {
		super(name, employeePosition, address, phoneNumber, bankName, bankAccount, residentRegistrationNumber, departmentID,
				salary, dateOfemployment);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void addOfficeSupply(String name, String explain, int inventory, OfficeSupplyList officeSupplyList) throws DuplicateOfficeSupplyException{
		for (OfficeSupply officeSupply : officeSupplyList.getAll()) {
			if (officeSupply.getName().equals(name)) {
				throw new DuplicateOfficeSupplyException();
			}
		}
		OfficeSupply officeSupply = new OfficeSupply(name, explain, inventory);
		officeSupplyList.add(officeSupply);
		
	}

	public void deleteOfficeSupply(OfficeSupplyList officeSupplyList, int id) throws NotExistException{
		try {
			officeSupplyList.delete(id);
		} catch (NotExistException e) {
			throw new NotExistException("해당하는 집기 비품 정보가 존재하지 않습니다.");
		}
	}

	public OfficeSupply getOfficeSupply(OfficeSupplyList officeSupplyList, int id) throws NotExistException{
		try {
			return officeSupplyList.get(id);
		} catch (NotExistException e) {
			throw new NotExistException("해당하는 집기 비품 정보가 존재하지 않습니다.");
		}
	}

	public void updateDepartment(int index, String input, OfficeSupply officeSupply,
			OfficeSupplyList officeSupplyList) throws DuplicateOfficeSupplyException, NotExistException {
		try {
			switch (index) {
			case 1:
				for (OfficeSupply e : officeSupplyList.getAll()) {
					if (e.getName().equals(input)) {
						throw new DuplicateOfficeSupplyException();
					}
				}
				officeSupply.setName(input);
				officeSupplyList.update(officeSupply);
				break;
			case 2:
				officeSupply.setExplain(input);
				officeSupplyList.update(officeSupply);
				break;
			case 3:
				officeSupply.setInventory(Integer.parseInt(input));
				officeSupplyList.update(officeSupply);
				break;
			default:
				break;
			}
		} catch (NotExistException e) {
			throw new NotExistException("해당하는 집기 비품 정보가 존재하지 않습니다.");
		}
		
	}

	@Override
	public Employee clone() {
		Employee employee = new Administrative(getName(), getPosition(),getAddress(), getPhoneNumber(), getBankName(), getBankAccount(),getResidentRegistrationNumber(), getDepartmentID(), getSalary(),this.employmentDate);
		employee.setId(getId());
		return employee;
	}

}