package employee.department;

import java.util.ArrayList;

import exception.NotExistException;

/**
 * @author KimChan
 * @version 1.0
 * @created 27-5-2024 ���� 4:40:41
 */

//2024-06-02 김대현
public class DepartmentListImpl implements DepartmentList {

	private ArrayList<Department> departmentList;
	public static int DepartmentId = 0;

	public DepartmentListImpl(){
		departmentList = new ArrayList<Department>();
		
		this.add(new Department("융자운용팀", "융자운용", "대출 상품 관리, 대출 원리금 수금, 대출금 요청", "김대현"));
		this.add(new Department("계약관리팀", "계약관리", "분납/수금 처리, 만기 계약 심사, 배서 심사, 부활 심사, 제지급금 요청", "김찬"));
		this.add(new Department("보상기획팀", "보상기획", "협력업체 평가, 협력업체 관리", "허리나"));
		this.add(new Department("U/W팀", "인수", "공동인수,재보험 신청, 인수 심사", "모지환"));
		this.add(new Department("상품관리팀", "상품관리", "보험 상품 관리", "박보검"));
		this.add(new Department("영업팀", "영업", "영업 성과 평가, 보험 상담 처리, 보험 상품 영업, 대출 상품 영업", "김민재"));
		this.add(new Department("고객정보관리팀", "고객정보관리", "고객정보관리", "손흥민"));
		this.add(new Department("인사관리팀", "인사관리", "추가 수당 요청, 복리후생비용 요청, 직원 정보 관리", "이상혁"));
		this.add(new Department("경영기획팀", "경영기획", "부서 정보 관리", "김수현"));
		this.add(new Department("고객지원팀", "고객지원", "신고 처리, 민원 처리", "김채원"));
		this.add(new Department("보상처리팀", "보상처리", "보상 요청", "안유진"));
		this.add(new Department("총무관리팀", "총무관리", "집기비품 재고 관리", "최예나"));
		this.add(new Department("재무회계팀", "재무회계", "세금 납부 내역 조회, 지급 사항 처리, 입금 사항 조회", "박지성"));
	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param department
	 */
	public void add(Department department){
		DepartmentId++;
		String compound = Department.DepartmentSerialNum +""+ DepartmentId;
		department.setId(Integer.parseInt(compound));
		departmentList.add(department);
	}

	/**
	 * 
	 * @param id
	 * @throws NotExistException 
	 */
	public void delete(int id) throws NotExistException{
		for (Department e : departmentList) {
			if (e != null && e.getId() == id) {
				departmentList.remove(e);
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
	public Department get(int id) throws NotExistException{
		for (Department e : departmentList) {
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
	public void update(Department department) throws NotExistException{
		for (int i = 0; i < departmentList.size(); i++) {
			if (departmentList.get(i).getId() == department.getId()) {
				departmentList.set(i, department);
				return;
			}
		}
		throw new NotExistException();
	}

	@Override
	public ArrayList<Department> getAll() {
		ArrayList<Department> result = new ArrayList<>();
		for (Department department : departmentList) {
			result.add(department.clone());
		}
		return result;
	}

}