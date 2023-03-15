//This interface performs CRUD operations

package com.example.goodreads.repository;

import com.example.goodreads.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository //It indicates, interface is a Spring Data Repository
public interface BookJpaRepository extends JpaRepository<Book, Integer>{

}