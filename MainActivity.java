package com.example.homeworktwopartone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import com.example.homeworktwopartone.CourseEnrollment;
import com.example.homeworktwopartone.Student;
import com.example.homeworktwopartone.StudentDB;

public class MainActivity extends AppCompatActivity {

    LinearLayout root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createPersonObjects();
        // TODO: update this setContentView
        setContentView(R.layout.activity_main);

        root = findViewById(R.id.student_list);

        ArrayList<Student> studentList = StudentDB.getInstance().getStudentList();
        for(int i = 0; i < studentList.size(); i++) {
            Student s = studentList.get(i);
            //
            LayoutInflater inflater = LayoutInflater.from(this);
            View row_view = inflater.inflate(R.layout.student_row, root, false);
            //
            ((TextView) row_view.findViewById(R.id.student_first_name)).setText(s.getFirstName());
            ((TextView) row_view.findViewById(R.id.student_last_name)).setText(s.getLastName());
            root.addView(row_view);
        }
    }

    protected void createPersonObjects() {
        // This stores the list of all students
        ArrayList<Student> allStudents = new ArrayList<Student>();

        // Initiate instance of new student
        Student student = new Student("Arthur", "Morgan", 1899);
        // This will store the list of all the courses that the student is taking
        ArrayList<CourseEnrollment> courses = new ArrayList<CourseEnrollment>();
        // These are Arthur's 2 courses
        courses.add(new CourseEnrollment("CPSC 120", "A"));
        courses.add(new CourseEnrollment("ENGL 101", "A"));
        // Now add Arthur's 2 courses to his object
        student.setCourses(courses);
        // Now add Arthur to the list of all students
        allStudents.add(student);

        // Now do the same thing for the second student
        // Initiate new instance of new student
        student = new Student("Sadie", "Adler", 1898);
        // This will store the list of all the courses that the student is taking
        courses = new ArrayList<CourseEnrollment>();
        // These are Sadie's 2 courses
        courses.add(new CourseEnrollment("CPSC 120", "A"));
        courses.add(new CourseEnrollment("ENGL 101", "B"));
        // Now add Sadie's 2 courses to her object
        student.setCourses(courses);
        // Now add Sadie to the list of all students
        allStudents.add(student);

        // Add the current list of allStudents to the StudentDB student database
        StudentDB.getInstance().setStudentList(allStudents);
    }
}
