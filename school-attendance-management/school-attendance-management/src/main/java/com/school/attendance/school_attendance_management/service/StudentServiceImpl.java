package com.school.attendance.school_attendance_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.attendance.school_attendance_management.dao.StudentDao;
//import com.school.attendance.school_attendance_management.dao.StudentDaoImpl;
import com.school.attendance.school_attendance_management.entity.Student;

//import jakarta.persistence.EntityManager;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao studentDao;

     public StudentServiceImpl(StudentDao studentDao){
        this.studentDao = studentDao;
    }

    @Override
    public Student addStudent(Student student){
        return studentDao.saveStudent(student);
        
    }
    @Override
    public List<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }
    public String getWelcomeMessage(){
        return "Welcome to the class of 2021, Hope you are doing well in youir life";
    }
    


    
}
