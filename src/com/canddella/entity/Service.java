package com.canddella.entity;

public class Service {
	
	private String serviceCode;
	private String serviceName;
	
	
	
	
	public Service(String serviceCode, String serviceName) {
		super();
		this.serviceCode = serviceCode;
		this.serviceName = serviceName;
	}
	public Service() {
		// TODO Auto-generated constructor stub
	}
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	

}
