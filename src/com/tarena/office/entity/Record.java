package com.tarena.office.entity;

import java.sql.Timestamp;

/*
 * Record表的实体类
 */
public class Record { // 对应RECORD表

	private Integer id; // 领取记录ID

	private Integer productid; // 用品 id

	private Double price; // 用品价格 PRICE

	private Integer amount; // 用品数量AMOUNT

	private String name; // 用品名字 NAME
	private String username;// 领用人姓名USERNAME
	private Timestamp time;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	
}
