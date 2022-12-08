package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class BusShowMain {
     
	 public static void main(String[] args) throws NamingException, 
	   ClassNotFoundException, SQLException {
		 BusCrudBeanRemote service=null;
		 
			service=(BusCrudBeanRemote) 
					new InitialContext().lookup("BusCrudBean/remote");
			List<Bus> busList=service.showBusBean();
			for (Bus bus : busList) {
				System.out.println(bus);
			}
		}

}
