package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	static ArrayList<Staff> StaffList = new ArrayList<Staff>();

	@BeforeClass
	public static void setup(){
		Calendar myCalendar = new GregorianCalendar(1997, 2, 14);
		Date DOB = myCalendar.getTime();
		Date HireDate = myCalendar.getTime();
		Staff staff1 = new Staff("ann","ryan","smith",DOB,"Main St","631-138-2891","a@udel.edu","12-1", 6,12.00,HireDate,eTitle.MRS);
		Staff staff2 = new Staff("bridget","caroline","treeburough",DOB,"Main St","631-138-2891","b@udel.edu","4-6", 10,90.00,HireDate,eTitle.MRS);
		Staff staff3 = new Staff("doug","sean","dilmann",DOB,"Main St","631-138-2891","d@udel.edu","3-5", 7,7.00,HireDate,eTitle.MR);
		Staff staff4 = new Staff("suzzanne","ryan","smith",DOB,"Main St","631-138-2891","a@udel.edu","12-1", 7,16.00,HireDate,eTitle.MRS);
		Staff staff5 = new Staff("emett","jacob","jackson",DOB,"Main St","631-138-2891","e@udel.edu","2-3", 8,80.00,HireDate,eTitle.MR);
		StaffList.add(staff1);
		StaffList.add(staff2);
		StaffList.add(staff3);
		StaffList.add(staff4);
		StaffList.add(staff5);
	}
	
	@Test 
	public void StaffTestAverage() {
		double totalSal = 0.0;
		for (int i=0; i<StaffList.size();i++){
			totalSal= totalSal+(StaffList.get(i).getSalary()/5);
		}
		assertEquals(41.00,totalSal,0.1);
	}	

}
