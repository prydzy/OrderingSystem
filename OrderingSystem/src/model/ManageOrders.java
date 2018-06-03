package model;

import java.util.ArrayList;
import java.util.UUID;

import model.Order;

public class ManageOrders {

	private Order order = new Order();
	private ArrayList<Order> orders = new ArrayList<Order>();

	public String setOrder(Integer amount){
		String orderId = UUID.randomUUID().toString();
		order.setAmount(amount);
		order.setOrderId(orderId);
		orders.add(order);
		return orderId;
	}

	public Order getOrder(String orderId){
		orders.forEach(i -> {
			if(orderId.equals(i.getOrderId())){
				order = i;
			}
			else
				order = null;
		});
		return order;
	}

	public ArrayList<Order> getOrders(){
		return orders;
	}

}
