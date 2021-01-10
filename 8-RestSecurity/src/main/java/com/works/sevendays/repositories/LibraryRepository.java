package com.works.sevendays.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.works.sevendays.entities.Library;

public interface LibraryRepository extends JpaRepository<Library, Long> {

}
