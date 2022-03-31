package br.ufrpe.p2.questao04.model;

import java.time.LocalDate;

public class ProductSale implements RepositoryItem {
    private Product product;
    private Store store;
    private LocalDate date;
    private double price;

    public ProductSale(Product product, Store store, LocalDate date, double price) {
        this.product = product;
        this.store = store;
        this.date = date;
        this.price = price;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Store getStore() {
        return this.store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean equals(RepositoryItem item) {
        return this.getId() == item.getId();
    }

}
