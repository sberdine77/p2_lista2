package br.ufrpe.p2.questao04.model;

public class PriceAlert implements RepositoryItem {
    private User user;
    private Product product;
    private double price;

    public PriceAlert(User user, Product product, double price) {
        this.user = user;
        this.product = product;
        this.price = price;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
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
