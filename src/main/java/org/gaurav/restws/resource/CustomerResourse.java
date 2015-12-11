package org.gaurav.restws.resource;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.gaurav.restws.service.CustomerService;
import org.gaurav.restws.service.IDataService;
import org.gaurav.restws.vo.CustomerVO;


@Path("/customer")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResourse {

	//to be done later once understand dependency injection well
	@SuppressWarnings("rawtypes")
	@Resource
	IDataService service;
	
	@GET
	public CustomerVO getCustomer(@QueryParam(value = "custid") long custID)
	{
		service = new CustomerService();
		return (CustomerVO) service.read(custID);
	}
}
