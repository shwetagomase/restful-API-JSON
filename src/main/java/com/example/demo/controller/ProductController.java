package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.IProductService;
import com.example.demo.model.Product;
import com.example.demo.model.ProductService;

@RestController
public class ProductController {

	@Autowired
	private IProductService productService;
	
	//mapping the getproduct() method to /product
	@GetMapping(value="/product")
	public List<Product> getProduct()
	{
		//find all the products
		
		List<Product> products= productService.findAll();
				//ProductService.findAll();
		return products;
	}
}
