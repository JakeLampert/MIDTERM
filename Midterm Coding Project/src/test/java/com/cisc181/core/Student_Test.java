package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	private static final int GPA = 0;
	static ArrayList<Course> courses = new ArrayList<Course>();
	static ArrayList<Semester> semester = new ArrayList<Semester>();
	static ArrayList<Section> Sections = new ArrayList<Section>();
	static ArrayList<Student> StudentsList= new ArrayList<Student>();
	static ArrayList<Enrollment> Enrollment = new ArrayList<Enrollment>();

	@BeforeClass
	public static void setup() throws Exception {
		Calendar myCalendar = new GregorianCalendar(1997, 2, 14);
		Date DOB = myCalendar.getTime();
		ArrayList<Course> courses = new ArrayList<Course>();
		Course c1 = new Course();
		Course c2 = new Course();
		Course c3 = new Course();
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		ArrayList<Semester> semester = new ArrayList<Semester>();
		Semester s1 = new Semester();
		Semester s2 = new Semester();
		semester.add(s1);
		semester.add(s2);
		ArrayList<Section> Sections = new ArrayList<Section>();
		Section sc1 = new Section();
		Section sc2 = new Section();
		Section sc3 = new Section();
		Section sc4 = new Section();
		Section sc5 = new Section();
		Section sc6 = new Section();
		Sections.add(sc1);
		Sections.add(sc2);
		Sections.add(sc3);
		Sections.add(sc4);
		Sections.add(sc5);
		Sections.add(sc6);		
		ArrayList<Student> StudentsList= new ArrayList<Student>();
		Student student1 = new Student("Jake","JJacob", "JJack", DOB, eMajor.NURSING,"main","631-133-2315","@udel.edu");
		Student student2 = new Student("Jjake","Jaacob", "Jaack", DOB, eMajor.BUSINESS,"main","631-133-2315","@udel.edu");
		Student student3 = new Student("Jaake","Jaccob", "Jacck", DOB, eMajor.CHEM,"main","631-133-2315","@udel.edu");
		Student student4 = new Student("Jakke","Jacoob", "Jackk", DOB, eMajor.COMPSI,"main","631-133-2315","@udel.edu");
		Student student5 = new Student("Jakee","Jacobb", "JJJack", DOB, eMajor.COMPSI,"main","631-133-2315","@udel.edu");
		Student student6 = new Student("JJJake","JJJacob", "Jaaack", DOB, eMajor.PHYSICS,"main","631-133-2315","@udel.edu");
		Student student7 = new Student("Jaaake","Jaaacob", "Jaccck", DOB, eMajor.CHEM,"main","631-133-2315","@udel.edu");
		Student student8 = new Student("Jakkke","Jacccob", "Jackkk", DOB, eMajor.BUSINESS,"main","631-133-2315","@udel.edu");
		Student student9 = new Student("Jakeee","Jacooob", "JJaack", DOB, eMajor.NURSING,"main","631-133-2315","@udel.edu");
		Student student10 = new Student("ake","Jacobbb", "Jacckk", DOB, eMajor.PHYSICS,"main","631-133-2315","@udel.edu");
		StudentsList.add(student1);
		StudentsList.add(student2);
		StudentsList.add(student3);
		StudentsList.add(student4);
		StudentsList.add(student5);
		StudentsList.add(student6);
		StudentsList.add(student7);
		StudentsList.add(student8);
		StudentsList.add(student9);
		StudentsList.add(student10);	
				
	}

	//@Test Failure
	//public void testGpaTotal(){
		//for (int i=0; i < StudentsList.size(); i++ ){
			//double GPA = 0.0;
			//for (int b=i; b < Enrollment.size(); b=b+StudentsList.size()){
				//GPA = GPA + Enrollment.get(b).getGrade();
			//}
		//}
	//}
	public void testMajorChange(){
		Calendar myCalendar = new GregorianCalendar(1997, 2, 14);
		Date DOB = myCalendar.getTime();
		Student student1 = new Student("Jake","JJacob", "JJack", DOB, eMajor.NURSING,"main","631-133-2315","@udel.edu");
		student1.setMajor(eMajor.COMPSI);
		assertEquals(student1.getMajor(), eMajor.COMPSI);
	}
	
}