package br.ufrpe.p2.questao03;

import java.time.LocalDateTime;

public class InternetExpense extends Expense {
    private double traffickedData;

    public double getTraffickedData() {
        return traffickedData;
    }

    public void setTraffickedData(double traffickedData) {
        this.traffickedData = traffickedData;
    }

    public InternetExpense(String description, LocalDateTime date, double traffickedData) {
        super(description, date);
        this.traffickedData = traffickedData;
    }

    @Override
    public double calculateTotal() {
        if(traffickedData <= 20){
            return 90.9;
        } else if(traffickedData > 20 && traffickedData < 100) {
            return 90.9 + ((traffickedData - 20) * 3.9);
        } else if(traffickedData >= 100 && traffickedData < 500) {
            return 240.9 + ((traffickedData - 100) * 4.4);
        } else {
            return 590.9 + ((traffickedData - 500) * 5.1);
        }
    }
}
