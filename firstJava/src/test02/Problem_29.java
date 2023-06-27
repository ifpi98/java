package test02;

public class Problem_29 {
    public static void main(String[] args) {

        Pet pet1 = new Pet();
        pet1.setType("강아지");
//        pet1.type = "강아지";
        pet1.setAge(8);
//        pet1.age = 8;
        Pet.count++;

        Pet pet2 = new Pet();
        pet2.setType("고양이");
//        pet2.type = "고양이";
        pet2.setAge(13);
//        pet2.age = 13;
        Pet.count++;

        pet1.move();
        pet2.move();

        System.out.println(pet1.getType() + "는 " + pet1.getAge() + "개월입니다.");
        System.out.println(pet2.getType() + "는 " + pet2.getAge() + "개월입니다.");
        System.out.println("현재 우리집 애완동물 수는 " + Pet.getCount() + "마리입니다.");

    }

}

class Pet {

    private String type; // 애완동물 종류
    private int age; // 애완동물 개월수
    static int count = 0; // 애완동물 수


    void move() {
        System.out.println(this.type + "가 움직입니다.");
    }

    int getAge() {
        return this.age;
    }

    static int getCount() {
        return count;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}