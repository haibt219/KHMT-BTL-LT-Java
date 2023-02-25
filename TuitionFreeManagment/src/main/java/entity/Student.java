package entity;

import java.util.Date;

public class Student extends User {
	private double totalDebt;
	private double totalMoneyAvailable;

	public Student() {

	}

	public Student(String fullname, Gender gender, Date birthday, String address, String numberPhone, String email,
			String username, String password, Faculty faculty, Date createDate) {
		super(fullname, gender, birthday, address, numberPhone, email, username, password, Role.STUDENT, faculty,
				createDate);

	}

	public Student(String fullname, Gender gender, Date birthday, String address, String numberPhone, String email,
			String username, String password, Faculty faculty, Date createDate, double totalMoneyAvailable,
			double totalDebt) {
		super(fullname, gender, birthday, address, numberPhone, email, username, password, Role.STUDENT, faculty,
				createDate);
		this.totalMoneyAvailable = totalMoneyAvailable;
		this.totalDebt = totalDebt;
	}

	public double getTotalDebt() {
		return totalDebt;
	}

	public void setTotalDebt(double totalDebt) {
		this.totalDebt = totalDebt;
	}

	public double getTotalMoneyAvailable() {
		return totalMoneyAvailable;
	}

	public void setTotalMoneyAvailable(double totalMoneyAvailable) {
		this.totalMoneyAvailable = totalMoneyAvailable;
	}

	@Override
	public String toString() {
		return "Students [totalMoneyAvailable=" + totalMoneyAvailable + ", totalDebt" + totalDebt + ", UserId="
				+ getUserId() + ", Fullname=" + getFullname() + ", Gender=" + getGender() + ", Birthday="
				+ getBirthday() + ", Address=" + getAddress() + ", NumberPhone=" + getNumberPhone() + ", Email="
				+ getEmail() + ", Username=" + getUsername() + ", Password=" + getPassword() + ", Role=" + getRole()
				+ ", Faculty=" + getFaculty() + ", CreateDate=" + getCreateDate() + "]";
	}

}
