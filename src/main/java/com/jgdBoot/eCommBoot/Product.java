package com.jgdBoot.eCommBoot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

//this class represents each document in the products collection
@Document(collection = "products")
//takes care of getters/setters via lombok
@Data
//annotation for creating a constructor that takes all below private fields as an argument
@AllArgsConstructor
//another constructor that takes no params
@NoArgsConstructor
public class Product {

    @Id
    private ObjectId id;
    private String title;
    private String description;
    private Integer price;
    private Integer discountPercentage;
    private Integer rating;
    private Integer stock;
    private String brand;
    private String category;
    private String thumbnail;
    private List<String> images;
    @DocumentReference
    private List<Review> reviewIds;

}
