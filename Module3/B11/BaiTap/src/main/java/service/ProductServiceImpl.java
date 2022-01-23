package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    private static Map<Integer,Product> productMap;
    static {
        productMap= new HashMap<>();
        productMap.put(1,new Product(1,"SonyProI", 100.0,"Sony","japan"));
        productMap.put(2,new Product(2,"Samsung note 10 +", 100.0,"nk","Korea"));
        productMap.put(3,new Product(3,"Bphone", 100.0,"Bkav","VietNam"));
        productMap.put(4,new Product(4,"SamSung zFold ", 100.0,"SamSung","Korea"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(),product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id,product);
    }
}
