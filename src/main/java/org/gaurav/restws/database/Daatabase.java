package org.gaurav.restws.database;

import java.util.Map;

import org.gaurav.restws.vo.CustomerVO;
import org.gaurav.restws.vo.OrderVO;

public class Daatabase {
	private static Map<Long, OrderVO> orders;
	private static Map<String, CustomerVO> customers;

	public static Map<Long, OrderVO> getOrders() {
		return orders;
	}

	public static void setOrders(Map<Long, OrderVO> orders) {
		Daatabase.orders = orders;
	}

	public static Map<String, CustomerVO> getCustomers() {
		return customers;
	}

	public static void setCustomers(Map<String, CustomerVO> customers) {
		Daatabase.customers = customers;
	}
}
