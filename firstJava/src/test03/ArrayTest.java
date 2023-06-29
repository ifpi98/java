package test03;

public class ArrayTest {
    public static void main(String[] args) {

        int[] arr1 = new int[10];
        int arr2[] = new int[10];
        System.out.println(arr1);
        System.out.println(arr2);

        int[] numbers = new int[] {10, 20, 30};  //개수 생략해야 함
        System.out.println(numbers);

        int[] numbers1 = {10, 20, 30};            // new int[]  생략 가능
        System.out.println(numbers1);

        int[] ids;
        ids = new int[] {10, 20, 30};            // 선언후 배열을 생성하는 경우는 new int[] 생략할 수 없음
        System.out.println(ids);

        int[] arr = new int[10];
        int total = 0;

        for(int i=0, num=1; i< arr.length; i++, num++) {
            arr[i] = num;
        }

        for( int i =0; i<arr.length; i++) {
            total += arr[i];
        }
        System.out.println(total);

        double[] dArr = new double[5];

        dArr[0] = 1.1;
        dArr[1] = 2.1;
        dArr[2] = 3.1;
//        System.out.println(dArr[3]);
//        System.out.println(dArr[4]);
//        dArr[3] = 4.1;
//        dArr[4] = 5.1;

        double mtotal = 1;
        for(int i = 0; i< dArr.length; i++) {
            mtotal *= dArr[i];
//            System.out.println(mtotal);
        }

        System.out.println(mtotal);


        char[] alpahbets = new char[26];
        char ch = 'A';

        for(int i = 0; i<alpahbets.length; i++) {

            alpahbets[i] = ch++;
        }

        for(int i = 0; i<alpahbets.length; i++) {
            System.out.println(alpahbets[i] +","+ (int)alpahbets[i]);
        }



    }
}
