package org.gaurav.restws.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Repository;

@XmlRootElement
@Repository
public class OrderVO {
	private long orderID;
	private long customerID;
	private List<OrderItems> oderItems;

	public OrderVO()
	{
		
	}
	
	public OrderVO(long orderID,long custID)
	{
		this.orderID = orderID;
		this.customerID = custID;
	}
	
	public long getOrderID() {
		return orderID;
	}

	public void setOrderID(long orderID) {
		this.orderID = orderID;
	}

	public long getCustomerID() {
		return customerID;
	}

	public void setCustomerID(long customerID) {
		this.customerID = customerID;
	}

	public List<OrderItems> getOderItems() {
		return oderItems;
	}

	public void setOderItems(List<OrderItems> oderItems) {
		this.oderItems = oderItems;
	}

}
