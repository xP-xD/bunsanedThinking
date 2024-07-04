package product;

import java.util.ArrayList;

import exception.NotExistException;
import product.insurance.Automobile;
import product.insurance.Disease;
import product.insurance.Injury;
import product.insurance.InjuryType;
import product.insurance.Insurance;
import product.insurance.InsuranceType;
import product.insurance.ServiceType;
import product.insurance.VehicleType;
import product.loan.Collateral;
import product.loan.FixedDeposit;
import product.loan.InsuranceContract;
import product.loan.Loan;

/**
 * @author KimChan
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:27
 */

//2024-05-29 김대현
//2024-05-31 김대현
//2024-06-02 김대현
public class ProductListImpl implements ProductList {

	private ArrayList<Product> productList;
	public static int index = 0;
	
	public ProductListImpl() {
		this.productList = new ArrayList<Product>();
		
		this.add(new Disease(InsuranceType.Disease, "뇌전증대비", 3000, 40, "뇌전증을대비하는보험입니다", 35, 24, "뇌전증", 2, 3));
		this.add(new Disease(InsuranceType.Disease, "심장마비대비", 4000, 30, "심장마비를대비하는보험입니다", 45, 30, "심장마비", 2, 2));
		this.add(new Injury(InsuranceType.Injury, "골절대비", 300, 20, "골절을대비하는보험입니다", 5, 10, InjuryType.Minor, 3));
		this.add(new Injury(InsuranceType.Injury, "눈찔림대비", 500, 50, "눈찔림사고를대비하는보험입니다", 2, 10, InjuryType.Minor, 3));
		ArrayList<ServiceType> serviceType = new ArrayList<>();
		serviceType.add(ServiceType.EmergencyTowing);
		this.add(new Automobile(InsuranceType.Automobile, "악사", 5000, 40, "인명피해를대비하는보험입니다", 9, 7, 7, VehicleType.Medium, serviceType));
	}

	/**
	 * 
	 * @param product
	 */	
	public void add(Product product) {
		if (product instanceof Insurance) {
			index++;
			String compound = Product.PRODUCT_SERIAL_NUMBER + "" + Insurance.INSURANCE_SERIAL_NUMBER + "" + index;
			product.setId(Integer.parseInt(compound));
		} else if (product instanceof Loan) {
			index++;
			String compound = Product.PRODUCT_SERIAL_NUMBER + "" + Loan.LOAN_SERIAL_NUMBER + "" + index;
			product.setId(Integer.parseInt(compound));
		}
		productList.add(product);
	}

	/**
	 * 
	 * @param id
	 */
	public void delete(int id) throws NotExistException {
		for (Product e : productList) {
			if (e != null && e.getId() == id) {
				productList.remove(e);
				return;
			}
		}
		throw new NotExistException();
	}

	/**
	 * 
	 * @param id
	 */
	public Product get(int id) throws NotExistException {
		for (Product e : productList) {
			if (e != null && e.getId() == id) {
				return e.clone();
			}
		}
		throw new NotExistException();
	}

	@Override
	public void update(Product product) throws NotExistException {
		for (int i = 0; i < productList.size(); i++) {
			if (productList.get(i).getId() == product.getId()) {
				productList.set(i, product);
				return;
			}
		}
		throw new NotExistException();
	}

	public ArrayList<Insurance> getAllInsurance() {
		ArrayList<Insurance> insuranceList = new ArrayList<>();
		for (Product product : productList) {
			if (product instanceof Insurance) {
				insuranceList.add((Insurance) product);
			}
		}
		return insuranceList;
	}

	public ArrayList<Insurance> getAllAutomobileInsurance() {
		ArrayList<Insurance> automobileinsuranceList = new ArrayList<>();
		for (Product product : productList) {
			if (product instanceof Automobile) {
				automobileinsuranceList.add((Insurance) product);
			}
		}
		return automobileinsuranceList;
	}

	public ArrayList<Insurance> getAllInjuryInsurance() {
		ArrayList<Insurance> injuryinsuranceList = new ArrayList<>();
		for (Product product : productList) {
			if (product instanceof Injury) {
				injuryinsuranceList.add((Insurance) product);
			}
		}
		return injuryinsuranceList;
	}

	public ArrayList<Insurance> getAllDiseaseInsurance() {
		ArrayList<Insurance> dideaseinsuranceList = new ArrayList<>();
		for (Product product : productList) {
			if (product instanceof Disease) {
				dideaseinsuranceList.add((Insurance) product);
			}
		}
		return dideaseinsuranceList;
	}

	@Override
	public ArrayList<Product> getAll() {
		return productList;
	}

	@Override
	public ArrayList<Loan> getAllLoan() {
		ArrayList<Loan> loanList = new ArrayList<>();
		for (Product product : productList) {
			if (product instanceof Loan) {
				loanList.add((Loan) product);
			}
		}
		return loanList;
	}

	@Override
	public ArrayList<Loan> getAllCollateralLoan() {
		ArrayList<Loan> collateralList = new ArrayList<>();
		for (Product product : productList) {
			if (product instanceof Collateral) {
				collateralList.add((Loan) product);
			}
		}
		return collateralList;
	}

	@Override
	public ArrayList<Loan> getAllFixedDepositLoan() {
		ArrayList<Loan> fixedDepositList = new ArrayList<>();
		for (Product product : productList) {
			if (product instanceof FixedDeposit) {
				fixedDepositList.add((Loan) product);
			}
		}
		return fixedDepositList;
	}

	@Override
	public ArrayList<Loan> getAllInsuranceContractLoan() {
		ArrayList<Loan> insuranceContractList = new ArrayList<>();
		for (Product product : productList) {
			if (product instanceof InsuranceContract) {
				insuranceContractList.add((Loan) product);
			}
		}
		return insuranceContractList;
	}

	@Override
	public Loan getLoan(int id) throws NotExistException {
		for (Product e : productList) {
			if (e.getId() == id) {
				if (e instanceof Loan) {
					return (Loan) e.clone();
				} else {
					throw new NotExistException();
				}
			}
		}
		throw new NotExistException();
	}

	@Override
	public Insurance getInsurance(int id) throws NotExistException {
		for (Product e : productList) {
			if (e.getId() == id) {
				if (e instanceof Insurance) {
					return (Insurance) e.clone();
				} else {
					throw new NotExistException();
				}
			}
		}
		throw new NotExistException();
	}

}