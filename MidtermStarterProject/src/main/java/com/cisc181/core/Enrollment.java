package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment(){}
	
	public Enrollment(UUID StudentID, UUID SectionID){
		this.EnrollmentID = new UUID(StudentID.getLeastSignificantBits(), SectionID.getLeastSignificantBits());
	}
	
	public void SetGrade(double grade){
		this.Grade = grade;
	}
}
