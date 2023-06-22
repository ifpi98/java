package test01;

public class Person {
    private String name;
    private int age;

    // 기본 생성자(){
    public Person(){

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
//        return name + "으로 이름 변경되었습니다.";
        //        return;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
//        return;
    }

    // 어노테이션, 오버라이드되었다. 메소드 재정의
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
