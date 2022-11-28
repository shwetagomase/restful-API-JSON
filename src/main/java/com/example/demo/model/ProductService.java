package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		
		//creating object of ArrayList
ArrayList<Product> products=new ArrayList<Product>();
		//adding products to the list
		
		products.add(new Product(100,"mobile","skl3333",90000,9));
		products.add(new Product(101,"smarttv","678yyu",34000,7));
		products.add(new Product(102,"machine","bgf67",54000,1));
		products.add(new Product(103,"laptop","smju899",999000,8));
	
		return products;
	}	
}
