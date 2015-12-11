package org.gaurav.restws.service;

import org.gaurav.restws.dao.CustomerDAO;
import org.gaurav.restws.vo.CustomerVO;

public class CustomerService {

	CustomerDAO custDAO = new CustomerDAO();

	public CustomerVO getCustomer(long id) {
		System.out.println("me in cust service");
		return custDAO.read(id);
	}

}
