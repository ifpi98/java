package test04;

import java.sql.Array;
import java.util.ArrayList;

public class Student {

    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;

    public Student(int studentid, String studentName){
        this.studentID = studentid;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score){
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);

        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;
        for (Subject s: subjectList){
            System.out.println(s.getName() + " : " + s.getScorePoint());
            total += s.getScorePoint();
        }
        System.out.println(studentName + " " + subjectList.size() + "과목 총점은 " + total);
    }
}
