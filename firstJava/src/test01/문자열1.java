package test01;

public class 문자열1 {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        String str2 = "Java IT Programming";
        String str3 = "Java Programming";
        System.out.println("str1: "+ str1);
        System.out.println("str2: "+ str2);
        System.out.println("str3: "+ str3);
        System.out.println(str1.compareTo(str2));       //  7 문자를 뺀다. 코드값을 뺀다.
        System.out.println(str1.compareTo(str3));       //  0
        System.out.println(str1.contains("Java"));      // 해당 글자가 있으므로 true
        System.out.println(str1==str2);                 //  false
        System.out.println(str1.equals(str2));          //  false
        System.out.println(str1.equals(str3));          //  true

        System.out.println("문자열1의 길이 " + str1.length());

        System.out.println(str1.startsWith("J"));       //  문자열의 시작단어
        System.out.println(str1.endsWith("g"));       //  문자열의 시작단어

        System.out.println(str1.indexOf("Java"));           // 해당 단어의 위치 (여러개 있으면 처음)
        System.out.println(str2.lastIndexOf("IT"));     // 해당 단어의 위치 (여러개 있으면 마지막)

        System.out.println(str1.replace("Java", "자바"));

        System.out.println(str2.substring(0,4));        // 0번부터 4번앞(3번 인덱스)까지를 출력

        String str4[] = str1.split(" ");
        System.out.println(str4[1]);
        for(int i=0; i<str4.length; i++){
            System.out.println("분리한 문자열" + i + "=>" + str4[i]);
        }

        System.out.println(str3.toUpperCase());

        String str5 = "welcome";
        String str6 = new String("welcome");
        String str7 = "welcome";
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str5==str6);     //  내용이 같지만 메모리 주소가 다르므로 false
        System.out.println(str5==str7);
        System.out.println(str5.equals(str6));  // 내용이 같은지만 확인할 경우

        String str8 = new String("welcome");
        System.out.println(str6 == str8);       // 둘은 메모리 주소가 다르다.
        System.out.println(str6.equals(str8));  // 내용은 같다.

    }
}
