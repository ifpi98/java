package test03;

public class BirthDayTest {
    public static void main(String[] args) {
        BirthDay birthday1 = new BirthDay();
//        BirthDay birthday2 = new BirthDay(9,21,3299,true);

        birthday1.printDay();
//        System.out.println(birthday1.getDay() + " - " +  birthday1.getMonth() + " - " + birthday1.getYear());
        System.out.println(birthday1.isValid());

        birthday1.setYear(3223);
        birthday1.setMonth(1);
        birthday1.setDay(30);
//        birthday1.setValid(true);

//        System.out.println(birthday1.getDay() + " - " +  birthday1.getMonth() + " - " + birthday1.getYear());
//        System.out.println(birthday1.getMonth());
//        System.out.println(birthday1.getYear());
        birthday1.printDay();
        System.out.println(birthday1.isValid());

//        birthday2.printDay();
//        System.out.println(birthday2);
    }
}
