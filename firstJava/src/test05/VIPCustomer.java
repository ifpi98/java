package test05;

public class VIPCustomer extends Customer{

	private int agentID;
	double salesRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";    //오류 발생
		bonusRatio = 0.05;
		salesRatio = 0.1;

		System.out.println("VIPCustomer 생성자 호출");
	}

	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "VIP";    //오류 발생
		bonusRatio = 0.05;
		salesRatio = 0.1;

		System.out.println("VIPCustomer 생성자 호출");
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "상담원 아이디는 " + agentID;
	}

	public int getAgentID() {
		return agentID;
	}
}
