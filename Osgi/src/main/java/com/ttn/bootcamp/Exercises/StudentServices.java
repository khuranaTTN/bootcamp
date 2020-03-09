package com.ttn.bootcamp.Exercises;

import java.util.List;

public interface StudentServices {

    void addStudent(Student student);
    Student getStudent(int id);
    void deleteStudent(int  id);
    void isStudentPassed(int id);
    List<Student> getAllStudents();

}
