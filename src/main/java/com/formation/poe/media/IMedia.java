package com.formation.poe.media;

import java.util.List;

public interface IMedia {
    double getNetPrice();

    int getId();

    void setId(int id);

    String getTitle();

    void setTitle(String title);

    double getPrice();

    void setPrice(double price);

    double getVatRate();

    void setVatRate(double vatRate);

    double getDiscount();

    void setDiscount(double discount);

    List<Author> getAuthorList();

    void setAuthorList(List<Author> authors);

    Publisher getPublisher();

    void setPublisher(Publisher publisher);

    String toString();
}
