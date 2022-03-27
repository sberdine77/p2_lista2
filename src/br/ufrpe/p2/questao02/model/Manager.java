package br.ufrpe.p2.questao02.model;

import java.time.LocalDate;

public class Manager extends Employee {
    private String area;

    public Manager(String name, LocalDate birthdayDate, double salary, String area) {
        super(name, birthdayDate, salary);
        this.area = area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    @Override
    public String toString() {
        return super.toString() + "\nÁrea: " + this.area;
    }

    @Override
    public boolean equals(Object personToCompare) {
        if(!super.equals(personToCompare)) {
            return false;
        }
        if(personToCompare instanceof Manager) {
            Manager comparison = (Manager) personToCompare;
            if(comparison.area == this.area) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
