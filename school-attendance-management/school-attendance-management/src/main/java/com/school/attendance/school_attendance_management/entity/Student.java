package com.school.attendance.school_attendance_management.entity;

//import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
@Entity
public class Student {
    
   

   //@IdClass(StudentId.class)

    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        
        @Version
        private Integer version;
        
        private String roll;

        private String name;
        private String email;

        public Student(){}
        public Student(String name, String roll, String email){
            this.name =name;
            this.roll=roll;
            this.email=email;
        }

        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getRoll() {
            return roll;
        }
        public void setRoll(String roll) {
            this.roll = roll;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }

    }

