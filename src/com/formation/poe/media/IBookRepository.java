package com.formation.poe.media;

import java.io.IOException;
import java.util.List;

public interface IBookRepository {

    void load(String uri) throws IOException;

    List<Book> getAll();
    Book getById(int id);
    List<Book> getByTitle(String title);
    List<Book> getByPrice(double price);
    List<Book> getByPublisher(String publisherName); // Bonus
    // Bonus
    void add(Book b) throws IOException ;
    void remove(Book b) throws IOException ;
    void update(Book b) throws IOException ;

}