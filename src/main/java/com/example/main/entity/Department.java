package com.example.main.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "departments")
public class Department {
    @Id
    @Column(name = "department_id",nullable = false)
    private Integer id;

    @Column(name = "department_name",nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Location manager;

}