package com.java.ejb;

import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class UpdateBusMain {
	
	public static void main(String[] args) throws NamingException, ClassNotFoundException, SQLException {
		Scanner sc  = new Scanner(System.in);
		Bus bus = new Bus();
		System.out.println("Enter busid");
	    bus.setBus_id(sc.next());
		System.out.println("Enter bus_no");
		bus.setBus_no(sc.next());
	    System.out.println("enter type_of_bus");
		bus.setType_of_bus(sc.next());
		System.out.println("Enter type_of_servies");
		bus.setType_of_servies(sc.next());
		System.out.println("Enter no_of_seat");
		bus.setNo_of_seat(sc.nextInt());

		
		BusCrudBeanRemote service = null;
	    service = (BusCrudBeanRemote)
	    		new InitialContext().lookup("BusCrudBean/remote");
	    System.out.println(service.updateBusBean(bus));
	   // System.out.println(service.addBookingBean(book));
		
		
	}


}
