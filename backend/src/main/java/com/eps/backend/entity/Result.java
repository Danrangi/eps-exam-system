package com.eps.backend.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Stores each exam attempt by a student.
 */
@Entity
@Table(name = "results")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Student who took the exam
     */
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User student;

    /**
     * The exam they took
     */
    @ManyToOne
    @JoinColumn(name = "exam_id")
    private Exam exam;

    /**
     * Score obtained (e.g 35/50)
     */
    private Integer score;

    /**
     * Total questions attempted
     */
    private Integer totalQuestions;

    /**
     * Timestamp of attempt
     */
    private String takenAt;
}
