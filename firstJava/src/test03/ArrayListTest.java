package test03;


// 컬렉션 프레임 워크의 일부, 중요한 자료 구조
// java.util 패키지에 속해있다.
// ArrayList(클래스) -> List(인터페이스) -> Collection(프레임워크)

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("welcome1");
        list.add("welcome");
        list.add("to my world");
        System.out.println(list);
        // ArrayList에 값변경하기
        list.set(1,"Happy Day");
        System.out.println(list);
        list.add("내일은 공공컨텐츠");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove("welcome");
        System.out.println(list);
        System.out.println(list.size());

        for (Object str: list)
            System.out.println(str);


        ArrayList<String> list2 = new ArrayList<>();
        list2.add("abcdefg");
        list2.add("zzzzzz");

        for (String str: list2)
            System.out.println(str);

        // 배열은 iterator()객체이다.
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
