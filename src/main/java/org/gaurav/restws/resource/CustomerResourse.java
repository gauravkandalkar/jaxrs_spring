package org.gaurav.restws.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.gaurav.restws.service.CustomerService;
import org.gaurav.restws.service.CustomerServiceImpl;
import org.gaurav.restws.vo.CustomerVO;

@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResourse {

	CustomerService custserv = new CustomerServiceImpl();

	@GET
	public List<CustomerVO> getCustomers() {
		return custserv.getAllCustomer();
	}

	@GET
	@Path("/{custID}")
	public CustomerVO getCustomer(@PathParam("custID") long custID) {
		return custserv.getCustomer(custID);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public CustomerVO insertNewCustomer(CustomerVO cust) {
		return custserv.insertNewCustomer(cust);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public CustomerVO updateCustomer(CustomerVO cust) {
		return custserv.updateCustomer(cust);
	}

	@DELETE
	@Path("/{custID}")
	@Produces(MediaType.TEXT_PLAIN)
	public String removeCustomer(@PathParam("custID") long custID) {
		int result = custserv.removeCustomer(custID);
		if (result == 0) {
			return "Failed";
		}
		return "Success";
	}
}
