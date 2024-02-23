package org.bootcamp;

public class Course {
    private String courseID;
    private String courseName;
    private String courseHost;
    private String courseDuration;

    public Course(String courseID, String courseName, String courseHost, String courseDuration) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseHost = courseHost;
        this.courseDuration = courseDuration;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseHost() {
        return courseHost;
    }

    public void setCourseHost(String courseHost) {
        this.courseHost = courseHost;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    @Override
    public String toString() {
        return "Course Details: \n" +
                "courseID='" + courseID + '\'' +
                ", \ncourseName='" + courseName + '\'' +
                ", \ncourseHost='" + courseHost + '\'' +
                ", \ncourseDuration='" + courseDuration + '\'';
    }
}
