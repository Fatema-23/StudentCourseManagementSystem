package StudentCourseManagementSystem.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sId;
	private String sName;
	private String sAdYear;
	private String sAddress;
	private int sPhone;
	private String sEmail;
	private String sCourse;
	
	public Student() {
		super();
		
	}
	
	public Student(int sId, String sName, String sAdYear , String sAddress , int sPhone ,String sEmail, String sCourse) {
		    super();
			this.sId =sId;
			this.sName =sName;
			this.sAdYear =sAdYear;
			this.sAddress =sAddress;
			this.sPhone =sPhone;
			this.sEmail =sEmail;
			this.sCourse =sCourse;
			
		}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsAdYear() {
		return sAdYear;
	}

	public void setsAdYear(String sAdYear) {
		this.sAdYear = sAdYear;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	public int getsPhone() {
		return sPhone;
	}

	public void setsPhone(int sPhone) {
		this.sPhone = sPhone;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	
	public String getsCourse() {
		return sCourse;
	}
	
	public void setsCourse(String sCourse) {
		this.sCourse = sCourse;
	}
	
	public String toString() {
		return "Student [sId = " + sId + ", sName = " + sName + " , sAdYear = " + sAdYear + " , "
 + "sAddress = " + sAddress + " , sPhone =  " + sPhone +  " , sEmail = " + sEmail + " , sCourse = " + sCourse + "]";
		
	}
	
	

}
