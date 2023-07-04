package test05;

public class Dog extends Pet{
    String name;
    int weight;
    int getWeight(){
        return weight;
    }

    public void move(){
        System.out.println(this.name + "움직입니다");
    }
}
