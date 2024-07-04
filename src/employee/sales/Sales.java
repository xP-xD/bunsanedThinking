package employee.sales;

import java.util.ArrayList;
import java.util.Date;

import contract.Contract;
import contract.ContractList;
import customer.Customer;
import customer.CustomerList;
import customer.Gender;
import customer.accidentHistory.AccidentHistory;
import customer.counsel.Counsel;
import customer.counsel.CounselList;
import customer.counsel.CounselProcessStatus;
import customer.diseaseHistory.DiseaseHistory;
import customer.surgeryHistory.SurgeryHistory;
import employee.Employee;
import employee.EmployeeList;
import employee.EmployeePosition;
import exception.AlreadyProcessedException;
import exception.NotExistException;
import product.Product;
import product.ProductList;
import product.insurance.Insurance;
import product.loan.Loan;

/**
 * @author     환
 * @version 1.0
 * @created 27-5-2024      4:40:44
 */
//2024-05-31 紐⑥��솚
//2024-06-06 源����쁽
public class Sales extends Employee {
	
	public static final int SALES_SERIAL_NUMBER = 180;

	private int evaluate;
	private int contractCount;

	public Sales(String name, EmployeePosition employeePosition, String address, String phoneNumber, String bankName,
			String bankAccount, String residentRegistrationNumber, int departmentID, int salary,
			Date dateOfemployment) {
		super(name, employeePosition, address, phoneNumber, bankName, bankAccount, residentRegistrationNumber, departmentID,
				salary, dateOfemployment);
		evaluate =0;
		contractCount=0;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void evaluateSalesPerformance(int evaluate, Sales sales, EmployeeList employeeList) throws NotExistException{
		sales.setEvaluate(evaluate);
		employeeList.update(sales);
	}

	public void handleInsuranceConsultation(Counsel counsel, CounselList counselList) throws NotExistException, AlreadyProcessedException{
		if (counsel.getProcessStatus() == CounselProcessStatus.Completed) {
			throw new AlreadyProcessedException();
		}
		counsel.handle();
		counselList.update(counsel);
	}

	public Customer induceInsuranceProduct(String name, String address, String bankAccount, String bankName, String phoneNumber,
			String job, long property, String residentRegistrationNumber, int age, Gender gender,
			ArrayList<DiseaseHistory> diseaseHistoryList, ArrayList<SurgeryHistory> surgeryHistoryList,
			ArrayList<AccidentHistory> accidentHistoryList, Product product, CustomerList customerList, ContractList contractList) { 

		Customer customer = new Customer(name, phoneNumber, job, age, gender, residentRegistrationNumber, address, property, bankName, bankAccount);
		customerList.add(customer);
		if(accidentHistoryList != null) {
			for(AccidentHistory e :accidentHistoryList) {
				e.setCustomerID(customer.getId());
				customer.setAccidentHistoryList(accidentHistoryList);
				accidentHistoryList.add(e);
			}
		}
		if(surgeryHistoryList != null) {
			for(SurgeryHistory e :surgeryHistoryList) {
				e.setCustomerID(customer.getId());
				customer.setSurgeryHistoryList(surgeryHistoryList);
				surgeryHistoryList.add(e);
			}
		}
		if(diseaseHistoryList != null) {
			for(DiseaseHistory e :diseaseHistoryList) {
				e.setCustomerID(customer.getId());
				customer.setDiseaseHistoryList(diseaseHistoryList);
				diseaseHistoryList.add(e);
			}
		}

		Contract contract = new Contract(customer.getId(), product);
		contractList.add(contract);

		return customer;
	}

	public Insurance getInsuranceProduct(ProductList productList, int id) throws NotExistException {
		return (Insurance) productList.get(id);

	}

	public Customer induceLoanProduct(String name, String address, String bankAccount, String bankName, String phoneNumber, 
			String job, long property, String residentRegistrationNumber, int age, Gender gender,
			ArrayList<DiseaseHistory> diseaseHistoryList, ArrayList<SurgeryHistory> surgeryHistoryList,
			ArrayList<AccidentHistory> accidentHistoryList, Product product, CustomerList customerList, ContractList contractList) {
		
		Customer customer = new Customer(name, phoneNumber, job, age, gender, residentRegistrationNumber, address, property, bankName, bankAccount);
		customerList.add(customer);
		if(accidentHistoryList != null) {
			for(AccidentHistory e :accidentHistoryList) {
				e.setCustomerID(customer.getId());
				customer.setAccidentHistoryList(accidentHistoryList);
				accidentHistoryList.add(e);
			}
		}
		if(surgeryHistoryList != null) {
			for(SurgeryHistory e :surgeryHistoryList) {
				e.setCustomerID(customer.getId());
				customer.setSurgeryHistoryList(surgeryHistoryList);
				surgeryHistoryList.add(e);
			}
		}
		if(diseaseHistoryList != null) {
			for(DiseaseHistory e :diseaseHistoryList) {
				e.setCustomerID(customer.getId());
				customer.setDiseaseHistoryList(diseaseHistoryList);
				diseaseHistoryList.add(e);
			}
		}

		Contract contract = new Contract(customer.getId(), product);
		contractList.add(contract);

		return customer;

	}

	public Loan getLoanProduct(ProductList productList, int id) throws NotExistException {
		return (Loan) productList.get(id);
	}

	public int getEvaluate() {
		return evaluate;
	}

	public void setEvaluate(int evaluate) {
		this.evaluate = evaluate;
	}

	public int getContractCount() {
		return contractCount;
	}

	public void setContractCount(int contractCount) {
		this.contractCount = contractCount;
	}

	@Override
	public Employee clone() {
		Employee employee = new Sales(getName(), getPosition(),getAddress(), getPhoneNumber(), getBankName(), getBankAccount(),getResidentRegistrationNumber(), getDepartmentID(), getSalary(),this.employmentDate);
		employee.setId(getId());
		return employee;
	}

}