package com.cisc181.core;
import java.util.UUID;
public class Enrollment {
	
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private Double Grade;
	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	public Double getGrade() {
		return Grade;
	}

	public void setGrade(Double grade) {
		Grade = grade;
	}

	private void Enrollemt(){	
	}
	
	public Enrollment(int StudentID, int SectionID){
		int EnrollmentID = StudentID + SectionID;
	}
	public void SetGrade(double Grade){
		this.Grade = Grade;
	}

}
