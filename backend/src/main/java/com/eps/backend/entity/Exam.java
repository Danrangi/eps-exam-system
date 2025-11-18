package com.eps.backend.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Represents any exam in the system:
 * - JAMB (4 subjects)
 * - WAEC (single subject)
 * - NECO (single subject)
 */
@Entity
@Table(name = "exams")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * e.g "Mathematics", "English", "Chemistry"
     */
    private String subject;

    /**
     * JAMB, WAEC or NECO
     */
    @Enumerated(EnumType.STRING)
    private ExamType examType;

    /**
     * Time allowed (minutes) — optional
     */
    private Integer duration;
}
