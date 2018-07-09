package com.formation.poe.media;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class SqlBookRepository implements IBookRepository {

    private Connection connection;

    public SqlBookRepository() {
    }

    @Override
    public void load(String uri) throws IOException, ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        this.connection = DriverManager.getConnection(uri, "postgres", "admin");
    }

    @Override
    public ArrayList<Book> getAll() throws IOException, ClassNotFoundException, SQLException {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select book.id, " +
                "author.name, author.surname, book.title, book.price, " +
                "publisher.name \n" +
                "from author, book, book_author, publisher \n" +
                "where author.id = book_author.author_id\n" +
                "and book.id = book_author.book_id\n" +
                "and book.publisher_id = publisher.id\n" +
                "order by title");
        ArrayList<Book> bookList = new ArrayList<>();
        while(rs.next()){
            int id = rs.getInt("id");
            List<Author> authorList = new ArrayList<>();
            String authorName = rs.getString("name");
            String authorSurname = rs.getString("surname");
            authorList.add(new Author(authorName, authorSurname));
            String title = rs.getString("title");
            double price = rs.getDouble("price");
            String publisherName = rs.getString("name");
            Publisher p = new Publisher(publisherName);
            Book b = new Book();
            bookList.add(b);
        }
        return bookList;
    }

    @Override
    public Book getById(int id) {
        return null;
    }

    @Override
    public List<Book> getByTitle(String title) {
        return null;
    }

    @Override
    public List<Book> getByPrice(double price) {
        return null;
    }

    @Override
    public List<Book> getByPublisher(String publisherName) {
        return null;
    }

    @Override
    public void add(Book b) throws IOException {

    }

    @Override
    public void remove(Book b) throws IOException {

    }

    @Override
    public void update(Book b) throws IOException {

    }
}
