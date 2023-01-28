package com.omkar.service;

import java.util.List;

import com.omkar.Entity.Courses;

public interface CourseService {
	public  List<Courses> getCourses();
	public  Courses getCourseById(int id);
	public Courses addCourse(Courses course);
	public void deleteCourse(int id);
	public Courses update(Courses course);
	
}
