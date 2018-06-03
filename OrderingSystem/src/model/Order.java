package model;

public class Order {

	private Integer amount;
	private String orderId;

	public Order(){
	}

	public Order(String orderId, Integer amount) {
		this.orderId = orderId;
		this.amount = amount;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
