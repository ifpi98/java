package test01;

public class p626 {
    public static void main(String[] args) {

        double dnum = 3.14;
        float fnum = 3.14F;

        System.out.println(dnum);
        System.out.println(fnum);

        double dnum1 = 1;

        for(int i = 0; i<10000; i++) {
            dnum1 = dnum1 + 0.1;
        }
        System.out.println(dnum1);


        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1);

        char ch2 = 66;
        System.out.println(ch2);

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char)ch3);

        //char ch4 = -66;  음수는 대입 할 수 없음

        char ch5 = '한';
        char ch6 = '\uD55C';

        System.out.println(ch5);        //  한
        System.out.println(ch6);        //  관

        char ch7 = '\uAD00';
        System.out.println(ch7);        //  관

        String ch8 = "A";
        System.out.println(ch8);

        boolean isMarried = true;
        System.out.println(isMarried);

        var i = 10;                     // java에서도 var로 변수를 선언할 수 있다.
        var j = 10.0;
        var str = "hello";              //  자동적으로 문자형으로 선언되고 나면

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "test";
        //str = 3;                      // 이후에 숫자로 넣으려고 하면 오류가 발생함

        final int MAX_NUM = 100;
        final int MIN_NUM;

        MIN_NUM = 0;

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

        byte bNum = 10;
        int iNum = bNum;

        int iNum1 = 20;
        float fNum = iNum1;

        int iNumx2 = 10;
        byte bNum2 = (byte)iNumx2;      // 형변환이 필요함

        double dNum = 3.14;
        int iNum2 = (int)dNum;          // 형변환이 필요함


        //MAX_NUM = 1000;               // 한번 넣은 상수값을 변경하려고 하면 오류 발생




    }
}
