package test01;

public class Test01 {
    public static void main(String[] args) {
//        System.out.println();
        System.out.println("welcome to my world");
        System.out.println(100);
        System.out.println(100+200);
        int x = 30;
        System.out.println(x);
        System.out.println(x+20);
        x = 300;
        System.out.println(x);
        final int y = 500;      // 상수 선언
        System.out.println(y);
//        y = 600;    // 에러 발생. 상수에 새로운 값을 넣으려고 시도했으므로
        System.out.println(y);
        
        // 정수
        int num = 30;
        long 롱 = 30L;   // 정수 계열에서 가장 큰 수
        short s = 100;
        byte 바이트 = 127;     //8비트, 128부터는 오류

        double dd = 3000.00;
        float ff = 30.0f;
        System.out.println(num + 롱 + s + 바이트 + dd + ff);

        boolean isMarried = true;
        isMarried = false;
        System.out.println(isMarried);

        char c = 'A';       // 거의 사용안함. 홋따옴표
        char cc = '한';

        System.out.printf("%c, %c", c, cc);

        String str = "\nWelcome 여러 글자";
        System.out.println(str);

        int 정수1 = (int)30L;         // type casting 강제 형변환
        long 롱2 = 30;       //  작은 값 -> 큰 값으로 자동형변환

        double ddd = 30.00;
        float fff = 30.0f;

        // boolean  -   1byte
        // char     -   2byte
        // byte     -   1byte
        // short    -   2byte
        // int      -   4byte
        // long(정수) -   8byte L
        // float(실수)    -   4byte f
        // double(실수)   -   8byte

        byte 바이트1 = 127;
        byte 바이트2 = -128;
        System.out.println(바이트1);
        System.out.println(바이트2);

        System.out.printf("저는 %s입니다. 나이는 %d이고, 키는 %.2fcm입니다.","이순신",20,190.5f);
        System.out.printf("\n");
        String str2 = String.format("저는 %s입니다. 나이는 %d이고, 키는 %.2fcm입니다.","이순신",20,190.5f);
        System.out.println(str2);
    }
}
