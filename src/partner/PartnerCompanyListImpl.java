package partner;

import java.util.ArrayList;

import exception.NotExistException;

/**
 * @author KimChan
 * @version 1.0
 * @created 27-5-2024 ���� 4:40:43
 */
public class PartnerCompanyListImpl implements PartnerCompanyList {
	
	private static int index =0;
	private ArrayList<PartnerCompany> partnerCompanyList;

	public PartnerCompanyListImpl(){
		partnerCompanyList = new ArrayList<PartnerCompany>();
		
		this.add(new PartnerCompany("저스티스리그", "010-2583-6914", PartnerCompanyType.RoadsideAssistanceCompany, "슈퍼맨", "010-7258-3691"));
		this.add(new PartnerCompany("어벤져스", "010-4725-8369", PartnerCompanyType.DamageAssessmentCompany, "아이언맨", "010-1472-5836"));
		
	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param partnerCompany
	 */
	public void add(PartnerCompany partnerCompany){
		
		index++;
		String compound = PartnerCompany.PARTNER_COMPANY_SERIAL_NUMBER + "" +index;
		partnerCompany.setId(Integer.parseInt(compound));
		this.partnerCompanyList.add(partnerCompany);
	}

	/**
	 * 
	 * @param id
	 * @throws NotExistException 
	 */
	public void delete(int id) throws NotExistException{
		for (PartnerCompany e : partnerCompanyList) {
			if (e.getId() == id) {
				partnerCompanyList.remove(e);
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
	public PartnerCompany get(int id) throws NotExistException{
		for (PartnerCompany partnerCompany : partnerCompanyList) {
			if (partnerCompany.getId() == id) {
				return partnerCompany.clone();
			}
		}
		throw new NotExistException();
	}


	@Override
	public ArrayList<PartnerCompany> getAllRoadAssistanceCompany() {
		ArrayList<PartnerCompany> partnerCompanys = new ArrayList<>();
		for (PartnerCompany partnerCompany : partnerCompanyList) {
			if (partnerCompany.getPartnerCompanyType() == PartnerCompanyType.RoadsideAssistanceCompany) {
				partnerCompanys.add(partnerCompany);
			}
		}
		return partnerCompanys;
	}

	@Override
	public ArrayList<PartnerCompany> getAllDamageAssessmentCompany() {
		ArrayList<PartnerCompany> partnerCompanys = new ArrayList<>();
		for (PartnerCompany partnerCompany : partnerCompanyList) {
			if (partnerCompany.getPartnerCompanyType().equals( PartnerCompanyType.DamageAssessmentCompany) ){
				partnerCompanys.add(partnerCompany);
			}
		}
		return partnerCompanys;
	}

	@Override
	public ArrayList<PartnerCompany> getAll() {
		// TODO Auto-generated method stub
		return partnerCompanyList;
	}

	@Override
	public void update(PartnerCompany partnerCompany) throws NotExistException {
		for (int i = 0; i < partnerCompanyList.size(); i++) {
			if (partnerCompanyList.get(i).getId() == partnerCompany.getId()) {
				partnerCompanyList.set(i, partnerCompany);
				return;
			}
		}
		throw new NotExistException();
	}

	@Override
	public PartnerCompany getDamageAssessmentCompany(int id) throws NotExistException {
		for (PartnerCompany partnerCompany : partnerCompanyList) {
			if (partnerCompany.getId() == id) {
				if (partnerCompany.getPartnerCompanyType() == PartnerCompanyType.DamageAssessmentCompany) {
					return partnerCompany.clone();
				} else {
					throw new NotExistException();
				}
			}
		}
		throw new NotExistException();
	}

	@Override
	public PartnerCompany getRoadAssistanceCompany(int id) throws NotExistException {
		for (PartnerCompany partnerCompany : partnerCompanyList) {
			if (partnerCompany.getId() == id) {
				if (partnerCompany.getPartnerCompanyType() == PartnerCompanyType.RoadsideAssistanceCompany) {
					return partnerCompany.clone();
				} else {
					throw new NotExistException();
				}
			}
		}
		throw new NotExistException();
	}

}