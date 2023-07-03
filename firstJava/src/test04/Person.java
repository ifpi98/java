package test04;

public class Person {

    String name;
    int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void buyCoffee(CoffeeShop shopname, int money) {
        this.money -= money;
        String message = shopname.bewing(money);
        System.out.println(this.name+ "(이/가) " + message);
    }


}
