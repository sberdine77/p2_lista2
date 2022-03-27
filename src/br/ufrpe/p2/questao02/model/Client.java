package br.ufrpe.p2.questao02.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client extends Person{
    private long code;

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }
    
    public Client(String name, LocalDate birthdayDate, long code) {
        super(name, birthdayDate);
        this.code = code;
    }

    @Override
    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYY");
        return "Nome: " + this.getName() + "\nData de nascimento: " + this.getBirthdayDate().format(formatter) + "\nCode: " + this.code;
    }

    @Override
    public boolean equals(Object personToCompare) {
        if(!super.equals(personToCompare)) {
            return false;
        }
        if(personToCompare instanceof Client) {
            Client comparison = (Client) personToCompare;
            if(comparison.code == this.code) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    
}
