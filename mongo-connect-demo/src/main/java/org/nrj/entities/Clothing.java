package org.nrj.entities;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Clothing {

	@Id
	private String productId;
	private String productName;
	private String idealFor;
	private Integer size;
	private Double price;
	private Integer quantity;
	private String material;
	private List<String> color;
	private String picFile;
	
	
	public Clothing() {
		// TODO Auto-generated constructor stub
	}
	
	public Clothing(String productId, String productName, String idealFor, Integer size, Double price, Integer quantity,
			String material, List<String> color, String picFile) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.idealFor = idealFor;
		this.size = size;
		this.price = price;
		this.quantity = quantity;
		this.material = material;
		this.color = color;
		this.picFile=picFile;
	}
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getIdealFor() {
		return idealFor;
	}
	public void setIdealFor(String idealFor) {
		this.idealFor = idealFor;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public List<String> getColor() {
		return color;
	}
	public void setColor(List<String> color) {
		this.color = color;
	}

	public String getPicFile() {
		return picFile;
	}

	public void setPicFile(String picFile) {
		this.picFile = picFile;
	}
	
	
	
}
