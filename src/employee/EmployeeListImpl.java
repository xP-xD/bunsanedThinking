package employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import employee.sales.Sales;
import employee.underwriting.Underwriting;
import exception.NotExistException;

/**
 * @author KimChan
 * @version 1.0
 * @created 27-5-2024 ���� 4:40:42
 */

//2024-06-02 김대현
//2024-06-04 김대현
public class EmployeeListImpl implements EmployeeList {

	private ArrayList<Employee> employeeList;
	public static int index = 0;

	public EmployeeListImpl() {
		employeeList = new ArrayList<Employee>();

		Date date = null;
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse("2013-10-23");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.add(new FinancialAccountant("박지성", EmployeePosition.GeneralManager, "송파구", "010-6543-6543", "우리",
				"1012-215-225937", "654321-987543", 9101, 504, date));
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse("2005-07-12");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.add(new Administrative("최예나", EmployeePosition.GeneralManager, "종로구", "010-7654-7654", "하나",
				"532-215-362224", "765432-198754", 9102, 454, date));
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse("2011-12-03");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.add(new Compensation("안유진", EmployeePosition.GeneralManager, "중구", "010-8765-8765", "우리", "101-215-234526",
				"876543-219765", 9103, 484, date));
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse("2007-03-13");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.add(new CustomerSupport("다나카", EmployeePosition.GeneralManager, "성동구", "010-9876-9876", "국민",
				"532-215-124522", "987654-329876", 9104, 631, date));
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse("2019-01-02");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.add(new ManagementPlanning("김수현", EmployeePosition.GeneralManager, "강동구", "010-9123-9123", "신한",
				"654-215-352223", "912345-678923", 9105, 584, date));
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse("2015-07-17");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.add(new HumanResource("이상혁", EmployeePosition.GeneralManager, "강남구", "010-8912-8912", "하나",
				"129-215-234632", "891234-567812", 9106, 399, date));
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse("2009-04-28");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.add(new CustomerInformationManagement("손흥민", EmployeePosition.GeneralManager, "강남구", "010-7891-7891", "우리",
				"162-215-263357", "789123-456891", 9107, 476, date));
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse("2010-10-13");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.add(new Sales("김민재", EmployeePosition.GeneralManager, "마포구", "010-6789-6789", "국민", "132-215-464637",
				"678912-345679", 9108, 436, date));
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse("2016-05-27");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.add(new ProductManagement("박보검", EmployeePosition.GeneralManager, "덕양구", "010-5678-5678", "신한",
				"762-215-644632", "567891-234678", 9109, 590, date));
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse("2012-12-15");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.add(new Underwriting("모지환", EmployeePosition.GeneralManager, "송파구", "010-4567-4567", "우리",
				"612-215-823858", "456789-543567", 9110, 602, date));
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse("2015-10-28");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.add(new CompensationPlanning("허리나", EmployeePosition.GeneralManager, "성북구", "010-3456-3456", "하나",
				"162-215-325692", "945678-912256", 9111, 455, date));
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse("2012-07-19");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.add(new ContractManagement("김찬", EmployeePosition.GeneralManager, "상록구", "010-2345-2345", "국민",
				"752-215-634663", "734567-891255", 9112, 456, date));
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse("2013-12-26");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.add(new LoanManagement("김대현", EmployeePosition.GeneralManager, "서대문구", "010-8434-1394", "신한",
				"432-215-659937", "872346-789185", 9113, 560, date));

		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse("2020-09-03");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.add(new FinancialAccountant("김계란", EmployeePosition.SeniorStaff, "송파구", "010-8388-7264", "우리",
				"1029-281-285729", "981121-2175629", 9114, 320, date));
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse("2024-12-26");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.add(new Administrative("나만두", EmployeePosition.Intern, "종로구", "010-7284-8264", "하나", "1590-752-558212",
				"990121-0215822", 9115, 200, date));
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse("2018-09-11");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.add(new Compensation("감자탕", EmployeePosition.Manager, "중구", "010-2632-6442", "우리", "4732-192-219851",
				"880519-2715842", 9116, 380, date));
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse("2022-12-26");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.add(new CustomerSupport("웅치킨", EmployeePosition.Staff, "성동구", "010-1846-7719", "국민", "1102-128-129835",
				"820812-2957381", 9117, 260, date));
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse("2017-02-04");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.add(new ManagementPlanning("최피자", EmployeePosition.DeputyGeneralManager, "강동구", "010-6428-8074", "신한",
				"1892-291-397538", "740728-5729221", 9118, 440, date));
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse("2024-12-26");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.add(new HumanResource("정양파", EmployeePosition.Intern, "강남구", "010-9942-4712", "하나", "5820-575-271251",
				"690412-1950223", 9119, 200, date));
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse("2018-03-07");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.add(new CustomerInformationManagement("이족발", EmployeePosition.Manager, "강남구", "010-1249-3741", "우리",
				"8827-805-485416", "740627-0285721", 9120, 380, date));
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse("2020-10-08");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.add(new Sales("김맥북", EmployeePosition.SeniorStaff, "마포구", "010-0029-4756", "국민", "3693-993-593886",
				"921107-0285218", 9121, 320, date));
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse("2020-04-03");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.add(new ProductManagement("바선생", EmployeePosition.SeniorStaff, "덕양구", "010-9472-4489", "신한",
				"3692-181-482749", "851210-1028512", 9122, 320, date));
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse("2022-12-26");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.add(new Underwriting("코그모", EmployeePosition.Staff, "송파구", "010-3491-7492", "우리", "1240-922-920284",
				"801027-1057296", 9123, 260, date));
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse("2017-11-02");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.add(new CompensationPlanning("나진심", EmployeePosition.DeputyGeneralManager, "성북구", "010-2145-9625", "하나",
				"1259-420-998204", "731227-1058288", 9124, 440, date));
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse("2024-05-17");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.add(new ContractManagement("인심이", EmployeePosition.Intern, "상록구", "010-2159-0812", "국민", "2994-140-229450",
				"910515-2856311", 9125, 200, date));
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			date = formatter.parse("2022-06-19");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.add(new LoanManagement("나졸려", EmployeePosition.Staff, "서대문구", "010-2956-7724", "신한", "2873-239-971275",
				"850817-1057298", 9126, 260, date));

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param employee
	 */
	public void add(Employee employee) {
		index++;
		String compound = null;
		if (employee instanceof FinancialAccountant) {
			compound = Employee.EMPLOYEE_SERIAL_NUMBER + ""
					+ FinancialAccountant.FINANCIAL_ACCOUNTANT_ACCOUNTANT_SERIAL_NUMBER + "" + index;
		} else if (employee instanceof Administrative) {
			compound = Employee.EMPLOYEE_SERIAL_NUMBER + "" + Administrative.ADMINISTRATIVE_SERIAL_NUMBER + "" + index;
		} else if (employee instanceof Compensation) {
			compound = Employee.EMPLOYEE_SERIAL_NUMBER + "" + Compensation.COMPENSATION_SERIAL_NUMBER + "" + index;
		} else if (employee instanceof CustomerSupport) {
			compound = Employee.EMPLOYEE_SERIAL_NUMBER + "" + CustomerSupport.CUSTOMER_SUPPORT_SERIAL_NUMBER + ""
					+ index;
		} else if (employee instanceof ManagementPlanning) {
			compound = Employee.EMPLOYEE_SERIAL_NUMBER + "" + ManagementPlanning.MANAGEMENT_PLANNING_SERIAL_NUMBER + ""
					+ index;
		} else if (employee instanceof HumanResource) {
			compound = Employee.EMPLOYEE_SERIAL_NUMBER + "" + HumanResource.HUMANRESOURCE_SERIAL_NUMBER + "" + index;
		} else if (employee instanceof CustomerInformationManagement) {
			compound = Employee.EMPLOYEE_SERIAL_NUMBER + ""
					+ CustomerInformationManagement.CUSTOMER_INFORMATION_MANAGEMENT_SERIAL_NUMBER + "" + index;
		} else if (employee instanceof Sales) {
			compound = Employee.EMPLOYEE_SERIAL_NUMBER + "" + Sales.SALES_SERIAL_NUMBER + "" + index;
		} else if (employee instanceof ProductManagement) {
			compound = Employee.EMPLOYEE_SERIAL_NUMBER + "" + ProductManagement.PRODUCT_MANAGEMENT_SERIAL_NUMBER + ""
					+ index;
		} else if (employee instanceof Underwriting) {
			compound = Employee.EMPLOYEE_SERIAL_NUMBER + "" + Underwriting.UNDERWRITING_SERIAL_NUMBER + "" + index;
		} else if (employee instanceof CompensationPlanning) {
			compound = Employee.EMPLOYEE_SERIAL_NUMBER + "" + CompensationPlanning.COMPENSATION_PLANNING_SERIAL_NUMBER
					+ "" + index;
		} else if (employee instanceof ContractManagement) {
			compound = Employee.EMPLOYEE_SERIAL_NUMBER + "" + ContractManagement.CONTRACT_MANAGEMENT_SERIAL_NUMBER + ""
					+ index;
		} else if (employee instanceof LoanManagement) {
			compound = Employee.EMPLOYEE_SERIAL_NUMBER + "" + LoanManagement.LOAN_MANAGEMENT_SERIAL_NUMBER + "" + index;
		}
		employee.setId(Integer.parseInt(compound));
		employeeList.add(employee);
	}

	/**
	 * 
	 * @param id
	 * @throws NotExistException 
	 */
	public void delete(int id) throws NotExistException {
		for (Employee e : employeeList) {
			if (e != null && e.getId() == id) {
				employeeList.remove(e);
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
	public Employee get(int id) throws NotExistException {
		for (Employee employee : employeeList) {
			if (employee.getId() == id) {
				return employee.clone();
			}
		}
		throw new NotExistException();
	}

	/**
	 * 
	 * @param id
	 * @throws NotExistException 
	 */
	public void update(Employee employee) throws NotExistException {
		for (int i = 0; i < employeeList.size(); i++) {
			if (employeeList.get(i).getId() == employee.getId()) {
				employeeList.set(i, employee);
				return;
			}
		}
		throw new NotExistException();
	}

	@Override
	public ArrayList<Employee> getAll() {
		return employeeList;
	}

	@Override
	public Sales getSales(int id) throws NotExistException {
		for (Employee employee : employeeList) {
			if (employee.getId() == id) {
				if (employee instanceof Sales) {
					return (Sales) employee.clone();
				} else {
					throw new NotExistException();
				}
			}
		}
		throw new NotExistException();
	}

}