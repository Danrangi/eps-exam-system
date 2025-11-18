package com.eps.backend.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Represents each question belonging to an exam.
 */
@Entity
@Table(name = "questions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The question text
     */
    @Column(columnDefinition = "TEXT")
    private String text;

    /**
     * Options A-D
     */
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;

    /**
     * The correct option: "A", "B", "C", or "D"
     */
    private String correctOption;

    /**
     * Relationship:
     * Many questions belong to 1 exam
     */
    @ManyToOne
    @JoinColumn(name = "exam_id")
    private Exam exam;
}
