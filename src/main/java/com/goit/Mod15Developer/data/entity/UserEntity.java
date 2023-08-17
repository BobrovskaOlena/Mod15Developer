package com.goit.Mod15Developer.data.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Getter
@Setter
@ToString
@Entity
@Table(name = "users")

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String enabled;

    @Column
    private String email;

    @Override
    public int hashCode() {
        return 1;
    }

    @OneToMany(mappedBy = "user")
    private List<AuthorityEntity> authorities;
    @OneToMany(mappedBy = "user")
    private List<NoteEntity> notes;
}
