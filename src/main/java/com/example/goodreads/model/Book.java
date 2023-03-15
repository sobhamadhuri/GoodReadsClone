//It defines the entity class in JPA that represents a database table

package com.example.goodreads.model;

import javax.persistence.*;

@Entity //It indicates class is an entity and is mapped to database table
@Table(name="book") //Database table name mapped with Book class
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id") //Mapping database column to attribute
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "imageurl")
    private String imageUrl;

    public Book(int id, String name, String imageUrl) { //Constructor for initializing the attributes
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public Book(){}

    public int getId() {//getters
        return id;
    }

    public void setId(int id) {//setters
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
