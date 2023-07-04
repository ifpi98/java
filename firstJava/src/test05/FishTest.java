package test05;

interface Mammal{
    abstract void bear();       //  새끼를 낳는다.
}

interface 파충류{
    abstract void bear();       //  알을 낳는다. 추상 메소드
}

// 추상 클래스는 생성할 수 없다. new Fish() 불가능
abstract class Fish {        // 어류 - 추상 클래스
    void swim(){
        System.out.println("물고기는 헤엄치며 움직인다.");
    }
}

class Whale extends Fish implements Mammal {
    // 추상메소드가 있는 인터페이스를 상속받으면 해당 메소드를 오버라이드해야한다.
    public void bear(){
        System.out.println("고래는 새끼를 낳습니다.");
    }
}

class Snake implements 파충류{
    // 추상메소드가 있는 인터페이스를 상속받으면 해당 메소드를 오버라이드해야한다.
    public void bear(){
        System.out.println("뱀은 알을 낳습니다.");
}


public class FishTest {
    public void main(String[] args) {
        Whale 고래 = new Whale();
        고래.swim();
        고래.bear();
        Snake 뱀 = new Snake();
        뱀.bear();
        Fish 고래2 = new Whale();
//        Fish 뱀2 = new Snake();

    }
}
}
