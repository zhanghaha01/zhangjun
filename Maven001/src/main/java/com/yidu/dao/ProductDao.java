package com.yidu.dao;

import java.util.List;

import com.yidu.bean.Product;

public interface ProductDao {
	public List<Product> select(Product p);
}
