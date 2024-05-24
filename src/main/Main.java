package main;

import java.util.Scanner;

import contract.CompensationDetailList;
import contract.CompensationDetailListImpl;
import contract.ContractList;
import contract.ContractListImpl;
import contract.DepositDetailList;
import contract.DepositDetailListImpl;
import contract.InsuranceMoneyList;
import contract.InsuranceMoneyListImpl;
import customer.AccidentHistoryList;
import customer.AccidentHistoryListImpl;
import customer.AccidentList;
import customer.AccidentListImpl;
import customer.CounselList;
import customer.CounselListImpl;
import customer.Customer;
import customer.CustomerList;
import customer.CustomerListImpl;
import customer.DiseaseHistoryList;
import customer.DiseaseHistoryListImpl;
import customer.Gender;
import customer.ReportList;
import customer.ReportListImpl;
import customer.SurgeryHistoryList;
import customer.SurgeryHistoryListImpl;
import employee.Administrative;
import employee.Compensation;
import employee.CompensationPlanning;
import employee.ComplaintList;
import employee.ComplaintListImpl;
import employee.ContractManagement;
import employee.CustomerInformationManagement;
import employee.CustommerSupport;
import employee.DepartmentList;
import employee.DepartmentListImpl;
import employee.Employee;
import employee.EmployeeList;
import employee.EmployeeListImpl;
import employee.FamilyList;
import employee.FamilyListImpl;
import employee.FinancialAccountant;
import employee.HumanResource;
import employee.JointAcquisitionList;
import employee.JointAcquisitionListImpl;
import employee.LoanManagement;
import employee.ManagementPlanning;
import employee.OfficeSupplyList;
import employee.OfficeSupplyListImpl;
import employee.PaymentDetailList;
import employee.PaymentDetailListImpl;
import employee.PerformanceList;
import employee.PerformanceListImpl;
import employee.ProductManagement;
import employee.ReinsuranceList;
import employee.ReinsuranceListImpl;
import employee.Sales;
import employee.Underwriting;
import partner.PartnerCompanyList;
import partner.PartnerCompanyListImpl;
import product.ProductList;
import product.ProductListImpl;

public class Main {

	Scanner scanner;
	private String input;
	private int id;
	private int index;

	// contract
	CompensationDetailList compensationDetailList;
	ContractList contractList;
	DepositDetailList depositDetailList;
	InsuranceMoneyList insuranceMoneyList;

	// customer
	AccidentHistoryList accidentHistoryList;
	AccidentList accidentList;
	CounselList counselList;
	CustomerList customerList;
	DiseaseHistoryList diseaseHistoryList;
	ReportList reportList;
	SurgeryHistoryList surgeryHistoryList;

	// employee
	ComplaintList complaintList;
	DepartmentList departmentList;
	EmployeeList employeeList;
	FamilyList familyList;
	JointAcquisitionList jointAcquisitionList;
	OfficeSupplyList officeSupplyList;
	PaymentDetailList paymentDetailList;
	PerformanceList performanceList;
	ReinsuranceList reinsuranceList;

	// partner
	PartnerCompanyList partnerCompanyList;

	// product
	ProductList productList;

	public static void main(String[] args) {
		Main main = new Main();
		main.initialize();
		main.run();
		main.finalize();
	}

	public Main() {

		// contract
		compensationDetailList = new CompensationDetailListImpl();
		contractList = new ContractListImpl();
		depositDetailList = new DepositDetailListImpl();
		insuranceMoneyList = new InsuranceMoneyListImpl();

		// customer
		accidentHistoryList = new AccidentHistoryListImpl();
		accidentList = new AccidentListImpl();
		counselList = new CounselListImpl();
		customerList = new CustomerListImpl();
		diseaseHistoryList = new DiseaseHistoryListImpl();
		reportList = new ReportListImpl();
		surgeryHistoryList = new SurgeryHistoryListImpl();

		// employee
		complaintList = new ComplaintListImpl();
		departmentList = new DepartmentListImpl();
		employeeList = new EmployeeListImpl();
		familyList = new FamilyListImpl();
		jointAcquisitionList = new JointAcquisitionListImpl();
		officeSupplyList = new OfficeSupplyListImpl();
		paymentDetailList = new PaymentDetailListImpl();
		performanceList = new PerformanceListImpl();
		reinsuranceList = new ReinsuranceListImpl();

		// partner
		partnerCompanyList = new PartnerCompanyListImpl();

		// product
		productList = new ProductListImpl();

	}

	public void initialize() {
		scanner = new Scanner(System.in);
	}

	public void run() {
		showMenu();
	}

	public void finalize() {
		scanner.close();
		System.exit(0);
	}

	public void showMenu() {
		index = -1;
		while (index != 3) {
			System.out.println("신동아화재 어플리케이션 입니다. 실행하려는 어플리케이션 종류를 클릭해주세요.");
			System.out.println("1. 직원 2. 고객 3. 종료");
			try {
				input = scanner.next();
				index = Integer.parseInt(input);
				switch (index) {
				case 1:
					showEmployeeMenu();
					break;
				case 2:
					showCustomerMenu();
					break;
				case 3:
					break;
				default:
					System.out.println("명시된 번호 중에 클릭해주세요.");
				}

			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////Customer task///////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private void showCustomerMenu() {
		index = -1;
		while (index != 3) {
			System.out.println("신동아화재 고객 어플리케이션 입니다. 작업을 클릭해주세요.");
			System.out.println("1. 회원가입 2. 로그인 3. 취소");
			try {
				input = scanner.next();
				index = Integer.parseInt(input);
				switch (index) {
				case 1:
					signUpCustomer();
					break;
				case 2:
					logInCustomer();
					break;
				case 3:
					break;
				default:
					System.out.println("명시된 번호 중에 클릭해주세요.");
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
		index = -1;
	}

	private void signUpCustomer() {
		while (customerList != null) {
			System.out.println("Please input your Name");
			String name = scanner.next();
			System.out.println("Please input your Address");
			String address = scanner.next();
			System.out.println("Please input your BankAccount");
			String bankAccount = scanner.next();
			System.out.println("Please input your PhoneNumber");
			String phoneNumber = scanner.next();
			System.out.println("Please input your Job");
			String job = scanner.next();
			System.out.println("Please input your Property");
			long property = scanner.nextLong();
			System.out.println("Please input your Resident Registration Number");
			String residentRegistrationNumber = scanner.next();
			System.out.println("Please input your age");
			int age = scanner.nextInt();
			System.out.println("Please select your gender");
			System.out.println("1. Male 2. Female");
			input = scanner.next();
			Gender gender = getGender(input);
			System.out.println(gender);

			// 여기 아래애들은 어떻게 받아야 ㅏ 할까요....~
			System.out.println("Please input your ID");
			DiseaseHistoryList diseaseHistory = new DiseaseHistoryListImpl();
			System.out.println("Please input your ID");
			SurgeryHistoryList surgeryHistory = new SurgeryHistoryListImpl();
			System.out.println("Please input your ID");
			AccidentHistoryList accidentHistory = new AccidentHistoryListImpl();

//			Customer customer = new Customer(null, accidentHistory, address, age, bankAccount, null, null, null,
//					diseaseHistory, null, (Integer) null, job, name, phoneNumber, property, residentRegistrationNumber,
//					surgeryHistory);
//
//			customerList.add(customer);
		}
	}

	private Gender getGender(String input) {
		if (input == "1") {
			return Gender.Male;
		} else if (input == "2") {
			return Gender.Female;
		}
		return null;
	}

	private void logInCustomer() {
		index = -1;
		Customer customer = null;
		while (customer == null) {
			System.out.println("ID를 입력해주세요.");
			try {
				input = scanner.next();
				id = Integer.parseInt(input);
				if (input.matches("200\\d+")) {
					Customer customerData = customerList.get(id);
					customer = new Customer(customerData);
					showCustomerTask(customer);
				} else {
					System.out.println("정보를 찾을 수 없습니다. 다시 입력해주세요.");
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
		index = -1;
	}

	private void showCustomerTask(Customer customer) {
		index = -1;
		while (index != 5) {
			System.out.println(customer.getName() + "님! 처리하려는 일을 클릭해주세요.");
			System.out.println("1. 상품 리스트 2. 기가입 보험 관리 3. 사고 신고 4. 민원 신청 5. 취소");
			try {
				input = scanner.next();
				index = Integer.parseInt(input);
				switch (index) {
				case 1:
					index = -1;
					while (index != 3) {
						System.out.println("1. 보험 상품 리스트 2. 대출 상품 리스트 3. 취소");
						try {
							System.out.println("명시된 번호 중에 클릭해주세요.");
							input = scanner.next();
							index = Integer.parseInt(input);
							productList = customer.viewProductList(index);
//							이름 호출
//							for(Product e :productList) {
//								System.out.println(e.getName);
//							}
							if (index == 1) {
								index = -1;
								while (index != 3) {
									System.out.println("1. 상담 신청 2. 보험 가입 신청 3. 취소");
									try {
										input = scanner.next();
										index = Integer.parseInt(input);
										switch (index) {
										case 1:
											customer.buyInsurance();
											break;
										case 2:
											customer.askInsuranceCounsel();
											break;
										case 3:
											break;
										default:
											System.out.println("명시된 번호 중에 클릭해주세요.");
										}
									} catch (Exception e) {
										System.out.println("숫자를 입력해주세요.");
									}
								}
								index = -1;
							} else if (index == 2) {
								index = -1;
								while (index != 2) {
									System.out.println("1. 대출 신청 2. 취소");
									try {
										input = scanner.next();
										index = Integer.parseInt(input);
										switch (index) {
										case 1:
											customer.loan();
											break;
										case 2:
											break;
										default:
											System.out.println("명시된 번호 중에 클릭해주세요.");
										}
									} catch (Exception e) {
										System.out.println("숫자를 입력해주세요.");
									}
								}
								index = -1;
							}else {
								System.out.println("명시된 번호 중에 클릭해주세요.");
							}
						} catch (Exception e) {
							System.out.println("숫자를 입력해주세요.");
						}
					}
					index = -1;
					break;
				case 2:
					index = -1;
					while (index != 7) {
						System.out.println("1. 만기 재가입 신청 2. 부활 신청 3. 보험 해지 신청 4. 배서 신청 5. 보험료 납부 6. 보험금 신청 7. 취소");
						try {
							System.out.println("명시된 번호 중에 클릭해주세요.");
							input = scanner.next();
							index = Integer.parseInt(input);
							customer.manageInsurance(index);
						} catch (Exception e) {
							System.out.println("숫자를 입력해주세요.");
						}
					}
					index = -1;
					break;
				case 3:
					customer.complain();
					break;
				case 4:
					customer.reportAccident();
					break;
				case 5:
					break;
				default:
					System.out.println("명시된 번호 중에 클릭해주세요.");
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
		index = -1;
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////Employee task///////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private void showEmployeeMenu() {
		index = -1;
		while (index != 2) {
			System.out.println("신동아화재 직원 어플리케이션 입니다. 작업을 클릭해주세요.");
			System.out.println("1. 로그인 2. 취소");
			try {
				input = scanner.next();
				index = Integer.parseInt(input);
				switch (index) {
				case 1:
					logInEmployee();
					break;
				case 2:
					break;
				default:
					System.out.println("명시된 번호 중에 클릭해주세요.");
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
		index = -1;
	}

	private void logInEmployee() {
		index = -1;
		Employee employee = null;
		while (employee == null) {
			System.out.println("ID를 입력해주세요.");
			try {
				input = scanner.next();
				id = Integer.parseInt(input);
				if (input.matches("600010\\d+")) {
					Employee uploadEmployeeData = employeeList.get(id);
					employee = new FinancialAccountant(uploadEmployeeData);
					showFinancialAccountantTask(employee);
				} else if (input.matches("600020\\d+")) {
					Employee uploadEmployeeData = employeeList.get(id);
					employee = new Administrative(uploadEmployeeData);
					showAdministrativeTask(employee);
				} else if (input.matches("600030\\d+")) {
					Employee uploadEmployeeData = employeeList.get(id);
					employee = new Compensation(uploadEmployeeData);
					showCompensationTask(employee);
				} else if (input.matches("600040\\d+")) {
					Employee uploadEmployeeData = employeeList.get(id);
					employee = new CustommerSupport(uploadEmployeeData);
					showCustommerSupportTask(employee);
				} else if (input.matches("600050\\d+")) {
					Employee uploadEmployeeData = employeeList.get(id);
					employee = new ManagementPlanning(uploadEmployeeData);
					showManagementPlanningTask(employee);
				} else if (input.matches("600060\\d+")) {
					Employee uploadEmployeeData = employeeList.get(id);
					employee = new HumanResource(uploadEmployeeData);
					showHumanResourceManagementTask(employee);
				} else if (input.matches("600070\\d+")) {
					Employee uploadEmployeeData = employeeList.get(id);
					employee = new CustomerInformationManagement(uploadEmployeeData);
					showCustomerInformationManagementTask(employee);
				} else if (input.matches("600080\\d+")) {
					Employee uploadEmployeeData = employeeList.get(id);
					employee = new Sales(uploadEmployeeData);
					showSalesTask(employee);
				} else if (input.matches("600090\\d+")) {
					Employee uploadEmployeeData = employeeList.get(id);
					employee = new ProductManagement(uploadEmployeeData);
					showProductManagementTask(employee);
				} else if (input.matches("600100\\d+")) {
					Employee uploadEmployeeData = employeeList.get(id);
					employee = new Underwriting(uploadEmployeeData);
					showUnderwritingTask(employee);
				} else if (input.matches("600110\\d+")) {
					Employee uploadEmployeeData = employeeList.get(id);
					employee = new CompensationPlanning(uploadEmployeeData);
					showCompensationPlanningTask(employee);
				} else if (input.matches("600120\\d+")) {
					Employee uploadEmployeeData = employeeList.get(id);
					employee = new ContractManagement(uploadEmployeeData);
					showContractManagementTask(employee);
				} else if (input.matches("600130\\d+")) {
					Employee uploadEmployeeData = employeeList.get(id);
					employee = new LoanManagement(uploadEmployeeData);
					showLoanManagementTask(employee);
				} else {
					System.out.println("정보를 찾을 수 없습니다. 다시 입력해주세요.");
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
		index = -1;
	}

	private void showFinancialAccountantTask(Employee employee) {
		index = -1;
		while (index != 4) {
			System.out.println(employee.getName() + "님! 처리하려는 재무 회계 일을 클릭해주세요.");
			System.out.println("1. 입금 사항 조회 2. 세금납부내역 조회 3. 지급 사항 처리 4. 취소");
			try {
				boolean worked = false;
				while (!worked) {
					input = scanner.next();
					index = Integer.parseInt(input);
					worked = employee.work(index);
					if(!worked) {
						System.out.println("명시된 번호 중에 클릭해주세요.");
					}
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
		index = -1;
	}

	private void showAdministrativeTask(Employee employee) {
		index = -1;
		while (index != 5) {
			System.out.println(employee.getName() + "님! 처리하려는 총무 관리 일을 클릭해주세요.");
			System.out.println("1. 집기 비품 등록 2. 집기 비품 삭제 3. 집기 비품 재고 삭제 4. 집기 비품 재고 수정 5. 취소");

			try {
				boolean worked = false;
				while (!worked) {
					input = scanner.next();
					index = Integer.parseInt(input);
					worked = employee.work(index);
					if(!worked) {
						System.out.println("명시된 번호 중에 클릭해주세요.");
					}
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
		index = -1;
	}

	private void showCompensationTask(Employee employee) {
		index = -1;
		while (index != 2) {
			System.out.println(employee.getName() + "님! 처리하려는 보상 처리 일을 클릭해주세요.");
			System.out.println("1. 보상 요청 2. 취소");
			try {
				boolean worked = false;
				while (!worked) {
					input = scanner.next();
					index = Integer.parseInt(input);
					worked = employee.work(index);
					if(!worked) {
						System.out.println("명시된 번호 중에 클릭해주세요.");
					}
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
		index = -1;
	}

	private void showCustommerSupportTask(Employee employee) {
		index = -1;
		while (index != 3) {
			System.out.println(employee.getName() + "님! 처리하려는 고객 지원 일을 클릭해주세요.");
			System.out.println("1. 민원 처리 2. 신고 처리 3. 취소");
			try {
				boolean worked = false;
				while (!worked) {
					input = scanner.next();
					index = Integer.parseInt(input);
					worked = employee.work(index);
					if(!worked) {
						System.out.println("명시된 번호 중에 클릭해주세요.");
					}
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
		index = -1;
	}

	private void showManagementPlanningTask(Employee employee) {
		index = -1;
		while (index != 5) {
			System.out.println(employee.getName() + "님! 처리하려는 경영 기획 일을 클릭해주세요.");
			System.out.println("1. 부서 정보 등록 2. 부서 정보 삭제 3. 부서 정보 조회 4. 부서 정보 수정 5. 취소");
			try {
				boolean worked = false;
				while (!worked) {
					input = scanner.next();
					index = Integer.parseInt(input);
					worked = employee.work(index);
					if(!worked) {
						System.out.println("명시된 번호 중에 클릭해주세요.");
					}
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
		index = -1;
	}

	private void showHumanResourceManagementTask(Employee employee) {
		index = -1;
		while (index != 7) {
			System.out.println(employee.getName() + "님! 처리하려는 인사 관리 일을 클릭해주세요.");
			System.out.println("1. 직원 정보 등록 2. 직원 정보 삭제 3. 직원 정보 조회 4. 직원 정보 수정 5. 추가 수당 요청 6. 복리후생비용 요청 7. 취소");
			try {
				boolean worked = false;
				while (!worked) {
					input = scanner.next();
					index = Integer.parseInt(input);
					worked = employee.work(index);
					if(!worked) {
						System.out.println("명시된 번호 중에 클릭해주세요.");
					}
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
		index = -1;
	}

	private void showCustomerInformationManagementTask(Employee employee) {
		index = -1;
		while (index != 5) {
			System.out.println(employee.getName() + "님! 처리하려는 고객 정보 관리 일을 클릭해주세요.");
			System.out.println("1. 고객 정보 등록 2. 고객 정보 삭제 3. 고객 정보 조회 4. 고객 정보 수정 5. 취소");
			try {
				boolean worked = false;
				while (!worked) {
					input = scanner.next();
					index = Integer.parseInt(input);
					worked = employee.work(index);
					if(!worked) {
						System.out.println("명시된 번호 중에 클릭해주세요.");
					}
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
		index = -1;
	}

	private void showSalesTask(Employee employee) {
		index = -1;
		while (index != 5) {
			System.out.println(employee.getName() + "님! 처리하려는 영업 일을 클릭해주세요.");
			System.out.println("1. 영업 성과 평가 2. 보험 상담 처리 3. 보험 상품 영업 4. 대출 상품 영업 5. 취소");
			try {
				boolean worked = false;
				while (!worked) {
					input = scanner.next();
					index = Integer.parseInt(input);
					worked = employee.work(index);
					if(!worked) {
						System.out.println("명시된 번호 중에 클릭해주세요.");
					}
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
		index = -1;
	}

	private void showProductManagementTask(Employee employee) {
		index = -1;
		while (index != 5) {
			System.out.println(employee.getName() + "님! 처리하려는 상품 관리 일을 클릭해주세요.");
			System.out.println("1. 보험 상품 등록 2. 보험 상품 삭제 3. 보험 상품 조회 4. 보험 상품 수정 5. 취소");
			try {
				boolean worked = false;
				while (!worked) {
					input = scanner.next();
					index = Integer.parseInt(input);
					worked = employee.work(index);
					if(!worked) {
						System.out.println("명시된 번호 중에 클릭해주세요.");
					}
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
		index = -1;
	}

	private void showUnderwritingTask(Employee employee) {
		index = -1;
		while (index != 4) {
			System.out.println(employee.getName() + "님! 처리하려는 U/W 일을 클릭해주세요.");
			System.out.println("1. 공동 인수 신청 2. 재보험 신청 3. 인수 심사 4. 취소");
			try {
				boolean worked = false;
				while (!worked) {
					input = scanner.next();
					index = Integer.parseInt(input);
					worked = employee.work(index);
					if(!worked) {
						System.out.println("명시된 번호 중에 클릭해주세요.");
					}
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
		index = -1;
	}

	private void showCompensationPlanningTask(Employee employee) {
		index = -1;
		while (index != 6) {
			System.out.println(employee.getName() + "님! 처리하려는 보상 기획 일을 클릭해주세요.");
			System.out.println("1. 협력 업체 등록 2. 협력 업체 삭제 3. 협력 업체 평가 4. 협력 업체 조회 5. 협력 업체 수정 6. 취소");
			try {
				boolean worked = false;
				while (!worked) {
					input = scanner.next();
					index = Integer.parseInt(input);
					worked = employee.work(index);
					if(!worked) {
						System.out.println("명시된 번호 중에 클릭해주세요.");
					}
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
		index = -1;
	}

	private void showContractManagementTask(Employee employee) {
		index = -1;
		while (index != 6) {
			System.out.println(employee.getName() + "님! 처리하려는 계약 관리 일을 클릭해주세요.");
			System.out.println("1. 분납/수금 처리 2. 제지급금 요청 3. 배서 심사 4. 만기 계약 심사 5. 부활 심사 6. 취소");

			try {
				boolean worked = false;
				while (!worked) {
					input = scanner.next();
					index = Integer.parseInt(input);
					worked = employee.work(index);
					if(!worked) {
						System.out.println("명시된 번호 중에 클릭해주세요.");
					}
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
		index = -1;
	}

	private void showLoanManagementTask(Employee employee) {
		index = -1;
		while (index != 7) {
			System.out.println(employee.getName() + "님! 처리하려는 융자 운용 일을 클릭해주세요.");
			System.out.println("1. 대출 상품 등록 2. 대출 원리금 수금 3. 대출 상품 삭제 4. 대출 상품 조회 5. 대출금 요청 6. 대출 상품 조회 7. 취소");
			try {
				boolean worked = false;
				while (!worked) {
					input = scanner.next();
					index = Integer.parseInt(input);
					worked = employee.work(index);
					if(!worked) {
						System.out.println("명시된 번호 중에 클릭해주세요.");
					}
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
		index = -1;
	}

}