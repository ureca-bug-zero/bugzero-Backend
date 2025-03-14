package com.uplus.bugzerobackend.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@Setter
@Getter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class TodoList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동으로 1씩 추가
    @Column(name = "id", updatable = false, columnDefinition = "INTEGER")
//    @Column(name = "id", updatable = false)
    private Integer id;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "isMission", nullable = false, columnDefinition = "TINYINT(1)")
    private boolean isMission;

    @Column(name = "isChecked", nullable = false, columnDefinition = "TINYINT(1)")
    private boolean isChecked;

    @Column(name = "link", length=512)
    private String link;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, columnDefinition = "INTEGER")
//    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
