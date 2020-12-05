package com.works.mvcjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.works.mvcjpa.models.Note;

public interface NoteRepository extends JpaRepository<Note, Integer> {

	
	
}
