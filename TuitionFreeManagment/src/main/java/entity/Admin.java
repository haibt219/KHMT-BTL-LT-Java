package entity;

import java.util.Date;

public class Admin extends User {
	private int yearOfExperience;

	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(String fullname, Gender gender, Date birthday, String address, String numberPhone, String email,
			String username, String password, Faculty faculty, Date createDate) {
		super(fullname, gender, birthday, address, numberPhone, email, username, password, Role.ADMIN, faculty,
				createDate);
		// TODO Auto-generated constructor stub
	}

	public Admin(String fullname, Gender gender, Date birthday, String address, String numberPhone, String email,
			String username, String password, Faculty faculty, int yearOfExperience, Date createDate) {
		super(fullname, gender, birthday, address, numberPhone, email, username, password, Role.ADMIN, faculty,
				createDate);
		this.yearOfExperience = yearOfExperience;
	}

	public int getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	@Override
	public String toString() {
		return "Admin [yearOfExperience=" + yearOfExperience + ", UserId=" + getUserId() + ", Fullname=" + getFullname()
				+ ", Gender=" + getGender() + ", Birthday=" + getBirthday() + ", Address=" + getAddress()
				+ ", NumberPhone=" + getNumberPhone() + ", Email=" + getEmail() + ", Username=" + getUsername()
				+ ", Password=" + getPassword() + ", Role=" + getRole() + ", Faculty=" + getFaculty()
				+ ", getCreateDate=" + getCreateDate() + "]";
	}

}
