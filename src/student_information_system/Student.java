/**
 * 
 */
package student_information_system;

/**
 * 
 */
public class Student {
	int SID;
	String SName;
	int age;
	String gender;
	String batchno;
	String mail;
	public Student(int sID, String sName, int age, String gender, String batchno, String mail) {
		super();
		SID = sID;
		SName = sName;
		this.age = age;
		this.gender = gender;
		this.batchno = batchno;
		this.mail = mail;
	}
	public int getSID() {
		return SID;
	}
	public void setSID(int sID) {
		SID = sID;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBatchno() {
		return batchno;
	}
	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	

}
