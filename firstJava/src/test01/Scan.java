package test01;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        int a, b, c, d, hap;

        Scanner s = new Scanner(System.in);
        System.out.println("첫번째 숫자 입력");
        a = s.nextInt();

        System.out.println("두번째 숫자 입력");
        b = s.nextInt();

        System.out.println("세번째 숫자 입력");
        c = s.nextInt();

        System.out.println("네번째 숫자 입력");
        d = s.nextInt();

        hap = a + b + c + d;
        System.out.printf("합계=> %d \n", hap);
        s.close();
    }
}
