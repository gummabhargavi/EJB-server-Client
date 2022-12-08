package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;

@Remote
public interface BusCrudBeanRemote {
	
	List<Bus> showBusBean() throws ClassNotFoundException, SQLException;
	Bus searchBusBean(String bus_id) throws ClassNotFoundException, SQLException;
	String addBusBean(Bus bus) throws ClassNotFoundException, SQLException;;
	String deleteBusBean(String bus_id) throws ClassNotFoundException, SQLException;;
	String updateBusBean(Bus bus) throws ClassNotFoundException, SQLException;;


}
