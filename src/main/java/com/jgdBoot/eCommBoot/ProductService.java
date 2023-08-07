package com.jgdBoot.eCommBoot;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//write DB access methods

@Service
public class ProductService {

    //auto-instantiates the class with autoWired
    @Autowired
    private ProductRepository productRepository;
    public List<Product> allProducts(){

        //findAll is method inside MongoRepository class
        return productRepository.findAll();
    }

    public Optional<Product> singleProduct(ObjectId id){
        return productRepository.findById(id);
    }
}
