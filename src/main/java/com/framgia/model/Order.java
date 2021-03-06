package com.framgia.model;
// Generated Dec 14, 2018 4:21:20 PM by Hibernate Tools 4.3.5.Final

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Orders generated by hbm2java
 */
public class Order {

	private Integer id;
	private Payment payment;
	private ShippingInfo shippingInfo;
	private User user;
	private Date createDate;
	private float totalBill;
	private Integer status;
	private List<OrderDetail> orderDetails = new ArrayList<>();
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(Integer id, Payment payment, ShippingInfo shippingInfo, User user, Date createDate, float totalBill,
			Integer status, List<OrderDetail> orderDetails) {
		super();
		this.id = id;
		this.payment = payment;
		this.shippingInfo = shippingInfo;
		this.user = user;
		this.createDate = createDate;
		this.totalBill = totalBill;
		this.status = status;
		this.orderDetails = orderDetails;
	}
	public Order(Payment payment, ShippingInfo shippingInfo, User user, Date createDate, float totalBill,
			Integer status, List<OrderDetail> orderDetails) {
		super();
		this.payment = payment;
		this.shippingInfo = shippingInfo;
		this.user = user;
		this.createDate = createDate;
		this.totalBill = totalBill;
		this.status = status;
		this.orderDetails = orderDetails;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public ShippingInfo getShippingInfo() {
		return shippingInfo;
	}
	public void setShippingInfo(ShippingInfo shippingInfo) {
		this.shippingInfo = shippingInfo;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public float getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(float totalBill) {
		this.totalBill = totalBill;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	
}
