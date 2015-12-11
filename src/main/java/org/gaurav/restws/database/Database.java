package org.gaurav.restws.database;

import java.util.HashMap;
import java.util.Map;

import org.gaurav.restws.vo.CustomerVO;
import org.gaurav.restws.vo.OrderVO;

public class Database {
		private static Map<Long, OrderVO> orders = new HashMap<>();
		private static Map<Long, CustomerVO> customers = new HashMap<>();

		public static Map<Long, OrderVO> getOrders() {
			return orders;
		}

		
		public static Map<Long, CustomerVO> getCustomers() {
			return customers;
		}

		
	}
		
