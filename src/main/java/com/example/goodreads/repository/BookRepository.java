package com.example.goodreads.repository;

import java.util.ArrayList;

import com.example.goodreads.model.Book;

public interface BookRepository {
    ArrayList<Book> getBooks();//Declaring abstract methods

    Book getBookById(int bookId);
    
    Book addBook(Book book);

    String addBulkOfBooks(ArrayList<Book> books);
    
    Book updateBook(int bookId, Book book);
    
    void deleteBook(int bookId);

}
