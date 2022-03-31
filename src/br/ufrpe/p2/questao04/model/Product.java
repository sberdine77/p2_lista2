package br.ufrpe.p2.questao04.model;

public class Product implements RepositoryItem {
    private String id;
    private String name;
    private String description;
    private ProductCategory category;


    public Product(String id, String name, String description, ProductCategory category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductCategory getCategory() {
        return this.category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }


    @Override
    public boolean equals(RepositoryItem item) {
        return this.getId() == item.getId();
    }
}
