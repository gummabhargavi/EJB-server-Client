package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class CabSystemBean
 */
@Stateless
@Remote(CabSystemBeanRemote.class)
public class CabSystemBean implements CabSystemBeanRemote {
	
static CabDAO cdao;
	
	static {
		cdao = new CabDAO();
	}

    /**
     * Default constructor. 
     */
    public CabSystemBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<UserDetails> showUserDetailsBean() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return cdao.showUserDetails();
	}

	@Override
	public UserDetails searchUserDetailsBean(int userId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return cdao.searchUserDetails(userId);
	}

	@Override
	public List<DriverDetails> showDriverDetailsBean() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return cdao.showDriverDetails();
	}

	@Override
	public String addBookingBean(Booking booking) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return cdao.addBooking(booking);
	}

	

}
