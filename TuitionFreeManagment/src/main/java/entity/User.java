package entity;

import java.util.Date;

public class User {
	private static int count = 0;
	private int userId;
	private String fullname;
	private Gender gender;
	private Date birthday;
	private String address;
	private String numberPhone;
	private String email;
	private String username;
	private String password;
	private Role role;
	private Faculty faculty;
	private Date createDate;

	public User() {

	}

	public User(String fullname, Gender gender, Date birthday, String address, String numnerPhone, String email,
			String username, String password, Role role, Faculty faculty) {
		super();
		count++;
		this.userId = count;
		this.fullname = fullname;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
		this.numberPhone = numnerPhone;
		this.email = email;
		this.username = username;
		this.password = password;
		this.role = role;
		this.faculty = faculty;
		java.util.Date date = new java.util.Date();
		this.createDate = date;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numnerPhone) {
		this.numberPhone = numnerPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", fullname=" + fullname + ", gender=" + gender + ", birthday=" + birthday
				+ ", address=" + address + ", numberPhone=" + numberPhone + ", email=" + email + ", username="
				+ username + ", password=" + password + ", role=" + role + ", faculty=" + faculty + ", createDate="
				+ createDate + "]";
	}

}
