package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService{
    static Map<Integer,Product> map=new HashMap<>();
    static {
        map.put(1,new Product(1,"a",1.0,"a","a"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(map.values());
    }

    @Override
    public Product findById(int id) {
        return map.get(id);
    }

    @Override
    public void save(Product product) {
        map.put(product.getId(), product);
    }

    @Override
    public void remove(int id) {
        map.remove(id);
    }
}
