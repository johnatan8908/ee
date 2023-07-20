package com.entregablebackend.entregablebackend.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Counseling {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private LocalDate date;

    @ManyToOne
    @JoinColumn(name="advisor_id")
    private Advisor advisor;

    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;

    public Counseling() {
    }

    public Counseling(LocalDate date, Advisor advisor, Student student) {
        this.date = date;
        this.advisor = advisor;
        this.student = student;
    }
   
    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }        
}
