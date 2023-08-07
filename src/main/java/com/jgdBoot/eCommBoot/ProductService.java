package com.jgdBoot.eCommBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//write DB access methods

@Service
public class ProductService {

    //auto-instantiates the class with autoWired
    @Autowired
    private ProductRepository productRepository;
    public List<Product> allProducts(){

        List<Product> resList = productRepository.findAll();


        //findAll is method inside MongoRepository class
        return productRepository.findAll();
    }
}
