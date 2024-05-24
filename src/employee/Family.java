package employee;

import java.util.Date;

/**
 * @author ����ȯ
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:25
 */
public class Family {

	private Date birthDate;
	private String name;
	private RelationshipType relationship;
	private boolean survial;
	public RelationshipType m_Relationship;

	public Family(Date birthDate, String name, RelationshipType relationship, boolean survial) {
		super();
		this.birthDate = birthDate;
		this.name = name;
		this.relationship = relationship;
		this.survial = survial;
	}

	public void finalize() throws Throwable {

	}

}