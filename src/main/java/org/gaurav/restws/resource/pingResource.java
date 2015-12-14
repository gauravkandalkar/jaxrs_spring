package org.gaurav.restws.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Path("/ping")
public class pingResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String ping()
	{
		return "This is test for restfull WS"; 
	}
}
