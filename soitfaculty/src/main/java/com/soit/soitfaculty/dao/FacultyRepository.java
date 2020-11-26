package com.soit.soitfaculty.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soit.soitfaculty.entity.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Integer> {

	//method to sort the result by last name
	public List<Faculty>findAllByOrderByLastNameAsc();
}

