package model;

import java.util.ArrayList;
import java.util.UUID;

import model.Order;

public class ManageOrders {

	private Order order = new Order();
	private ArrayList<Order> orders = new ArrayList<Order>();
	private Boolean valid = true;
	
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
	
	public String updateOrder(String orderId, Integer amount){
		orders.forEach(i -> {
			if(orderId.equals(i.getOrderId())){
				order = i;
				order.setAmount(amount);
			}
			else
				order = null;
		});
		return order.getOrderId();
	}
	
	public String markDispatched(String orderId){
		orders.forEach(i -> {
			if(orderId.equals(i.getOrderId()) && valid.equals(true)){
				order = i;
				order.setDispatched(true);
			}
			else
				valid = false;
		});
		if(valid.equals(false)){
			return "400 bad request";
		}
		return "Order Updated";
	}

}
