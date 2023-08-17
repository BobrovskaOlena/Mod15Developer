package com.goit.Mod15Developer.data.entity;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "authorities")
public class AuthorityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;
    @Enumerated(EnumType.STRING)
    @Column
    private Role authority;

    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username", insertable = false, updatable = false)
    private UserEntity user;
}
