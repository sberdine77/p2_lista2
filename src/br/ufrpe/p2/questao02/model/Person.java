package br.ufrpe.p2.questao02.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Formatter;

abstract class Person {
    private String name;
    private LocalDate birthdayDate;

    public void Pessoa(String name, LocalDate birthdayDate){
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
}
