package com.java.ejb;

import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class DeleteBusMain {
	
	public static void main(String[] args)throws NamingException, ClassNotFoundException, SQLException  {
		String bus_id;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr bus Id");
	    bus_id = sc.next();
	    BusCrudBeanRemote service = null;
		service = (BusCrudBeanRemote) new InitialContext().lookup("BusCrudBean/remote");
		String bus=service.deleteBusBean(bus_id);
		System.out.println("Bus" + bus + "Record Deleted");

	}
	

}
