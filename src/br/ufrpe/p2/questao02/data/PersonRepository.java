package br.ufrpe.p2.questao02.data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;

import br.ufrpe.p2.questao02.model.Client;
import br.ufrpe.p2.questao02.model.Employee;
import br.ufrpe.p2.questao02.model.Manager;
import br.ufrpe.p2.questao02.model.Person;

public class PersonRepository {
    private ArrayList<Person> persons;

    public PersonRepository() {
        this.persons = new ArrayList<Person>();
    }

    public void registerPerson(Person person){
        if(!this.persons.contains(person)){
            this.persons.add(person);
        }
    }

    public ArrayList<Person> listPersonsOfAge(){
        return this.persons.stream().filter(person -> {
            if(person instanceof Person) {
                Person tempPerson = (Person) person;
                if(tempPerson.getBirthdayDate().isBefore(LocalDate.now().minusYears(18))) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }).collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Client> listClientsOfAge(){
        ArrayList<Person> arrayToCast = this.persons.stream().filter(client -> {
            if(client instanceof Client) {
                Client tempClient = (Client) client;
                if(tempClient.getBirthdayDate().isBefore(LocalDate.now().minusYears(18))) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }).collect(Collectors.toCollection(ArrayList::new));

        ArrayList<Client> result = new ArrayList<Client>();
        for (Person person : arrayToCast) {
            result.add((Client) person);
        }

        return result;
    }

    public ArrayList<Employee> listEmployeesWithSalaryGreaterThan(double salary){
        ArrayList<Person> arrayToCast = this.persons.stream().filter(employee -> {
            if(employee instanceof Employee) {
                Employee tempEmployee = (Employee) employee;
                if(tempEmployee.getSalary() > salary) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }).collect(Collectors.toCollection(ArrayList::new));

        ArrayList<Employee> result = new ArrayList<Employee>();
        for (Person person : arrayToCast) {
            result.add((Employee) person);
        }

        return result;
    }

    public ArrayList<Manager> listManagersFromArea(String area){
        ArrayList<Person> arrayToCast = this.persons.stream().filter(manager -> {
            if(manager instanceof Manager) {
                Manager tempManager = (Manager) manager;
                if(tempManager.getArea() == area) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }).collect(Collectors.toCollection(ArrayList::new));

        ArrayList<Manager> result = new ArrayList<Manager>();
        for (Person person : arrayToCast) {
            result.add((Manager) person);
        }

        return result;
    }
}
