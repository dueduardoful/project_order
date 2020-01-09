package entities;

import java.util.Date;

import enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	
	//1. Cria��o do Construtor padr�o e o construtor com argumentos.
	public Order() {
	}
	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}
	// 2. Gerar Getters e Setters
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	

}
