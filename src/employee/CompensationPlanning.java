package employee;

import java.util.Date;

import exception.DuplicatePartnerCompanyException;
import exception.NotExistException;
import partner.PartnerCompany;
import partner.PartnerCompanyList;
import partner.PartnerCompanyType;

/**
 * @author Administrator
 * @version 1.0
 * @created 27-5-2024 占쏙옙占쏙옙 4:40:40
 */

//2024-06-04 源����쁽
//2024-06-06 源����쁽
public class CompensationPlanning extends Employee {

	public static final int COMPENSATION_PLANNING_SERIAL_NUMBER = 210;

	public CompensationPlanning(String name, EmployeePosition employeePosition, String address, String phoneNumber,
			String bankName, String bankAccount, String residentRegistrationNumber, int departmentID, int salary,
			Date dateOfemployment) {
		super(name, employeePosition, address, phoneNumber, bankName, bankAccount, residentRegistrationNumber, departmentID,
				salary, dateOfemployment);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void addPartnerCompany(String name, String phoneNumber, PartnerCompanyType partnerCompanyType, String headName,String headPhoneNumber, PartnerCompanyList partnerCompanyList) throws DuplicatePartnerCompanyException{
		for (PartnerCompany partnerCompany : partnerCompanyList.getAll()) {
			if (partnerCompany.getName().equals(name)) {
				throw new DuplicatePartnerCompanyException();
			}
		}
		
		PartnerCompany PartnerCompany = new PartnerCompany(name, phoneNumber, partnerCompanyType, headName, headPhoneNumber);
		partnerCompanyList.add(PartnerCompany);
	}


	public void evaluatePartnerCompany(int evaluate, PartnerCompany partnerCompany, PartnerCompanyList partnerCompanyList) throws NotExistException{
		partnerCompany.setEvaluation(evaluate);
		partnerCompanyList.update(partnerCompany);
	}

	public PartnerCompany getPartnerCompany(PartnerCompanyList partnerCompanyList, int id) throws NotExistException{
		try {
			return partnerCompanyList.get(id);
		} catch (NotExistException e) {
			throw new NotExistException("해당하는 협력 업체 정보가 존재하지 않습니다.");
		}
	}

	public void updatePartnerCompany(int index, String input, PartnerCompany partnerCompany, PartnerCompanyList partnerCompanyList) throws DuplicatePartnerCompanyException, NotExistException{
		switch (index) {
		case 1:
			for (PartnerCompany e : partnerCompanyList.getAll()) {
				if (e.getName().equals(input)) {
					throw new DuplicatePartnerCompanyException();
				}
			}
			partnerCompany.setName(input);
			partnerCompanyList.update(partnerCompany);
			break;
		case 2:
			partnerCompany.setPhoneNumber(input);
			partnerCompanyList.update(partnerCompany);
			break;
		case 3:
			partnerCompany.setHeadName(input);
			partnerCompanyList.update(partnerCompany);
			break;
		case 4:
			partnerCompany.setHeadPhoneNumber(input);
			partnerCompanyList.update(partnerCompany);
			break;
		default:
			break;
		}
	}

	public void deletePartnerCompany(PartnerCompanyList partnerCompanyList, int id) throws NotExistException {
		partnerCompanyList.delete(id);
	}

	@Override
	public Employee clone() {
		Employee employee = new CompensationPlanning(getName(), getPosition() ,getAddress(), getPhoneNumber(), getBankName(), getBankAccount(),getResidentRegistrationNumber(), getDepartmentID(), getSalary(),this.employmentDate);
		employee.setId(getId());
		return employee;
	}

}