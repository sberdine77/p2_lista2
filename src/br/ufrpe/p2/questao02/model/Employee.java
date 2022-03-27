package br.ufrpe.p2.questao02.model;

import java.time.LocalDate;

public class Employee extends Person {
    private double salary;
    static final double SALARIO_TETO_IMPOSTO = 5000;

    public Employee(String name, LocalDate birthdayDate, double salary) {
        super(name, birthdayDate);
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateTaxes(){
        if(this.salary <= SALARIO_TETO_IMPOSTO) {
            return this.salary * 5/100;
        } else {
            return this.salary * 7.5/100;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalário: " + this.salary + "\nImposto devido: " + this.calculateTaxes();
    }

    @Override
    public boolean equals(Object personToCompare) {
        if(!super.equals(personToCompare)) {
            return false;
        }
        if(personToCompare instanceof Employee) {
            Employee comparison = (Employee) personToCompare;
            if(comparison.getSalary() == this.salary) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
