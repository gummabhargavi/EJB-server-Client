package com.java.ejb;

import java.sql.SQLException;
import java.util.List;


import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class BusCrudBean
 */
@Stateless
@Remote(BusCrudBeanRemote.class)
public class BusCrudBean implements BusCrudBeanRemote {

	
static BusDAO edao;
	
	static {
		edao = new BusDAO();
	}

    /**
     * Default constructor. 
     */
    public BusCrudBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<Bus> showBusBean() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return edao.showBus();
	}

	@Override
	public String addBusBean(Bus bus) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return edao.addBus(bus);
	}

	@Override
	public String updateBusBean(Bus bus) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return edao.updateBus(bus);
	}

	@Override
	public Bus searchBusBean(String bus_id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return edao.searchBus(bus_id);
	}

	@Override
	public String deleteBusBean(String bus_id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return edao.deleteBus(bus_id);
	}

	

	
}
