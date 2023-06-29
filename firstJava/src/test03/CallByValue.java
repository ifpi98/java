package test03;

class myInt{
    int b;
}

public class CallByValue {

    public static void main(String[] args) {
        int a = 10;
        func1(a);
        System.out.printf("값으로 전달하기 => %d\n", a);

        myInt m = new myInt();
        m.b = 100;
        func2(m);
        System.out.println("함수실행후의 참조값" + m.b);
    }

    static void func2(myInt m){
        m.b = m.b+1;
        System.out.println("전달받은 참조변수 값 : " + m.b);
    }

    private static void func1(int b) {
        b = b+1;
        System.out.println("전달받은 a => " + b);
    }
}
