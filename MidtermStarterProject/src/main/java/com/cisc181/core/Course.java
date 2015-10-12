package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.eMajor;

public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;

	public UUID getCourseID() {
		return CourseID;
	}

	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public int getGradePoints() {
		return GradePoints;
	}

	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}

	public eMajor getMajor() {
		return Major;
	}

	public void setMajor(eMajor major) {
		Major = major;
	}
	
	public Course() {
		
	}

	public Course(eMajor major) {
		//super();
		Major = major;
	}

	public Course(int gradePoints, eMajor major) {
		//super();
		GradePoints = gradePoints;
		Major = major;
	}

	public Course(String courseName, int gradePoints, eMajor major) {
		//super();
		CourseName = courseName;
		GradePoints = gradePoints;
		Major = major;
	}

	public Course(UUID courseID, String courseName, int gradePoints, eMajor major) {
		//super();
		CourseID = courseID;
		CourseName = courseName;
		GradePoints = gradePoints;
		Major = major;
	}
	
	
}
