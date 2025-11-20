package studentProject;

public class Student {
	private int  sid;
	private String name;
	private int fee;
	public Student(int sid, String name, int fee) {
		super();
		this.sid = sid;
		this.name = name;
		this.fee = fee;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", fee=" + fee + "]";
	}
	


}
