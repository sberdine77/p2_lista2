package br.ufrpe.p2.questao04.controller;

import java.time.LocalDate;
import java.util.List;

import br.ufrpe.p2.questao04.model.PriceAlert;
import br.ufrpe.p2.questao04.model.Product;
import br.ufrpe.p2.questao04.model.ProductSale;
import br.ufrpe.p2.questao04.model.Store;
import br.ufrpe.p2.questao04.model.User;
import br.ufrpe.p2.questao04.repository.GenericRepository;

public class Controller {
    private GenericRepository users;
    private GenericRepository stores;
    private GenericRepository products;
    private GenericRepository priceAlerts;
    private GenericRepository productSales;

    public boolean addUser(User user) {
        return users.addItem(user);
    }

    public boolean addStore(Store store) {
        return stores.addItem(store);
    }

    public boolean addProduct(Product product) {
        return products.addItem(product);
    }

    public boolean addPriceAlert(PriceAlert priceAlert) {
        return priceAlerts.addItem(priceAlert);
    }

    public boolean addProductSale(ProductSale productSale) {
        return productSales.addItem(productSale);
    }
}
