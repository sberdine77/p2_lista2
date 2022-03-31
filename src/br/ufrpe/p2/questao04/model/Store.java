package br.ufrpe.p2.questao04.model;

public class Store implements RepositoryItem {
    private String id;
    private String name;
    private String description;

    public Store(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    @Override
    public boolean equals(RepositoryItem item) {
        return this.getId() == item.getId();
    }

}
