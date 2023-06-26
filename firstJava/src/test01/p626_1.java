package test01;

import java.util.Scanner;

public class p626_1 {
    public static void main(String[] args) {

        double dNum = 1.2;
        float fNum = 0.9F;

        int iNum1 = (int) dNum + (int) fNum;
        int iNum2 = (int) (dNum + fNum);

        System.out.println(iNum1);
        System.out.println(iNum2);

        int num = 1000;
        byte bNum = (byte) num;

        double pi = 3.14;
        int fnum = (int) pi;

        System.out.println(bNum);
        System.out.println(fnum);


//        int num2 = 128 + 256 + 256 + 256 + 104;
        // 128 + 256 + 256 + 256 = -128
        // 128 + 256 + 256 + 256 + 104 = 1000 (= -24)
        // 128 + 256 + 256 + 256 + 128 = 1024 (= 0)
//        System.out.println(num2);
//        byte bNum2 = (byte)num2;
//        System.out.println(bNum2);
        // 256 256 256 256

        int total = 10;
        int add = 20;
        total += add;
        System.out.println(total);

        int gameScore = 100;
        int myScore;
        myScore = ++gameScore;      // 증가하고 저장한다.
        System.out.println(myScore + "," + gameScore);
        myScore = gameScore++;      // 저장하고 증가한다.
        System.out.println(myScore + "," + gameScore);

        int num1 = 5;
        int num2 = 3;

        boolean value = (num1 > num2);
        System.out.println(value);

        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);

        int num3 = 10;
        int i = 2;

        boolean value2 = ((num3 = num3 + 10) < 10) && ((i = i + 2) < 10);
        System.out.println(value2);
        System.out.println(num3);
        System.out.println(i);      //  전자가 false였으므로 후자의 계산이 이루어지지 않았다.

        value2 = ((num3 = num3 + 10) < 10) || ((i = i + 2) < 10);
        System.out.println(value2);
        System.out.println(num3);
        System.out.println(i);      //  전자가 false였기 때문에 후자의 계산이 이루어졌다.
        // 만약 참이었다면 후자의 계산이 이뤄지지 않는다.

        int max;
        System.out.println("입력 받은 두 수중 큰 수를 출력하세요\n ");

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("입력1:");
//        int x = scanner.nextInt();
//        System.out.println("입력2:");
//        int y = scanner.nextInt();
//
//        max = (x > y)? x : y;
//        System.out.println(max);

        int A = 0;
        int yourage = 30;
        boolean iseaten = true;
        boolean valuex = (iseaten) || (A = yourage + 3) > 30;
        System.out.println(valuex);
        System.out.println(A);

        int num4 = 5;    // 00000101
        int num5 = 10;    // 00001010

        System.out.println(num4 | num5);
        System.out.println(num4 & num5);
        System.out.println(num4 ^ num5);
        System.out.println(~num4);

        System.out.println(num4 << 2);  // 비트를 왼쪽으로 2칸 옮기면 00010100 (10진수로는 20)이 나옴
        System.out.println(num4);
        System.out.println(num4 <<= 2); // 비트를 왼쪽으로 2칸 옮기면 00010100 (10진수로는 20)이 나옴. 값을 저장함
        System.out.println(num4);       // 저장된 20을 출력함.

        int age = 7;

        //Scanner scanner = new Scanner(System.in);
        //int age = scanner.nextInt();

        if (age >= 8) {
            System.out.println("학교에 다닙니다");
        } else {
            System.out.println("학교에 다니지 않습니다.");
        }

        age = 12;
        int charge;

        if (age < 8) {
            charge = 1000;
            System.out.println("미 취학 아동입니다.");
        } else if (age < 14) {
            charge = 2000;
            System.out.println("초등학생 입니다.");
        } else if (age < 20) {
            charge = 2500;
            System.out.println("중, 고등학생 입니다.");
        } else {
            charge = 3000;
            System.out.println("일반인 입니다.");
        }

        System.out.println("입장료는 " + charge + "원입니다.");

        age = 12;

        if (age < 8) {
            charge = 1000;
            System.out.println("미 취학 아동입니다.");
        }
        if (age < 14) {
            charge = 2000;
            System.out.println("초등학생 입니다.");
        }
        if (age < 20) {
            charge = 2500;
            System.out.println("중, 고등학생 입니다.");
        } else {
            charge = 3000;
            System.out.println("일반인 입니다.");
        }

        System.out.println("입장료는 " + charge + "원입니다.");

        int month = 10;
        int day;

        switch (month) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 2:
                day = 28;
                break;
            default:
                day = 0;
                System.out.println("존재하지 않는 달 입니다.");

        }
        System.out.println(month + "월은 " + day + "일입니다.");

        num = 1;
        int sum = 0;

        while (num <= 10) {

            sum += num;
            num++;
        }

        System.out.println(sum);
        System.out.println(num);

        Scanner scanner = new Scanner(System.in);
        int input;
        sum = 0;
//
//        do {
//            input = scanner.nextInt();
//            sum += input;
//
//        }while(input != 0);
//
//
//        System.out.println(sum);

        int count = 1;
        sum = 0;

        for (i = 0; i < 10; i++, count++) {  //10번
            sum += count;
            //count++;
        }
        System.out.println(sum);


        num = 1;
        total = 0;

        while (num <= 10) {
            total += num;
            num++;
        }
        System.out.println(total);

        Scanner s = new Scanner(System.in);
        String str;
        char ch;
        int upper_cnt = 0, lower_cnt = 0, digit_cnt = 0;
        i = 0;

//        System.out.println("문자열을 입력: ");
//        str = s.nextLine();
//
//        do {
//            ch = str.charAt(i); // i번째의 문자를 ch에 저장한다.
//            if (ch >= 'A' && ch <= 'Z') upper_cnt++;
//            if (ch >= 'a' && ch <= 'z') lower_cnt++;
//            if (ch >= '0' && ch <= '9') digit_cnt++;
//            i++;
//        } while (i < str.length());
//        System.out.printf("대문자 %d개, 소문자 %d개, 숫자 %d개\n", upper_cnt, lower_cnt, digit_cnt);
//        s.close();

        int dan = 2;
        count = 1;

        for (dan = 2; dan <= 9; dan++) {

            for (count = 1; count <= 9; count++) {

                System.out.println(dan + "X" + count + "=" + dan * count);
            }
            System.out.println();
        }

        dan = 2;
        while (dan <= 9) {
            count = 1;
            while (count <= 9) {

                System.out.println(dan + "X" + count + "=" + dan * count);
                count++;

            }
            dan++;
            System.out.println();
        }


//        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력: ");
        int lineCount = scanner.nextInt();
        int spaceCount = lineCount/2 +1;
        int starCount = 1;

        for(i = 0; i<lineCount; i++) {
            for(int j = 0; j<spaceCount; j++) {
                System.out.print(' ');
            }
            for(int j=0; j<starCount; j++) {
                System.out.print('*');
            }
            for(int j = 0; j<spaceCount; j++) {
                System.out.print(' ');
            }

            if(i < lineCount/2) {
                spaceCount-=1;
                starCount+=2;
            }
            else {
                spaceCount+=1;
                starCount-=2;
            }
            System.out.println();
        }


    }
}
