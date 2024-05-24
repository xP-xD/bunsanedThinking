package employee;

import java.util.Date;

/**
 * @author ����ȯ
 * @version 1.0
 * @created 20-5-2024 ���� 7:52:22
 */
public class Complaint {

	private ComplaintType complaintType;
	private String content;
	private String employeeName;
	private int id;
	private Date postDate;
	private Date postTime;
	private Date processingDate;
	private ComplaintProcessStatus processStatus;
	private String title;
	public ComplaintType m_ComplaintType;
	public ComplaintProcessStatus m_ComplaintProcessStatus;

	public Complaint(){

	}

	public void finalize() throws Throwable {

	}

	public void handle(){

	}

	public void post(){

	}

}