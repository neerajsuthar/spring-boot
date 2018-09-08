package org.nrj.entities;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;

public class Electronics {

	@Id
	private String productId;
	private String productName;
	private String catagory;
	private Double price;
	private Integer quantity;
	private Map<String, Object> specification;
	private List<String> color;
	private String picFile;
	
	public Electronics() {
		// TODO Auto-generated constructor stub
	}
	
	public Electronics(String productId, String productName, String catagory, Double price, Integer quantity,
			Map<String, Object> specification, List<String> color, String picFile) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.catagory = catagory;
		this.price = price;
		this.quantity = quantity;
		this.specification = specification;
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
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
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
	public Map<String, Object> getSpecification() {
		return specification;
	}
	public void setSpecification(Map<String, Object> specification) {
		this.specification = specification;
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
