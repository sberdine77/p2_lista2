package br.ufrpe.p2.questao04.model;

public class User implements RepositoryItem {
    private String id;
    private String name;
    private String email;

    public User(String name, String email, String id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(RepositoryItem item) {
        return this.getId() == item.getId();
    }
}
