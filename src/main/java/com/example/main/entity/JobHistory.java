package com.example.main.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "job_history")
public class JobHistory {

    @EmbeddedId
    private JobHistoryId id;

    @ManyToOne
    @MapsId("employeeId")
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column(name = "end_date", nullable = false)
    private LocalDateTime endDate;

    @ManyToOne
    @JoinColumn(name = "job_id", nullable = false)
    private Job job;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}

@Embeddable
@Getter
@Setter
class JobHistoryId implements Serializable {
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "start_date")
    private LocalDateTime startDate;

}