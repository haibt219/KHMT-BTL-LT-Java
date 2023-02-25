package entity;

public class ClassOfStudent {
	private static int count = 0;
	private int classId;
	private String className;

	public ClassOfStudent() {
		// TODO Auto-generated constructor stub
	}

	public ClassOfStudent(int classId, String className) {
		super();
		count++;
		this.classId = count;
		this.className = className;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "ClassOfStudent [classId=" + classId + ", className=" + className + "]";
	}

}
