package com.formation.poe.media;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SqlBookRepository implements IBookRepository {

    private Connection connection;

    public SqlBookRepository() {
    }

    @Override
    public void load(String uri) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        this.connection = DriverManager.getConnection(uri, "postgres", "admin");
    }

    private List<Book> getBySql(String sql) throws SQLException, NullPointerException {
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(sql);
        List<Book> res = new ArrayList<>();
        while(rs.next()) {
            int id = rs.getInt("id");
            String title = rs.getString("title");
            double price = rs.getDouble("price");
            Book b = new Book(id,title,price);
            res.add(b);
        }
        return res;
    }

    @Override
    public List<Book> getAll() throws SQLException {
        return getBySql("select * from book");
    }

    @Override
    public Book getById(int id) throws SQLException {
        return getBySql("select * from book where book.id = " + id).get(0);
    }

    @Override
    public List<Book> getByTitle(String title) throws SQLException {
        return getBySql("select * from book where book.title ilike '%" + title + "%'");
    }

    @Override
    public List<Book> getByPrice(double price) throws SQLException {
        return getBySql("select * from book where book.price <= " + price);
    }

    @Override
    public List<Book> getByPublisher(String publisherName) throws SQLException {
        return null;
    }

    @Override
    public void add(Book b) throws SQLException {

    }

    @Override
    public void remove(Book b) throws SQLException {

    }

    @Override
    public void update(Book b) throws SQLException {

    }
}
