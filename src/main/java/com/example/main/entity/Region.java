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
    @Column(name = "region_id", nullable = false)
    private Integer regionId;

    @Column(name = "region_name")
    private String regionName;
}