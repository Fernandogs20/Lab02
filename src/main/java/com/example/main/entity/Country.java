package com.example.main.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "countries")
public class Country {

    @Id
    @Column(name = "country_id", length = 2)
    private String countryId;

    @Column(name = "country_name", length = 40)
    private String countryName;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;
}