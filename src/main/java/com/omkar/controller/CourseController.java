package com.omkar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.omkar.Entity.Courses;
import com.omkar.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return "this is home";
	}
	
	//get the courses
	
	@GetMapping("/courses")
	public ResponseEntity<List<Courses>> getCourses(){
		
		return ResponseEntity.ok().body(this.courseService.getCourses());
	}
	@PostMapping("/addCourse")
	public Courses addCourse(@RequestBody Courses couurse) {
		return this.courseService.addCourse(couurse);
	}
		
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable int id){
		
		this.courseService.deleteCourse(id);
	}
	
	@PostMapping("/update")
	public ResponseEntity<Courses> updateCourse(@RequestBody Courses course) {
		
		return ResponseEntity.ok().body(this.courseService.update(course));
	}
	
	@GetMapping("/courses/{title}")
	public ResponseEntity<Courses> getCourseByName(@PathVariable String title)
	{
		return ResponseEntity.ok().body(this.courseService.getCourseByName(title));
	}
}
