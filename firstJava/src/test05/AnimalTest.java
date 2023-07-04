package test05;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        Animal 사람 = new Human();
        Animal 호랑이 = new Tiger();
        Animal 독수리 = new Eagle();

        ArrayList<Animal> 동물원 = new ArrayList<Animal>();
        동물원.add(사람);
        동물원.add(호랑이);
        동물원.add(독수리);

        for (Animal 동물: 동물원){
            동물.move();
        }

        animalMove(사람);
        animalMove(호랑이);
        animalMove(독수리);


    }

    private static void animalMove(Animal animal) {
        animal.move();
    }
}

class Animal{
    public void move(){
        System.out.println("animal moves");
    }
}


class Human extends Animal{
    public void move(){
        System.out.println("Human walks");
    }
}

class Tiger extends Animal{
    public void move(){
        System.out.println("Tiger runs");
    }
}

class Eagle extends Animal{
    public void move(){
        System.out.println("Eagle flies");
    }
}