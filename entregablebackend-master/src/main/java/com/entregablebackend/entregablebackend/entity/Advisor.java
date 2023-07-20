package com.entregablebackend.entregablebackend.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name="advisors")
public class Advisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phone;
    private String email;
    
    public Advisor() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public Program getProgram() {
        return program;
    }

    @ManyToOne
    @JoinColumn(name="program_id")
    private Program program;

    @OneToMany (mappedBy = "advisor")
    private List<Counseling> counseling;

    public void setCounseling(List<Counseling> counseling) {
        this.counseling = counseling;
    }
    
}
