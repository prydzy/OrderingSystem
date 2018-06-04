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

	@Test
	public void dispatchedTrueTest(){
		order.setDispatched(true);
		assertTrue(order.getDispatched() instanceof Boolean);
		assertEquals(order.getDispatched(), true);
	}

	@Test
	public void dispatchedFalseTest(){
		order.setDispatched(false);
		assertEquals(order.getDispatched(), false);
	}

}
