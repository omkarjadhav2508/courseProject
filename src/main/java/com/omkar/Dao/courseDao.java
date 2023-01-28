package com.omkar.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omkar.Entity.Courses;

public interface courseDao extends JpaRepository<Courses, Integer> //Id is primary key of type Integer
{

}
