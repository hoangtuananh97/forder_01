package com.framgia.bean;

import java.util.Date;
import java.util.List;

import com.framgia.model.CartDetail;
import com.framgia.model.Category;
import com.framgia.model.OrderDetail;
import com.framgia.model.Review;

public class ProductInfo {
	private Integer id;
	private Category category;
	private String name;
	private float price;
	private String code;
	private String image;
	private String desciption;
	private Date expiryDate;
	private List<Review> reviews;
	private List<OrderDetail> orderDetails;
	private List<CartDetail> cartDetails;

	public ProductInfo() {
	}

	public ProductInfo(Integer id, Category category, String name, float price, String code, String image,
			String desciption, Date expiryDate, List<Review> reviews, List<OrderDetail> orderDetails,
			List<CartDetail> cartDetails) {
		this.id = id;
		this.category = category;
		this.name = name;
		this.price = price;
		this.code = code;
		this.image = image;
		this.desciption = desciption;
		this.expiryDate = expiryDate;
		this.reviews = reviews;
		this.orderDetails = orderDetails;
		this.cartDetails = cartDetails;
	}

	public ProductInfo(Category category, String name, float price, String code, String image, String desciption,
			Date expiryDate, List<Review> reviews, List<OrderDetail> orderDetails, List<CartDetail> cartDetails) {
		super();
		this.category = category;
		this.name = name;
		this.price = price;
		this.code = code;
		this.image = image;
		this.desciption = desciption;
		this.expiryDate = expiryDate;
		this.reviews = reviews;
		this.orderDetails = orderDetails;
		this.cartDetails = cartDetails;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public List<CartDetail> getCartDetails() {
		return cartDetails;
	}

	public void setCartDetails(List<CartDetail> cartDetails) {
		this.cartDetails = cartDetails;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}