package com.java.ejb;

import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class SearchBusMain {
	public static void main(String[] args) throws NamingException, ClassNotFoundException, SQLException {
		String bus_id;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bus Id  ");
		bus_id = sc.next();
		BusCrudBeanRemote service = null;
		service = (BusCrudBeanRemote) new InitialContext().lookup("BusCrudBean/remote");
		Bus bus = service.searchBusBean(bus_id);
		if (bus != null) {
			System.out.println(bus);
		}

	}
	
}
