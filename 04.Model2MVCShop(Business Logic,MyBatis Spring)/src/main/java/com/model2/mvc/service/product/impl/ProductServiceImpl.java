package com.model2.mvc.service.product.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Product;
import com.model2.mvc.service.product.ProductDao;
import com.model2.mvc.service.product.ProductService;

public class ProductServiceImpl implements ProductService {
	
	///Field
	@Autowired
	@Qualifier("productDaoImpl")
	private ProductDao productDao;
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
		
	///Constructor
	public ProductServiceImpl() {
		System.out.println(this.getClass());
	}

	@Override
	public void findProduct(Product product) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Product getProduct(int prodNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getProductList(Search search) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertProduct(Product product) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateProduct(Product product) throws Exception {
		// TODO Auto-generated method stub

	}

}
