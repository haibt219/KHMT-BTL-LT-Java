package entity;

public class Faculty {
	private static int count = 0;
	private int facultyId;
	private String facaltyName;

	public Faculty() {
		// TODO Auto-generated constructor stub
	}

	public Faculty(int facultyId, String facaltyName) {
		super();
		count++;
		this.facultyId = count;
		this.facaltyName = facaltyName;
	}

	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	public String getFacaltyName() {
		return facaltyName;
	}

	public void setFacaltyName(String facaltyName) {
		this.facaltyName = facaltyName;
	}

	@Override
	public String toString() {
		return "Faculty [facultyId=" + facultyId + ", facaltyName=" + facaltyName + "]";
	}

}
