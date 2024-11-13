package com.Fortune.myApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Fortune.myApp.Model.Product;
import com.Fortune.myApp.Service.ProductService;

@RestController
public class ProductController {

    @Autowired
    ProductService service;
    
    @GetMapping("/products")
    public List<Product> getProduct(){
        return service.getProduct();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProducts(@RequestBody Product prod){
        service.addProduct(prod);
    }


    @PutMapping("/products")
    public void updateProducts(@RequestBody Product prod){
        service.updateProducts(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProducts(@PathVariable int prodId){
        service.deleteProducts(prodId);
    }
}
