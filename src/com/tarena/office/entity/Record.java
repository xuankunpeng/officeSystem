package com.tarena.office.entity;

import java.sql.Timestamp;

/*
 * Record���ʵ����
 */
public class Record { // ��ӦRECORD��

	private Integer id; // ��ȡ��¼ID

	private Integer productid; // ��Ʒ id

	private Double price; // ��Ʒ�۸� PRICE

	private Integer amount; // ��Ʒ����AMOUNT

	private String name; // ��Ʒ���� NAME
	private String username;// ����������USERNAME
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
