package test05;

public class Customer {

	private int customerID;
	private String customerName;
	protected String customerGrade;

	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;

		System.out.println("Customer() 생성자 호출");
	}

	public Customer(int customerId, String customerName) {
		this.customerID = customerId;
		this.customerName = customerName;

		customerGrade = "SILVER";
		bonusRatio = 0.01;

		System.out.println("Customer() 생성자 호출");
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		String showInfo = customerName + "님의 등급은 " + customerGrade +
				"이며, 보너스 포인트는" + bonusPoint + "입니다";
		return showInfo;
		
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}
}
