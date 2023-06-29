package test03;

import java.util.Calendar;

public class School {

    // 내부에서만 접근가능한 스태틱 School 인스턴스로 생성한다.
    private static School instance = new School();
    // 싱글톤을 사용하는 이유는 비용을 줄인다.
    // 메모리 사용을 절약하기 위해서

    // 기본 생성자는 외부에서 사용할 수 없도록 private로 선언한다.
    // 다른 클래스에서 생성할 수 없다.
    private School(){
        System.out.println("학교 인스턴스를 생성하였습니다.");
    }

    // nullPointException 에러 발생

    public static School getInstance(){
        if (instance == null){
            instance = new School();
        }
        return instance;
    }

    public static void main(String[] args) {
//        School 학교1 = new School;
        School 학교1 = School.getInstance();
        School 학교2 = School.getInstance();
        System.out.println(학교1 == 학교2);

        Calendar cale1 = Calendar.getInstance();
//        System.out.println(cale1);
        System.out.println(cale1.getTimeZone());
        System.out.println(cale1.getTime());
    }



}
