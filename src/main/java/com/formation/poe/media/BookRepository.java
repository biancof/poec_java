//package com.formation.poe.media;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Set;
//import java.util.StringTokenizer;
//
//public class BookRepository implements IBookRepository {
//
//    private String uri = "";
//    private List<Book> bookList = new ArrayList<>();
//
//    public BookRepository() {
//    }
//
//    public void setUri(String uri){
//        this.uri = uri;
//    }
//
//    @Override
//    public void load(String uri) throws IOException {
//        setUri(uri);
//        BufferedReader reader = new BufferedReader(new FileReader(uri));
//        reader.readLine();
//        String line = reader.readLine();
//        while(line != null){
//            StringTokenizer st = new StringTokenizer(line, ";");
//            Integer id = Integer.parseInt(st.nextToken());
//            String title = st.nextToken();
//            double price = Double.parseDouble(st.nextToken());
//            Publisher publisher = new Publisher(st.nextToken());
//            int nPages = Integer.parseInt(st.nextToken());
//            ArrayList<Author> authorList = new ArrayList<Author>();
//            authorList.add(new Author("Name", "Surname"));
//            Book b = new Book(authorList, title, price);   // Authors have default value
//            b.setPublisher(publisher);
//            b.setNPages(nPages);
//            addToBookList(b);
//            line = reader.readLine();
//        }
//        reader.close();
//    }
//
//    private void addToBookList(Book b){
//        bookList.add(b);
//    }
//
//    // method which should create a list of authors from a string. Doesn't work yet
//
////  private ArrayList<Author> tokenizeAuthorList(String authorList){
////        ArrayList<Author> tokenizeAuthorList = new ArrayList<>();
////        List<String> authorStringList = new ArrayList<>();
////        StringTokenizer st1 = new StringTokenizer(authorList, ",");
////        String token = st1.nextToken();
////        while (token != null) {
////            authorStringList.add(token);
////        }
////        String name = "";
////        String surname = "";
////        for (String author : authorStringList){
////            StringTokenizer st2 = new StringTokenizer(author, " ");
////            name = st2.nextToken();
////            surname = st2.nextToken();
////            tokenizeAuthorList.add(new Author(name, surname));
////        }
////        return tokenizeAuthorList;
////    }
//
//    @Override
//    public List<Book> getAll() {
//        return this.bookList;
//    }
//
//    // doesn't work,
//    @Override
//    public Book getById(int id) {
//        for (Book b : this.bookList){
//            if (b.getId() == id){
//                return b;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public List<Book> getByTitle(String key) {
//        List<Book> bookByTitleList = new ArrayList<>();
//        key = key.toUpperCase();
//        for (Book b : this.bookList){
//            String title = b.getTitle().toUpperCase();
//            if (title.indexOf(key) != -1){
//                bookByTitleList.add(b);
//            }
//        }
//        return bookByTitleList;
//    }
//
//    @Override
//    public List<Book> getByPrice(double price) {
//        List<Book> bookByPriceList = new ArrayList<>();
//        for (Book b : this.bookList){
//            if (b.getNetPrice() <= price){
//                bookByPriceList.add(b);
//            }
//        }
//        return bookByPriceList;
//    }
//
//    @Override
//    public List<Book> getByPublisher(String key) {
//        List<Book> bookByPublisherList = new ArrayList<>();
//        key = key.toUpperCase();
//        for (Book b : this.bookList){
//            String publisher = b.getPublisher().getName().toUpperCase();
//            if (publisher.indexOf(key) != -1){
//                bookByPublisherList.add(b);
//            }
//        }
//        return bookByPublisherList;
//    }
//
//    @Override
//    public void add(Book b) throws IOException {
//        this.getAll();
//        addToBookList(b);
//        BufferedWriter writer = new BufferedWriter(new FileWriter(this.uri));
//        writer.write("Id;Title;Price;Publisher;Pages");
//        for (Book elem : this.bookList){
//            writer.newLine();
//            writer.write(elem.getId() + ";" + elem.getTitle()
//                    + ";" + elem.getPrice() + ";" + elem.getPublisher().getName() + ";" + elem.getNPages());
//        }
//
//        writer.close();
//    }
//
//    @Override
//    public void remove(Book b) {
//
//    }
//
//    @Override
//    public void update(Book b) {
//
//    }
//
//    // toString()
//
//    @Override
//    public String toString() {
//        return "Book repository: " + bookList.size() + " books.";
//    }
//}
