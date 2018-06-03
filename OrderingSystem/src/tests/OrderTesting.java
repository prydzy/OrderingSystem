package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import model.Order;


public class OrderTesting {

	protected Order order = new Order();
	protected Integer amount = 5;
	protected String id = "test";

	@Test
	public void amountTest() {
		order.setAmount(amount);
		assertTrue(order.getAmount() instanceof Integer);
		assertEquals(order.getAmount(), amount);
	}

	@Test
	public void orderIdTest(){
		order.setOrderId(id);
		assertTrue(order.getOrderId() instanceof String);
		assertEquals(order.getOrderId(), id);
	}
}
