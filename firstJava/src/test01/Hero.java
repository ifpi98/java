package test01;

public class Hero extends Person{

  //  private String name;

    public Hero(String name) {
//        this.name = name;
        this.setName(name);
    }

    public void attack(Hero hero) {
        System.out.println(hero.getName()+ "과" + this.getName()+" 그들이 싸움을 했다.");
    }
}
