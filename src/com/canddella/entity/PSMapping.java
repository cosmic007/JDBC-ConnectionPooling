package com.canddella.entity;

public class PSMapping {
	private Product product;
	private Service service;
	public PSMapping(Product product, Service service) {
		super();
		this.product = product;
		this.service = service;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	
	
	

}
