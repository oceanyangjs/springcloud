package com.ocean.springcloud.service;

import com.ocean.springcloud.client.ProductClientFeign;
import com.ocean.springcloud.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductClientFeign productClientFeign;
    public List<Product> listProducts(){
        return productClientFeign.listProdcuts();
    }
}
