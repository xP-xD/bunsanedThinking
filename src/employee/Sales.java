package employee;

/**
 * @author ����ȯ
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:28
 */
public class Sales extends Employee {
	
	public static String serialNumber = "080";

	private Performance performance;
	private Performance previousMonthEvaluation;
	public Performance m_Performance;

	public Sales(Employee uploadEmployeeData) {
	}
	
	@Override
	public boolean work(int index) {
		
		switch (index) {
		case 1:
			evaluateSalesPerformance();
			return true;
		case 2:
			handleInsuranceConsultation();
			return true;
		case 3:
			induceInsuranceProduct();
			return true;
		case 4:
			induceLoanProduct();
			return true;
		case 5:
			return true;
		default:
			return false;
		}
	}


	public void evaluateSalesPerformance(){

	}

	public void handleInsuranceConsultation(){

	}

	public void induceInsuranceProduct(){

	}

	public void induceLoanProduct(){

	}

}