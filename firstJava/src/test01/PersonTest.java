package test01;

public class PersonTest {
    public static void main(String[] args) {
        Person 사람1 = new Person();
        System.out.println(사람1);

        Person 사람2 = new Person("김원빈", 30);
        System.out.println(사람2);
        System.out.println(사람2.getName());
        System.out.println(사람2.getAge());

        Person 사람3 = new Person("이순신", 33);
        System.out.println(사람3);
        System.out.println(사람3.getName());
        System.out.println(사람3.getAge());
//        System.out.println(사람3.setName("원빈"));
        사람3.setName("원빈");
        System.out.println(사람3.getName());

        // 영웅 클래스 Hero
        Hero hero = new Hero("슈퍼맨");
        Hero hero2 = new Hero("배트맨");
        hero.attack(hero2);
        hero2.attack(hero);


    }
}
