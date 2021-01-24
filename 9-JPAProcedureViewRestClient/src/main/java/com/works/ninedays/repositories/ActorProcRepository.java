package com.works.ninedays.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.works.ninedays.entities.ActorProc;

public interface ActorProcRepository extends JpaRepository<ActorProc, Integer> {

	//@Procedure(name = "ActorProc.getActorFilm")
	//List<ActorProc> getActorFilm( @Param("actor_name") String actor_name );
	
	//@Query(value = "CALL Actor_Proc(:actor_name)", nativeQuery = true)
	//List<ActorProc> getAllActorFilm( @Param("actor_name") String actor_name );
	
	
}
