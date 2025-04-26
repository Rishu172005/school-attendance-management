package com.school.attendance.school_attendance_management.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.school.attendance.school_attendance_management.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class StudentDaoImpl implements StudentDao{

    @PersistenceContext
    private EntityManager entityManager;
    
    public StudentDaoImpl(EntityManager entityManager){
        this.entityManager =entityManager;
    }
    @Override
    public Student saveStudent(Student student){
        entityManager.merge(student);
        return student;
    }

    @Override
    public List<Student> getAllStudents(){
        return entityManager.createQuery("SELECT s FROM Student s", Student.class).getResultList();
    }
    

}
