package org.example.exercice3.service;

import org.example.exercice3.model.Student;

import java.util.List;

public interface IStudentService {


//    List<Student> searchStudents(String search);

    Student save(Student student);

    Student update(Student student);

    List<Student> findAll();

    Student findById(int id);

    void delete(Student student);
}
