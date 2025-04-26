package com.school.attendance.school_attendance_management.controller;

//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.school.attendance.school_attendance_management.dao.StudentDaoImpl;
import com.school.attendance.school_attendance_management.entity.Student;
import com.school.attendance.school_attendance_management.service.StudentService;
//import com.school.attendance.school_attendance_management.service.StudentServiceImpl;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;



@RestController
//@RequestMapping("/api/student")
public class StudentController {

    //private StudentServiceImpl studentService = new StudentServiceImpl();
    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/welcome")
    public String getWelcomeMessage(){
        return studentService.getWelcomeMessage();
    }
    

    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        Student savedStudent = studentService.addStudent(student);
        return ResponseEntity.ok(savedStudent);
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }
   
    
    
}
