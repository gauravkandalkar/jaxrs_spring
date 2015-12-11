package org.gaurav.restws.dao;

import java.util.Map;

import org.gaurav.restws.database.Database;
import org.gaurav.restws.vo.CustomerVO;

public class CustomerDAO implements IDataDAO<CustomerVO>{

	private Map<Long, CustomerVO> custtbl = Database.getCustomers();
	
	public CustomerDAO() {
		custtbl.put(1l, new CustomerVO(1l,"Gaurav","Kandalkar"));
		custtbl.put(2l, new CustomerVO(2l,"Anushree","Pawar"));
		custtbl.put(3l, new CustomerVO(3l,"Arun","Kandalkar"));
	}

	@Override
	public CustomerVO read(long id) {
		// TODO Auto-generated method stub
		System.out.println("in cust dao");
		return custtbl.get(id);
	}

	@Override
	public int insert(CustomerVO t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(CustomerVO t) {
		// TODO Auto-generated method stub
		return 0;
	}

}
