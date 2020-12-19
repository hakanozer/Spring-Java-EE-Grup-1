package com.works.mvcjpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.works.mvcjpa.models.Note;

public interface NoteRepository extends JpaRepository<Note, Integer> {

	@Query("select n from Note n where n.title like ?1 or n.detail like ?1")
	List<Note> searchData( String data );
	
}
