package com.omkar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omkar.Dao.courseDao;
import com.omkar.Entity.Courses;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private courseDao cDao;

	public  List<Courses> getCourses(){
		return this.cDao.findAll();	}

	@Override
	public Courses getCourseById(int id) {
		// TODO Auto-generated method stub
		return this.cDao.getById(id);
	}

	@Override
	public Courses addCourse(Courses course) {
		return this.cDao.save(course);
	}

	@Override
	public void deleteCourse(int id) {
		// TODO Auto-generated method stub
		 cDao.deleteById(id);;
	}

	@Override
	public Courses update(Courses course) {
		// TODO Auto-generated method stub
		return this.cDao.save(course);
	}

	@Override
	public Courses getCourseByName(String title) {
		// TODO Auto-generated method stub
		return this.cDao.getCourseByName(title);
	}
	
}
