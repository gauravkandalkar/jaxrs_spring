package org.gaurav.restws.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.gaurav.restws.dao.CustomerDAO;
import org.gaurav.restws.service.CustomerService;
import org.gaurav.restws.vo.CustomerVO;


@Path("/customer")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResourse {

  CustomerService custserv = new CustomerService();
	//CustomerDAO custdao = new CustomerDAO();
	@GET
	public CustomerVO getCustomer(@QueryParam(value = "custid") long custID)
	{
		System.out.println("me in cust resourse");
		return custserv.getCustomer(custID);
		//return custdao.read(custID);
	}
}
