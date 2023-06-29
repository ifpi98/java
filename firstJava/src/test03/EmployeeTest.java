package test03;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		System.out.println(employeeLee.serialNum);
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
		employeeKim.serialNum++;
		
		System.out.println(employeeLee.serialNum);
		System.out.println(employeeKim.serialNum);

		System.out.println(Employee.showNumber());
		System.out.println(employeeKim.serialNum);
		employeeKim.serialNum++;  // 1002
		System.out.println(employeeKim.serialNum);
		System.out.println(employeeLee.serialNum);
		System.out.println(Employee.serialNum++);
		System.out.println(Employee.serialNum++);
		employeeLee.setEmployeeId(5000);
		System.out.println(employeeLee.getEmployeeId());
		//emp2.setEmployeeId(5000);
		System.out.println(employeeKim.getEmployeeId()); //0
		Employee emp3=new Employee();
		System.out.println(emp3.getEmployeeId());
		Employee emp4=new Employee();
		System.out.println(emp4.getEmployeeId()); // 1007
		// static 변수는 참조변수로 호출하지말고, 클래스명.변수명으로 호출한다.
		System.out.println(Employee.serialNum);
		System.out.println(Employee.serialNum);  // 1008
		Employee emp5=new Employee();
		System.out.println(emp5.getEmployeeId()); // 1008
		Employee emp6=new Employee();
		System.out.println(emp6.getEmployeeId()); // 1009
		System.out.println(Employee.showNumber());

		
	}
}
