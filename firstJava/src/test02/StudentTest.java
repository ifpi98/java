package test02;

public class StudentTest {
    public static void main(String[] args) {

        Student1 studentLee = new Student1();
        studentLee.studentName = "이순신";
        studentLee.address = "서울";

        studentLee.showStudentInfo();

        Student1 studentKim = new Student1();
        studentKim.studentName = "김유신";
        studentKim.address = "경주";

        studentKim.showStudentInfo();

        System.out.println(studentLee);
        System.out.println(studentKim);
//        System.out.println(studentLee.studentName);
//        System.out.println(studentLee.address);

    }
}

class Student1 {

    public int studentID;
    public String studentName;
    public String address;

    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }

    public String getStudentName() {
        return studentName;
    }
}
