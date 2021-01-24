package com.works.ninedays.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQuery(
name = "ActorProc.getActorFilm", 
  procedureName = "Actor_Proc", parameters = {
    @StoredProcedureParameter(mode = ParameterMode.IN, name = "actor_name", type = String.class)
    }
)
public class ActorProc {
	
	@Id
	private int film_id;
	private String first_name;
	private String last_name;
	private String title;
	private String description;
	private double rental_rate;
	private Date release_year;

}
