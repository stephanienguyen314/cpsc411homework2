package com.example.homeworktwopartone;

public class CourseEnrollment {

    protected String courseID;
    protected String grade;

    public CourseEnrollment(String cID, String g) {
        courseID = cID;
        grade = g;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getGrade() {
        return grade;
    }

    public void setCourseID(String cID) {
        courseID = cID;
    }

    public void setGrade(String g) {
        grade = g;
    }
}
