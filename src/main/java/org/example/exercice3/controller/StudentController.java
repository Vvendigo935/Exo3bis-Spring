package org.example.exercice3.controller;

import org.example.exercice3.model.Student;
import org.example.exercice3.service.IStudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    private final IStudentService studentService;


    public StudentController(IStudentService studentService){
        this.studentService = studentService;
    }

    // Page Home
    @GetMapping
    public String home(){
        return "home";
    }

    // Page list des students
    @GetMapping("/students")
    public String showStudents(@RequestParam(name = "search",required = false) String search, Model model){
        if(search == null){
            model.addAttribute("students",studentService.findAll());
        }
//        else {
//            model.addAttribute("students",studentService.findById(search);
//        }
        return "list";
    }

    // Page details
    @GetMapping("/student/{id}")
    public String showStudent(@PathVariable int id,Model model){
        model.addAttribute("student",studentService.findById(id));
        return "detail";
    }

    // Page formulaire
    @GetMapping("/formulaire")
    public String formStudent(Model model){
        model.addAttribute("student", new Student());
        return "form";
    }

    // Recuperation des donnees du formulaire
    @PostMapping("/student")
    public String addStudent(@ModelAttribute("student") Student student){
        studentService.save(student);
        return "redirect:/students";
    }

}
