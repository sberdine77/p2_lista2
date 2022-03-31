package br.ufrpe.p2.questao04.repository;

import java.util.ArrayList;

import br.ufrpe.p2.questao04.model.RepositoryItem;

public class GenericRepository {
    private ArrayList<RepositoryItem> items;

    public GenericRepository(ArrayList<RepositoryItem> items) {
        this.items = items;
    }

    public ArrayList<RepositoryItem> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<RepositoryItem> items) {
        this.items = items;
    }

    public boolean addItem(RepositoryItem item) {
        if(!this.items.contains(item)) {
            this.items.add(item);
            return true;
        }
        return false;
    }

    public void removeItem(RepositoryItem item) {
        this.items.remove(item);
    }

}
