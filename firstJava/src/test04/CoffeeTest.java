package test04;

public class CoffeeTest {
    public static void main(String[] args) {

        CoffeeShop StarBucks = new CoffeeShop();
        CoffeeShop CoffeeBean = new CoffeeShop();

        System.out.println(StarBucks.bewing(Menu.STAR_AMERICANO));
        System.out.println(StarBucks.bewing(Menu.STAR_LATTE));
        System.out.println(CoffeeBean.bewing(Menu.BEAN_AMERICANO));
        System.out.println(CoffeeBean.bewing(Menu.BEAN_LATTE));

        System.out.println(StarBucks.money);
        System.out.println(CoffeeBean.money);

        Person kim = new Person("kim", 10000);
        Person lee = new Person("lee", 20000);

        kim.buyCoffee(StarBucks, Menu.STAR_AMERICANO);
        lee.buyCoffee(CoffeeBean, Menu.BEAN_LATTE);
        System.out.println(StarBucks.money);
        System.out.println(CoffeeBean.money);
        System.out.println(kim.money);
        System.out.println(lee.money);

        Menu menu = new Menu();
        System.out.println(menu.STAR_A);
        System.out.println(menu.STAR_B);
        System.out.println(menu.BEAN_A);
        System.out.println(menu.BEAN_B);

    }



}
