package test03;

public class StudentTest {
    public static void main(String[] args) {

        Student studentLee = new Student();
        studentLee.studentName = "이순신";
        studentLee.address = "서울";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentName = "김유신";
        studentKim.address = "경주";

        studentKim.showStudentInfo();
        System.out.println(studentLee);
        System.out.println(studentKim);
        // 패키지명.클래스명@32비트주소(16진수)

        Student studentPark = new Student(10, "박문각", "경기도");
        studentPark.showStudentInfo();

        Student studentLee2 = new Student(100, "Lee");
        studentLee2.setKoreaSubject("국어", 100);
        studentLee2.setMathSubject("수학", 95);

        Student studentKim2 = new Student(101, "Kim");
        studentKim2.setKoreaSubject("국어", 80);
        studentKim2.setMathSubject("수학", 99);

        studentLee2.showStudentScore();
        studentKim2.showStudentScore();

    }
}

