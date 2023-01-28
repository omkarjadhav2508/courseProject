package com.omkar.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.omkar.Entity.Courses;

public interface courseDao extends JpaRepository<Courses, Integer> //Id is primary key of type Integer
{
	@Query(value="select * from courses where title=?1", nativeQuery = true)
	Courses getCourseByName(String title);

}
