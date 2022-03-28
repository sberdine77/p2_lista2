package br.ufrpe.p2.questao03;

import java.time.LocalDateTime;

public class PlusPlan extends Income {
    private int totalAccounts;

    public PlusPlan(String description, LocalDateTime date, int totalAccounts) {
        super(description, date);
        this.totalAccounts = totalAccounts;
    }

    public int getTotalAccounts() {
        return totalAccounts;
    }
    
    public void setTotalAccounts(int totalAccounts) {
        this.totalAccounts = totalAccounts;
    }

    @Override
    public double calculateTotal() {
        return totalAccounts * 35;
    }

    @Override
    public String toString() {
        return "Tipo: " + this.getType() + "\n" + "Descrição: " + this.getDescription() + "\n" + "Data: " + this.getDate() + "\n" + "Total: " + this.calculateTotal();
    }
}
