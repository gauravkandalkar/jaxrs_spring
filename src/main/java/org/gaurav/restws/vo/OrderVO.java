package org.gaurav.restws.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OrderVO {

	private long orderID;
	private long orderSquenceNo;
	private long customerID;
	private List<OrderItems> oderItems;

	public OrderVO()
	{
		
	}
	
	public OrderVO(long orderID,long ordersquenceno,long custID)
	{
		this.orderID = orderID;
		this.orderSquenceNo = ordersquenceno;
		this.customerID = custID;
	}
	
	public OrderVO(long orderID, long orderSquenceNo, long customerID, List<OrderItems> oderItems) {
		super();
		this.orderID = orderID;
		this.orderSquenceNo = orderSquenceNo;
		this.customerID = customerID;
		this.oderItems = oderItems;
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

	public long getOrderSquenceNo() {
		return orderSquenceNo;
	}

	public void setOrderSquenceNo(long orderSquenceNo) {
		this.orderSquenceNo = orderSquenceNo;
	}

}
