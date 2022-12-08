package com.java.ejb;

import java.io.Serializable;

public class Bus implements Serializable{
	
	
	private String bus_id;
	private String bus_no;
	private String type_of_bus;
	private String type_of_servies;
	private int no_of_seat;
	
	public String getBus_id() {
		return bus_id;
	}
	public void setBus_id(String bus_id) {
		this.bus_id = bus_id;
	}
	public String getBus_no() {
		return bus_no;
	}
	public void setBus_no(String bus_no) {
		this.bus_no = bus_no;
	}
		public String getType_of_bus() {
		return type_of_bus;
	}
	public void setType_of_bus(String type_of_bus) {
		this.type_of_bus = type_of_bus;
	}
	public String getType_of_servies() {
		return type_of_servies;
	}
	public void setType_of_servies(String type_of_servies) {
		this.type_of_servies = type_of_servies;
	}
	public int getNo_of_seat() {
		return no_of_seat;
	}
	public void setNo_of_seat(int no_of_seat) {
		this.no_of_seat = no_of_seat;
	}
	
	
	
	
	public Bus(String bus_id, String bus_no, String type_of_bus, String type_of_servies, int no_of_seat) {
		
		this.bus_id = bus_id;
		this.bus_no = bus_no;
		this.type_of_bus = type_of_bus;
		this.type_of_servies = type_of_servies;
		this.no_of_seat = no_of_seat;
	}
	
	@Override
	public String toString() {
		return "Bus [bus_id=" + bus_id + ", bus_no=" + bus_no + ", type_of_bus=" + type_of_bus + ", type_of_servies="
				+ type_of_servies + ", no_of_seat=" + no_of_seat + "]";
	}
	
	public Bus() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
		
}
