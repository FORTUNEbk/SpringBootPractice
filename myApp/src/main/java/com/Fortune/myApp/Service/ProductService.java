package com.Fortune.myApp.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Fortune.myApp.Model.Product;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
        new Product(101, "Iphone", 50000),
        new Product(102, "Camon", 20000),
        new Product(103,"Samsum", 30000)
    );
    
    public List<Product> getProduct(){

        return products;
    }
}
