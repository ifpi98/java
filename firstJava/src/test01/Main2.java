package test01;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        //조건문
        int i = 10;
        if(i>5){
            System.out.println("참이다");
        } else {
            System.out.println("거짓이다");
        }

        if(i>5){
            System.out.println("참이다");
        } else if(i<5) {
            System.out.println("거짓이다");
        } else {
            System.out.println("나머지입니다");
        }

        // 삼항연산자 ?
        boolean isMarried = true;
        String str;
        str=isMarried ? "결혼했다" : "미혼";
        System.out.println(str);

        if(isMarried){
            str = "Welcome to ";
        }else{
            str = "NONE";
        }
        System.out.println(str);

        boolean isMan = false;
        if(isMarried || isMan){
            str = " Hi happy day";
        } else {
            str = " blue day";
        }
        System.out.println(str);

        if(isMarried && isMan){
            str = " Hi happy day";
        } else {
            str = " blue day";
        }
        System.out.println(str);

        str = "결혼했다";
        switch (str){
            case "결혼했다":
                System.out.println("0000");
                break;
            case "미혼":
                System.out.println("XXXX");
                break;
            default:
                System.out.println("????");

        }

        // 반복문
        for (var a = 0; a < 10; a++){
            System.out.println(a);
        }

        int j=0;
        while(j<10){
            System.out.println(j);
            j++;
        }

        int k=0;
        do{
            System.out.println(k+" ");
            k++;
        }while(k<10);

        System.out.println("LLLLLIIIIIIINNNNNNEEEEE");
        //break, continue
        for (int b=0; b < 10; b++){
            System.out.println(b + " - ");
            if (b==6) break;
        }
        System.out.println("LLLLLIIIIIIINNNNNNEEEEE");
        for (int c=0; c < 10; c++){
            if (c % 6 == 0) continue;       // 6으로 나눈 나머지가 0인 경우는 아래 내용은 건너띄고 다시 반복문 시작
            System.out.println(c + " - ");
        }

        //배열
        int[] score = new int[5];       //  초기화는 모두 0으로 되어 있다. 정수형을 선언하였으므로
        System.out.println(score);      //  주소가 출력됨
        int count = score.length;
        System.out.println(count);
        System.out.println(score[0]);
        score[2] = 10;

        for (int d=0; d<count; d++){
            System.out.println(d + " - " + score[d] +" ");
        }

        int[] score2 = new int[]{10,20,30,40,50};

        for (int d=0; d<count; d++){
            System.out.println(d + " - " + score2[d] +" ");
        }

        int[] score3 = {100, 200, 300, 400, 500};
        for (int d=0; d<count; d++){
            System.out.println(d + " - " + score3[d] +" ");
        }

        String[] name = {"홍길동", "강감찬", "을지문덕"};
        System.out.println(name[1]);
        System.out.println(name.length);
        String[] name2 = new String[2];     //초기화 안했더니 null
        System.out.println(name2.length);   // 배열의 개수, ()를 쓰지 않는다.
        System.out.println(name2[0]);
        System.out.println(name2[1]);
        System.out.println(name[1].length());   // 요소의 길이(String의 경우 글자수). ()를 사용한다.
        System.out.println(name[2].length());

        // <> wrapper 클래스 -> 자료형, Integer, String
        ArrayList<Integer> scoreList = new ArrayList<>();
        // ArrayList<타입>(생성자)
        scoreList.add(10);
        scoreList.add(50);
        scoreList.add(30);
        scoreList.add(40);
        System.out.println(scoreList.get(1));
        scoreList.add(2,200);
        System.out.println(scoreList);
        scoreList.remove(1);
        System.out.println(scoreList);

        add(10, 20);
        add(10,20,30);
        mul(10,4);
        mul(10,4,5);
        System.out.println(add(1,2,3,4,5,6,7,8));


    }

    private static int add(int... num){
        int sum = 0;
        for (int i=0; i<num.length;i++){
            sum += num[i];
        }
        return sum;
    }

    private static void mul(int x, int y, int z) {
        System.out.println(x*y*z);
    }

    private static void mul(int x, int y) {
        System.out.println(x*y);
    }

    // 멤버함수
    private static void add(int x, int y) {
        System.out.println(x+y);
        //        return x + y;
    }

    // 메소드 오버로딩 : 함수명은 같고, 매개변수가 다른 함수
    private static void add(int x, int y, int z) {
        System.out.println(x+y+z);
        //        return x + y;
    }

    // static이 붙어 있으면 메모리에 프로그램이 실행될 때 처음으로 로드가 되는 부분이다.
    // 별도의 영역에 메모리를 차지한다. static메모리 영역

}
