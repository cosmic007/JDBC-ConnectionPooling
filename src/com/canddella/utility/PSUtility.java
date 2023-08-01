package com.canddella.utility;

import java.util.Scanner;

import com.canddella.entity.PSMapping;
import com.canddella.entity.Product;
import com.canddella.entity.Service;

public class PSUtility {

	public static void main(String[] args) {
		
		insertIntoPSMapping();
		

	}

	private static void insertIntoPSMapping() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter product code:");
		String productCode=scanner.nextLine();
		System.out.println("Enter service code:");
		String serviceCode=scanner.nextLine();
		
		Product product = new Product();
		product.setProductCode(productCode);
		
		Service service = new Service();
		service.setServiceCode(serviceCode);
		
		PSMapping psMapping = new PSMapping(product,service);
		
	}

}
