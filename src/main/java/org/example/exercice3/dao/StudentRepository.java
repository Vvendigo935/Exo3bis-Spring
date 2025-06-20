package org.example.exercice3.dao;

import org.example.exercice3.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {




}
