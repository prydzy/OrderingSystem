package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import model.ManageOrders;
import model.Order;

public class ManageOrdersTesting {

	protected ManageOrders mOrder = new ManageOrders();
	protected Integer amount = 5;
	protected Integer updatedAmount = 10;
	protected String ref = mOrder.setOrder(amount);

	@Test
	public void setOrderTest() {
		assertTrue(mOrder.setOrder(amount) instanceof String);
	}

	@Test
	public void getOrderTest() {
		assertTrue(mOrder.getOrder(ref) instanceof Order);
		assertEquals(mOrder.getOrder(ref).getAmount(), amount);
		assertTrue(mOrder.getOrder(ref).toString().contains("Order"));
		assertEquals(mOrder.getOrder("test"), null);
	}

	@Test
	public void getOrdersTest(){
		assertTrue(mOrder.getOrders() instanceof ArrayList<?>);
		assertFalse(mOrder.getOrders().isEmpty());
		assertTrue(mOrder.getOrders().contains(mOrder.getOrder(ref)));
	}

	@Test
	public void updateOrderTest(){
		mOrder.updateOrder(ref, updatedAmount);
		assertEquals(mOrder.getOrder(ref).getAmount(), updatedAmount);
		assertTrue(mOrder.updateOrder(ref, updatedAmount) instanceof String);
	}
	
}
