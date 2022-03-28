package br.ufrpe.p2.questao03;

import java.time.LocalDateTime;

public class EnterprisePlan extends Income {
    private int totalAccounts;

    public EnterprisePlan(String description, LocalDateTime date, int totalAccounts) {
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
        return totalAccounts * 150;
    }
}
