package br.ufrpe.p2.questao03;

import java.time.LocalDateTime;

public class EnergyExpense extends Expense {
    private double kWh;

    public EnergyExpense(String description, LocalDateTime date, double kWh) {
        super(description, date);
        this.kWh = kWh;
    }

    public double getkWh() {
        return kWh;
    }

    public void setkWh(double kWh) {
        this.kWh = kWh;
    }

    @Override
    public double calculateTotal() {
        double result = 0;
        double base = kWh * 0.5;
        result = base;
        if(base >= 100) {
            result += ((base % 100) * 1.2);
        }
        if(base <= 50){
            result += 2;
        } else if(base > 50 && base <= 200) {
            result += 15;
        } else {
            result += 35;
        }

        return result;
    }

    @Override
    public String toString() {
        return "Tipo: " + this.getType() + "\n" + "Descrição: " + this.getDescription() + "\n" + "Data: " + this.getDate() + "\n" + "Total: " + this.calculateTotal();
    }
}
