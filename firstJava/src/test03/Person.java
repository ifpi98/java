package test03;

public class Person {

	String name;
	int age;

	// this를 통해 다른 생성자 함수를 호출하는 예제
	public Person() {
		this("이름없음", 1);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person getPerson() {
		return this;
	}


	public static void main(String[] args)
	{
		Person p = new Person();
		System.out.println(p.name);
		System.out.println(p.age);
		p.name = "James";
		p.age = 37;
		System.out.println(p.name);
		System.out.println(p.age);

		Person p2 = p.getPerson();
		System.out.println(p);
		System.out.println(p2);

		Person p3 = new Person("Mike", 20);
		System.out.println(p3.name);
		System.out.println(p3.age);
	}
}