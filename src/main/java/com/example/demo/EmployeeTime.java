package com.example.demo;

import java.util.Date;

import javax.persistence.Id;

public class EmployeeTime {
	
	@Id
	private int id;
	private Date Swipein;
    private Date Swipeout;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getSwipein() {
		return Swipein;
	}
	public void setSwipein(Date swipein) {
		Swipein = swipein;
	}
	public Date getSwipeout() {
		return Swipeout;
	}
	public void setSwipeout(Date swipeout) {
		Swipeout = swipeout;
	}
	@Override
	public String toString() {
		return "EmployeeTime [id=" + id + ", Swipein=" + Swipein + ", Swipeout=" + Swipeout + "]";
	}
	
    
    
    
	

}
