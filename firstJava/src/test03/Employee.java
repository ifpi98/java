package test03;

public class Employee {

	// 스태틱 변수
	public static int serialNum = 1000;

	// 멤버변수, 인스턴스변수
	private int employeeId;
	private String employeeName;
	private String department;
		
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public static int showNumber(){
		int number;		// 지역변수, 로컬변수
		number = serialNum;
		return number;
	}


	// static 메소드내부에서는 일반함수는 참조할 수 없다.
	// static 메소드는 지역변수사용가능하고, static변수만 사용가능하다.
	// 인스턴스변수, 인스턴스메소드와 스테틱(static)메소드는
	// 시작부터가 다르다. 메모리에 로딩되는 시점이 다르다.


}
