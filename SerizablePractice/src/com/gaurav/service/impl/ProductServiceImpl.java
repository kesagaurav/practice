package com.gaurav.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.gaurav.model.product.Product;
import com.gaurav.productException.ProductNotFoundException;
import com.gaurav.service.ProductService;

public class ProductServiceImpl implements ProductService {
	Map<Integer, Double> hm = new HashMap<>();
	Product p = new Product();

	@Override
	public void getProductIdAndPrice(int id) throws ProductNotFoundException {

		hm.put(p.getId(), p.getPrice());
	}

}
