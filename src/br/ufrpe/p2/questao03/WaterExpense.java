package br.ufrpe.p2.questao03;

import java.time.LocalDateTime;

public class WaterExpense extends Expense {
    private double totalM3;

    public WaterExpense(String description, LocalDateTime date, double totalM3){
        super(description, date);
        this.totalM3 = totalM3;
    }

    public double getTotalM3() {
        return totalM3;
    }

    public void setTotalM3(double totalM3) {
        this.totalM3 = totalM3;
    }

    @Override
    public double calculateTotal() {
        double track1 = 0;
        double track2 = 0;
        double track3 = 0;

        if(totalM3 > 20) {
            track1 = 45;
            track2 = (10 * 5);
            track3 = ((totalM3 - 20) * 6);
        } else if(totalM3 > 10) {
            track1 = 45;
            track2 = ((totalM3 - 10) * 5);
        } else  {
            track1 = 45;
        }

        return track1 + track2 + track3;
    }

    @Override
    public String toString() {
        return "Tipo: " + this.getType() + "\n" + "Descrição: " + this.getDescription() + "\n" + "Data: " + this.getDate() + "\n" + "Total: " + this.calculateTotal();
    }
}
