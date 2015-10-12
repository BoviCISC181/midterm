package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@Test
	public void avgSalTest() {
		ArrayList<Staff> staff = new ArrayList<Staff>();
		staff.add(new Staff(eTitle.MANAGER));
		staff.add(new Staff(eTitle.JANITOR));
		staff.add(new Staff(eTitle.SECRETARY));
		staff.add(new Staff(eTitle.SECRETARY));
		staff.add(new Staff(eTitle.JANITOR));
		staff.get(0).setSalary(5000);
		staff.get(1).setSalary(2500);
		staff.get(2).setSalary(3750);
		staff.get(3).setSalary(6000);
		staff.get(4).setSalary(1500);
		
		double averageSal = 0.0;
		for (Staff s : staff){
			averageSal+=s.getSalary();
		}
		averageSal/=5;
		assertEquals(true,3750==averageSal);
	}
	
	@Test(expected=PersonException.class)
	public void DOBExcTest() throws PersonException{
		try{
			Staff staff0 = new Staff(eTitle.MANAGER);
			staff0.setDOB(new Date(1856,2,4));
		}
		catch(PersonException e){
			throw e;
		}
	}
	
	@Test(expected=PersonException.class)
	public void phoneNumExcTest() throws PersonException{
		try{
			Staff staff1 = new Staff(eTitle.JANITOR);
			staff1.setPhone("5-5-5-5-55555555");
		}
		catch(PersonException e){
			throw e;
		}
	}

}
