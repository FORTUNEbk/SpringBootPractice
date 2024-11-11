package com.Fortune.myApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Fortune.myApp.Model.Product;
import com.Fortune.myApp.Service.ProductService;

@RestController
public class ProductController {

    @Autowired
    ProductService service;
    
    @RequestMapping("/products")
    public List<Product> getProduct(){
        return service.getProduct();
    }
    
}
