package test01;

import java.util.Scanner;

public class Scan2 {
    public static void main(String[] args) {
//        int a, b, c, d, hap;

        Scanner s = new Scanner(System.in);
        int[] aa = new int[4];

//        System.out.println("첫번째 숫자 입력");
//        aa[0] = s.nextInt();
//
//        System.out.println("두번째 숫자 입력");
//        aa[1] = s.nextInt();
//
//        System.out.println("세번째 숫자 입력");
//        aa[2] = s.nextInt();
//
//        System.out.println("네번째 숫자 입력");
//        aa[3] = s.nextInt();

//        for (int i=0; i<=3; i++){
//            System.out.printf("%d번째 숫자 입력=> ", i+1);
//            aa[i] = s.nextInt();
//        }

        int hap = 0;
        int k=0;

//        while (k<=3){
//            hap += aa[k];
//            k++;
//        }

//        hap = aa[0] + aa[1] + aa[2] + aa[3];
        System.out.printf("합계=> %d \n", hap);
        s.close();

        int score = 100;
        char grade;
        if(score >= 90){
            grade = 'A';
        } else {
            grade = 'B';
        }
        System.out.println(grade);

        grade = (score >= 90) ? 'A' : 'B';
        System.out.println(grade);

        int dan;
        int times;

        for (dan = 2; dan <= 9; dan++){
            if (dan %2 != 0) continue;

            for (times = 1; times <= 9; times++){
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
//            System.out.println();
        }


    }
}
