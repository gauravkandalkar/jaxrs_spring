package org.gaurav.restws.service;

import java.util.List;

import org.gaurav.restws.dao.IDataDAO;
import org.gaurav.restws.vo.OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	IDataDAO<OrderVO> orderDAO;
	
	@Override
	public OrderVO getOrder(long id) {
		return null;
	}

	@Override
	public List<OrderVO> getAllOrdersForCustomer(long custID) {
		return null;
	}

	@Override
	public OrderVO createNewOrder(OrderVO cust) {
		return null;
	}

	@Override
	public int removeOrder(long id) {
		return 0;
	}

	@Override
	public OrderVO updateOrder(OrderVO cust) {
		return null;
	}


}
