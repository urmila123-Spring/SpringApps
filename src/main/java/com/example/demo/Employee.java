package com.example.demo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Employee {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	private String name;
	private Date Swipein;
    private Date Swipeout;
	private Date date;
	private String LocationName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getLocationName() {
		return LocationName;
	}
	public void setLocationName(String locationName) {
		LocationName = locationName;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Swipein=" + Swipein + ", Swipeout=" + Swipeout + ", date="
				+ date + ", LocationName=" + LocationName + "]";
	}
	
	

}
