package test04;

public class StudentTest {
    public static void main(String[] args) {
        Student kim = new Student(1011, "김가나");
        Student lee = new Student(1012, "리한나");

        kim.addSubject("국어", 100);
        kim.addSubject("수학", 80);

        lee.addSubject("국어", 100);
        lee.addSubject("수학", 80);
        lee.addSubject("영어", 60);

        System.out.println(kim.studentID);
        System.out.println(kim.studentName);
        kim.showStudentInfo();
        System.out.println(lee.studentID);
        System.out.println(lee.studentName);
        lee.showStudentInfo();
    }
}
