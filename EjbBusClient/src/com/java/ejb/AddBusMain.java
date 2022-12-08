package com.java.ejb;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class AddBusMain {
	
	public static void main(String[] args) throws NamingException, ClassNotFoundException, SQLException {
		Scanner sc  = new Scanner(System.in);
		Bus bus = new Bus();
		
//		 System.out.println("Enter Booking Date(yyyy-MM-dd)");
//		  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//			
//				Date bookDate;
//				try {
//					bookDate = sdf.parse(sc.next());
//					java.sql.Date date = new java.sql.Date(bookDate.getTime());
//					book.setBookingDate(date);
//				} catch (ParseException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//		System.out.println("Enter Bus Id");
//		bus.setBus_id(sc.next());
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
	    System.out.println(service.addBusBean(bus));
	   // System.out.println(service.addBookingBean(book));
		
		
	}

}
