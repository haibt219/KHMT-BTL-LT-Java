package entity;

public class Subject {
	private static int count = 0;
	private Integer subjectId;
	private String subjectName;
	private int signalNumber;
	private double amountOfMoney;

	public Subject() {
		count++;
		this.subjectId = count;
	}

	public Subject(String subjectName, int signalNumber, double amountOfMoney) {
		super();
		count++;
		this.subjectId = count;
		this.subjectName = subjectName;
		this.signalNumber = signalNumber;
		this.amountOfMoney = amountOfMoney;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSignalNumber() {
		return signalNumber;
	}

	public void setSignalNumber(int signalNumber) {
		this.signalNumber = signalNumber;
	}

	public double getAmountOfMoney() {
		return amountOfMoney;
	}

	public void setAmountOfMoney(double amountOfMoney) {
		this.amountOfMoney = amountOfMoney;
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + ", signalNumber=" + signalNumber
				+ ", amountOfMoney=" + amountOfMoney + "]";
	}

}
