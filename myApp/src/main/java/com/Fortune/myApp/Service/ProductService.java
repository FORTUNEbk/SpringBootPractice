package com.Fortune.myApp.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Fortune.myApp.Model.Product;

@Service
public class ProductService {

    List<Product> products = new ArrayList<> (Arrays.asList(
        new Product(101, "Iphone", 50000),
        new Product(102, "Camon", 20000),
        new Product(103,"Samsum", 30000)
    ));
    
    public List<Product> getProduct(){

        return products;
    }

    public Product getProductById(int prodId){
        return products.stream()
        .filter(p -> p.getProdId() == prodId)
        .findFirst().get();
    }

    public void addProduct(Product prod){
        products.add(prod);

    }
}
