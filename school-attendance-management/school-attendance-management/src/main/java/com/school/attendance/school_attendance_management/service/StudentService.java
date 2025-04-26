package com.school.attendance.school_attendance_management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.school.attendance.school_attendance_management.entity.Student;
@Service
public interface StudentService {

    Student addStudent(Student student);

    List<Student> getAllStudents();

    String getWelcomeMessage();
   
    
   
    
}
