package com.framgia.model;
// Generated Dec 14, 2018 4:21:20 PM by Hibernate Tools 4.3.5.Final

/**
 * Addresses generated by hbm2java
 */
public class Address implements java.io.Serializable {

	private Integer id;
	private User user;
	private String firstName;
	private String lastName;
	private String city;
	private String district;
	private String address;
	private String phone;
	private Boolean isDefault;

	public Address() {
	}

	public Address(User user, String firstName, String lastName, String city, String district, String address,
			String phone, Boolean isDefault) {
		super();
		this.user = user;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.district = district;
		this.address = address;
		this.phone = phone;
		this.isDefault = isDefault;
	}

	public Address(Integer id, User user, String firstName, String lastName, String city, String district,
			String address, String phone, Boolean isDefault) {
		super();
		this.id = id;
		this.user = user;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.district = district;
		this.address = address;
		this.phone = phone;
		this.isDefault = isDefault;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	

}
