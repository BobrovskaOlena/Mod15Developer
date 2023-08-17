package com.goit.Mod15Developer.data.repository;

import com.goit.Mod15Developer.data.entity.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<NoteEntity, Long> {
}
