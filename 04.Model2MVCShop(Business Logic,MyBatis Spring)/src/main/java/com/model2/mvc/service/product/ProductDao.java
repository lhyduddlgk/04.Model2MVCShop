package com.model2.mvc.service.product;

import java.util.List;
import java.util.Map;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Product;

//==> 회원관리에서 CRUD 추상화/캡슐화한 DAO Interface Definition
public interface ProductDao {

	// FIND
	public void findProduct(Product product) throws Exception;

	// SELECT ONE
	public Product getProduct(int prodNo) throws Exception;

	// SELECT LIST
	public List<Product> getProductList(Search search) throws Exception;

	// INSERT
	public void insertProduct(Product product) throws Exception;

	// UPDATE
	public void updateProduct(Product product) throws Exception;

}
