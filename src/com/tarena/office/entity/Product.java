package com.tarena.office.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

/*
 * product���ʵ����
 */
public class Product { // ��ӦPRODUCT��

	private Integer id; // ��Ʒ ID

	private String name; // ��Ʒ NAME

	private Double price; // ��Ʒ�۸� PRICE
	
	private Integer amount; //��Ʒ����AMOUNT

	private String description; // ��Ʒ˵�� DESCRIPTION

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	
}
