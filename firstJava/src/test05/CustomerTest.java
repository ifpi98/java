package test05;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		Customer Lee = new Customer();
		Lee.setCustomerName("이순신");
		Lee.setCustomerID(10010);
		Lee.bonusPoint = 1000;
		System.out.println(Lee.showCustomerInfo());

		VIPCustomer Kim = new VIPCustomer();
		Kim.setCustomerName("김유신");
		Kim.setCustomerID(10020);
		Kim.bonusPoint = 10000;
		System.out.println(Kim.showCustomerInfo());

		Customer Park = new VIPCustomer(1020,"박철순");
		Park.bonusPoint = 20000;
		System.out.println(Park.showCustomerInfo());

		Customer Park2 = new VIPCustomer(1021,"박철수");
		Park2.bonusPoint = 25000;
		System.out.println(Park2.showCustomerInfo());

		int price = 10000;
		int cost = Park.calcPrice(price);
		System.out.println(Park.showCustomerInfo()+" 지불금액은"+ cost + "입니다");

		Customer Lee2 = new Customer(1111,"이가나");
		cost = Lee2.calcPrice(price);
		System.out.println(Lee2.showCustomerInfo()+" 지불금액은"+ cost + "입니다");

		Customer Test1 = new Customer(1010,"test1");
		Customer Test2 = new Customer(1011,"test2");
		Customer Test3 = new Customer(1012,"test3");
		Customer Test4 = new Customer(1013,"test4");
		Customer Test5 = new VIPCustomer(1014,"test5");

		ArrayList<Customer> customerList = new ArrayList<Customer>();
		customerList.add(Test1);
		customerList.add(Test2);
		customerList.add(Test3);
		customerList.add(Test4);
		customerList.add(Test5);

		for ( Customer customer : customerList){
			System.out.println(customer.showCustomerInfo());
		}

		price = 10000;
		for (Customer customer : customerList){
			cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + " : " + cost + "지불");
			System.out.println(customer.getCustomerName() + " : " + customer.bonusPoint + "보너스 포인트");

		}

	}
}
