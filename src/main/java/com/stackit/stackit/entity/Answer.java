package com.stackit.stackit.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "answers")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String answer;

    private String status;

    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}