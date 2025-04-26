package com.school.attendance.school_attendance_management.dao;

import java.util.List;

import com.school.attendance.school_attendance_management.entity.Student;

public interface StudentDao {

    Student saveStudent(Student student);
    List<Student> getAllStudents();
    



    
}
