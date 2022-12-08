package com.java.ejb;

import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class SearchUserMain {
	
public static void main(String[] args) throws NamingException, ClassNotFoundException, SQLException {
		
		int userId;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter userId ");
		userId = sc.nextInt();
		 CabSystemBeanRemote service = null;
		    service = (CabSystemBeanRemote)
		    		new InitialContext().lookup("CabSystemBean/remote");
		UserDetails user = service.searchUserDetailsBean(userId);
		if(user!=null){
			System.out.println(user);
		}
		
		
	}


}
