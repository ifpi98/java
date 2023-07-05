package test04;

public class Animal {
    public static void main(String[] args) {
        Animal dog = new Animal("강아지", 8);
        Animal cat = new Animal("고양이",13);

        dog.move();
        cat.move();
        dog.getMonth();
        cat.getMonth();
    }

    String name;
    int month;

    public Animal(String name, int month) {
        this.name = name;
        this.month = month;
    }

    public void move(){
        System.out.println(this.name + "가 움직입니다");
    }

    public void getMonth() {
        System.out.println(this.name + "는 " + this.month + "개월입니다.");
    }
}
