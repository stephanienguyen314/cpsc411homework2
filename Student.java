package com.example.homeworktwopartone;

import java.util.ArrayList;

public class Student {

    protected String firstName;
    protected String lastName;
    protected int CWID;

    protected ArrayList<CourseEnrollment> courses;

    public Student(String fName, String lName, int ID) {
        firstName = fName;
        lastName = lName;
        CWID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCWID(){
        return CWID;
    }

    public void setFirstName(String fName) {
        firstName = fName;
    }

    public void setLastName(String lName) {
        lastName = lName;
    }

    public ArrayList<CourseEnrollment> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<CourseEnrollment> coursesToSet) {
        courses = coursesToSet;
    }
}
