package org.example.exercice3.service;

import org.example.exercice3.model.Student;
import org.example.exercice3.dao.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService{

    private List<Student> students = new ArrayList<>();
//    private Long currentId = 1L;
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


@Override
public Student save(Student student){
        return studentRepository.save(student);
    }
    @Override
    public Student update(Student student){
        return studentRepository.save(student);
    }
    @Override
    public List<Student> findAll(){
        return studentRepository.findAll();
    }
    @Override
    public Student findById(int id){
        return studentRepository.findById(id).orElse(null);
    }
    @Override
    public void delete(Student student){
        studentRepository.delete(student);
    }


}
