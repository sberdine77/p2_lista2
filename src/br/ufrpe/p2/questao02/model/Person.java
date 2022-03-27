package br.ufrpe.p2.questao02.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Person {
    private String name;
    private LocalDate birthdayDate;

    public Person(String name, LocalDate birthdayDate){
        this.name = name;
        this.birthdayDate = birthdayDate;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }
    public void setBirthdayDate(LocalDate birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYY");
        return "Nome: " + name + "\nData de nascimento: " + birthdayDate.format(formatter);
    }

    @Override
    public boolean equals(Object personToCompare) {
        if(personToCompare instanceof Person) {
            Person comparison = (Person) personToCompare;
            if(comparison.getName() == this.name && this.birthdayDate.getYear() == comparison.birthdayDate.getYear() && this.birthdayDate.getMonth() == comparison.birthdayDate.getMonth() && this.birthdayDate.getDayOfMonth() == comparison.birthdayDate.getDayOfMonth()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
