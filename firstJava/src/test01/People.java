package test01;

public class People {
    // 멤버 변수의 상태는 메소드에 의해 변경되어야 한다.
    private int 배고픔지수 = 30;

    public static void main(String[] args) {
        People 원빈 = new People();
//        원빈.배고픔지수 = 50;   // 이렇게 직접 값을 바꾸는 것을 권장하지 않는다.
        System.out.println(원빈.toString());
        원빈.eat();
        원빈.eat();
        원빈.eat();
        System.out.println(원빈.toString());
        People 장동건 = new People();
        System.out.println(장동건.toString());



        System.out.println(원빈.배고픔지수);
        System.out.println(장동건.배고픔지수);




    }

    // 멤버 함수
    private void eat() {
        배고픔지수 += 10;

    }

    public String toString(){
        String 상태 = "";
        if(배고픔지수<50){
            상태 = "배고프다";
            return 상태;
        }else{
            상태 = "배부르다";
            return 상태;
        }
    }
}
