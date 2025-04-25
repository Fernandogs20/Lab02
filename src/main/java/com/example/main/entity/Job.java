package com.example.main.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "jobs")
public class Job {
    @Id
    @Column(name = "job_id",nullable = false, length = 10)
    private String id;

    @Column(name = "job_title", nullable = false, length = 35)
    private String job_Title;

    @Column(name = "min_salary")
    private Integer minSalary;

    @Column(name = "max_salary")
    private Integer maxSalary;

}