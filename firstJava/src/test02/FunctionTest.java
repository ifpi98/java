package test02;

public class FunctionTest {
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 30;
        int sum = n1 + n2;

        int total = addNum(n1,n2);
        System.out.println(total);
        sayHello("안녕하세요");
        int num = calcSum();
        System.out.println("0부터 100까지의 합: " + num);
        double num2 = calcSum(5,2000);
        System.out.println("특정수까지의 합: " + num2);
    }

    private static double calcSum(int start, int end) {
        double sum = 0;
        for (int i = start; i <= end; i++){
            sum += i;
        }
        return sum;
    }

    private static int calcSum() {
        int sum = 0;
        int i;
        for (i = 0; i <= 100; i++){
            sum += i;
        }
        return sum;
    }

    private static void sayHello(String s1) {
        System.out.println(s1);
    }

    private static int addNum(int n1, int n2) {
        return n1 + n2;
    }
}
