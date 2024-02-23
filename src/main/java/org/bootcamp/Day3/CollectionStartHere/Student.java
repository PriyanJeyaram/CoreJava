package org.bootcamp.Day3.CollectionStartHere;

import java.util.Objects;

public class Student {

    private int studentID;
    private String studentName;
    private int studentAge;
    private char studentGrade;

    public Student(int studentID, String studentName, int studentAge, char studentGrade) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGrade = studentGrade;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public char getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(char studentGrade) {
        this.studentGrade = studentGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentID == student.studentID && studentAge == student.studentAge && studentGrade == student.studentGrade && Objects.equals(studentName, student.studentName);
    }

    @Override
    public int hashCode() {
        return this.studentID;
    }

    @Override
    public String toString() {
        return "Student\n" +
                "studentID=" + studentID +
                "\nstudentName='" + studentName + '\n' +
                "studentAge=" + studentAge +
                "\nstudentGrade=" + studentGrade;
    }
//
//    @Override
//    public int compareTo(Student o) {
//        return this.getStudentID() - o.getStudentID();
////        This returns an int value:
//    }
}
