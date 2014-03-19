package com.tarena.office.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

/*
 * product表的实体类
 */
public class Product { // 对应PRODUCT表

	private Integer id; // 用品 ID

	private String name; // 用品 NAME

	private Double price; // 用品价格 PRICE
	
	private Integer amount; //用品数量AMOUNT

	private String description; // 用品说明 DESCRIPTION

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
