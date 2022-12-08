package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ShowDriverMain {
	
	public static void main(String[] args) throws NamingException, ClassNotFoundException, SQLException {
		   CabSystemBeanRemote service = null;

		    // Context compEnv = (Context) new InitialContext().lookup("java:comp/env");

		    // service = (HelloService)new
		    // InitialContext().lookup("java:comp/env/ejb/HelloService");
		    service = (CabSystemBeanRemote)
		    		new InitialContext().lookup("CabSystemBean/remote");

		    List<DriverDetails> driverList = service.showDriverDetailsBean();
		    for (DriverDetails driverDetails : driverList) {
		    	System.out.println(driverDetails);
				
			}
		    
	}

}
