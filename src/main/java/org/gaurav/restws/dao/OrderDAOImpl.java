package org.gaurav.restws.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.gaurav.restws.database.Database;
import org.gaurav.restws.vo.ItemVO;
import org.gaurav.restws.vo.OrderItems;
import org.gaurav.restws.vo.OrderVO;

public class OrderDAOImpl implements IDataDAO<OrderVO> {

	private static Map<Long, OrderVO> orders = Database.getOrders();

	public OrderDAOImpl() {
		if (orders.size() <= 0) {
			OrderItems orderItembuiscuits = new OrderItems(new ItemVO(501l, "Biscuits", 1.2), 2);
			OrderItems orderItemsoap = new OrderItems(new ItemVO(502l, "soap", 2), 4);
			List<OrderItems> orderItems = new ArrayList<>();
			orderItems.add(orderItembuiscuits);
			orderItems.add(orderItemsoap);
			orders.put(1l, new OrderVO(1l, 1l, 1l, orderItems));
			

			OrderItems orderItemOil = new OrderItems(new ItemVO(506l, "Oil", 5.49), 1);
			orderItems.add(orderItemOil);
			orders.put(202l, new OrderVO(202l, 2l, 1l, orderItems));

			orders.put(101l, new OrderVO(101l, 1l, 2l, orderItems));
			orders.put(203l, new OrderVO(203l, 2l, 2l));
		}
	}

	@Override
	public OrderVO readByID(long id) {
		return orders.get(id);
	}

	@Override
	public List<OrderVO> readAll() {
		return new ArrayList<OrderVO>(orders.values());
	}

	@Override
	public long insert(OrderVO t) {
		t.setOrderID(t.getOrderID()+1);
		orders.put(t.getOrderID(), t);
		return 1;
	}

	@Override
	public int delete(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(OrderVO t) {
		// TODO Auto-generated method stub
		return 0;
	}

}
