package com.example.main.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "regions")
public class Region {
    @Id
    @Column(name = "region_id",nullable = false)
    private Integer id;

    @Column(name = "region_name", length = 25)
    private String name;

    @OneToMany(mappedBy = "region", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Country> countries;
}