package com.gaurav.service;

import com.gaurav.productException.ProductNotFoundException;

public interface ProductService {

	public void getProductIdAndPrice(int id) throws ProductNotFoundException;

}
