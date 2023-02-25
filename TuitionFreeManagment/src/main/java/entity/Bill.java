package entity;

import java.util.Date;

public class Bill {
	private static int count = 0;
	private int billId;
	private User users;
	private Subject subjects;
	private double totalMoney;
	private String note;
	private Date createDate;

	public Bill() {
		count++;
		this.billId = count;
	}

	public Bill(User users, Subject subjects, double totalMoney, String note, Date createDate) {
		super();
		count++;
		this.billId = count;
		this.users = users;
		this.subjects = subjects;
		this.totalMoney = totalMoney;
		this.note = note;
		this.createDate = createDate;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public Subject getSubjects() {
		return subjects;
	}

	public void setSubjects(Subject subjects) {
		this.subjects = subjects;
	}

	public double getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(double totalMoney) {
		this.totalMoney = totalMoney;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", users=" + users + ", subjects=" + subjects + ", totalMoney=" + totalMoney
				+ ", note=" + note + ", createDate=" + createDate + "]";
	}

}
