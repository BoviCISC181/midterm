package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	
	@BeforeClass
	public static void before() throws PersonException{
		/*
		 * i couldnt figure out why, but this BeforeClass method isn't working. 
		 * when i reference one of the arraylists in my test methods, it can't 
		 * find the reference. 
		 * for this reason i put the code below into each test method so i can
		 * actually test stuff.
		 */
		
//		ArrayList<Course> courses = new ArrayList<Course>();
//		courses.add(new Course());
//		courses.add(new Course());
//		courses.add(new Course());
//		
//		ArrayList<Semester> semesters = new ArrayList<Semester>();
//		semesters.add(new Semester());
//		semesters.add(new Semester());
//		
//		ArrayList<Section> sections = new ArrayList<Section>();
//		for (int i=0;i<6;i++){
//			sections.add(new Section());
//		}
//		
//		ArrayList<Student> students = new ArrayList<Student>();
//		for (int i=0;i<10;i++){
//			students.add(new Student("karl","mertens","helge",new Date(1990,6,8),eMajor.BUSINESS,"33 churchill ln","(555)-555-5555","abc@yahoo.com"));
//		}
	}
	
	@Test
	public void majorChangeTest() throws PersonException{
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(new Course());
		courses.add(new Course());
		courses.add(new Course());
		
		ArrayList<Semester> semesters = new ArrayList<Semester>();
		semesters.add(new Semester());
		semesters.add(new Semester());
		
		ArrayList<Section> sections = new ArrayList<Section>();
		for (int i=0;i<6;i++){
			sections.add(new Section());
		}
		
		ArrayList<Student> students = new ArrayList<Student>();
		for (int i=0;i<10;i++){
			students.add(new Student("karl","mertens","helge",new Date(1990,6,8),eMajor.BUSINESS,"33 churchill ln","(555)-555-5555","abc@yahoo.com"));
		}
		
		students.get(0).setMajor(eMajor.CHEM);
		assertEquals(true,students.get(0).getMajor()==eMajor.CHEM);
	}

}
