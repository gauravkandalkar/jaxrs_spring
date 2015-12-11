package org.gaurav.restws.database;

import java.util.HashMap;
import java.util.Map;

import org.gaurav.restws.vo.CustomerVO;
import org.gaurav.restws.vo.OrderVO;

public class Database {
		private static Map<Long, OrderVO> orders = new HashMap<>();
		private static Map<String, CustomerVO> customers = new HashMap<>();
public Database()
{
	OrderVO cust1 = new OrderVO(001l,1l); 
	orders.put(cust1.getOrderID(), cust1 );
	OrderVO cust2 = new OrderVO(002l,1l); 
	orders.put(cust2.getOrderID(), cust2 );
	OrderVO cust3 = new OrderVO(101l,2l); 
	orders.put(cust3.getOrderID(), cust3 );
}
		public static Map<Long, OrderVO> getOrders() {
			return orders;
		}

		public static void setOrders(Map<Long, OrderVO> orders) {
			Database.orders = orders;
		}

		public static Map<String, CustomerVO> getCustomers() {
			return customers;
		}

		public static void setCustomers(Map<String, CustomerVO> customers) {
			Database.customers = customers;
		}
	}
		
