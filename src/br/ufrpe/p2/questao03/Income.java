package br.ufrpe.p2.questao03;

import java.time.LocalDateTime;

public abstract class Income implements Transaction {
    private String description;
    private LocalDateTime date;

    public Income(String description, LocalDateTime date){
        this.description = description;
        this.date = date;
    }

    @Override
    public LocalDateTime getDate() {
        return this.date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getType() {
        return "RECEITA";
    }

    @Override
    public double calculateTotal() {
        return 0;
    }

    @Override
    public String toString() {
        return "Tipo: " + this.getType() + "\n" + "Descrição: " + this.getDescription() + "\n" + "Data: " + this.getDate() + "\n" + "Total: " + this.calculateTotal();
    }
}
