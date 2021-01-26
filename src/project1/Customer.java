package project1;

public class Customer {

	private int id;
	private String fistName;
	private String lastName;
	private String tcNo;
	private int yearOfBirth; 
	
	public String getTcNo() {
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public int getyearOfBirth() {
		return yearOfBirth;
	}
	public void setyearOfBirth(int birthdate) {
		this.yearOfBirth = birthdate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
