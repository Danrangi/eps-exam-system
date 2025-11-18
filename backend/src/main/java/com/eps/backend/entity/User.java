package com.eps.backend.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Represents both STUDENTS and ADMINS.
 * We control permission using "role".
 */
@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Student/Teacher/Admin display name
     */
    private String fullName;

    /**
     * Login username (unique)
     */
    @Column(unique = true)
    private String username;

    /**
     * Password will be encrypted when JWT is added
     */
    private String password;

    /**
     * STUDENT or ADMIN
     */
    private String role;  // ("ADMIN" or "STUDENT")
}
