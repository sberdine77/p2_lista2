package br.ufrpe.p2.questao02;

import java.time.LocalDate;
import java.util.ArrayList;

import br.ufrpe.p2.questao02.data.PersonRepository;
import br.ufrpe.p2.questao02.model.Client;
import br.ufrpe.p2.questao02.model.Employee;
import br.ufrpe.p2.questao02.model.Manager;
import br.ufrpe.p2.questao02.model.Person;

public class Runner {
    public static void main(String[] args) throws Exception {
        PersonRepository myRepo = new PersonRepository();

        //CLIENTS
        Client client1 = new Client("Cliente1", LocalDate.of(1995, 12, 05), 1);
        Client client2 = new Client("Cliente2", LocalDate.of(1996, 12, 05), 2);
        Client client3 = new Client("Cliente3", LocalDate.of(1997, 12, 05), 3);
        Client client4 = new Client("Cliente4", LocalDate.of(2010, 12, 05), 4);
        Client client5 = new Client("Cliente5", LocalDate.of(2011, 12, 05), 5);

        myRepo.registerPerson(client1);
        myRepo.registerPerson(client2);
        myRepo.registerPerson(client3);
        myRepo.registerPerson(client4);
        myRepo.registerPerson(client5);

        Client client6 = new Client("Cliente1", LocalDate.of(1995, 12, 05), 1);
        myRepo.registerPerson(client6);

        //EMLOYEES
        Employee employee1 = new Employee("Funcionario1", LocalDate.of(1995, 12, 05), 2000);
        Employee employee2 = new Employee("Funcionario2", LocalDate.of(1996, 12, 05), 3000);
        Employee employee3 = new Employee("Funcionario3", LocalDate.of(1997, 12, 05), 4000);
        Employee employee4 = new Employee("Funcionario4", LocalDate.of(2010, 12, 05), 6000);
        Employee employee5 = new Employee("Funcionario5", LocalDate.of(2011, 12, 05), 7000);

        myRepo.registerPerson(employee1);
        myRepo.registerPerson(employee2);
        myRepo.registerPerson(employee3);
        myRepo.registerPerson(employee4);
        myRepo.registerPerson(employee5);

        Employee employee6 = new Employee("Funcionario1", LocalDate.of(1995, 12, 05), 2000);
        myRepo.registerPerson(employee6);

        //MANAGERS
        Manager manager1 = new Manager("Manager1", LocalDate.of(1995, 12, 05), 2000, "TI");
        Manager manager2 = new Manager("Manager2", LocalDate.of(1996, 12, 05), 3000, "TI");
        Manager manager3 = new Manager("Manager3", LocalDate.of(1997, 12, 05), 4000, "RH");
        Manager manager4 = new Manager("Manager4", LocalDate.of(2010, 12, 05), 6000, "MARKETING");
        Manager manager5 = new Manager("Manager5", LocalDate.of(2011, 12, 05), 7000, "FINANÇAS");

        myRepo.registerPerson(manager1);
        myRepo.registerPerson(manager2);
        myRepo.registerPerson(manager3);
        myRepo.registerPerson(manager4);
        myRepo.registerPerson(manager5);

        Manager manager6 = new Manager("Manager1", LocalDate.of(1995, 12, 05), 2000, "TI");
        myRepo.registerPerson(manager6);

        //LISTING
        ArrayList<Client> clientsOfAge = myRepo.listClientsOfAge();
        ArrayList<Employee> employeesWithSalaryGreaterThan5000 = myRepo.listEmployeesWithSalaryGreaterThan(5000);
        ArrayList<Person> personsOfAge = myRepo.listPersonsOfAge();
        ArrayList<Manager> managersFromTI = myRepo.listManagersFromArea("TI");

        System.out.println("GERENTES DE TI:");
        for (Manager manager : managersFromTI) {
            System.out.println(manager + "\n");
        }

        System.out.println("FUNCIONÁRIOS COM SALÁRIO MAIOR QUE 5000:");
        for (Employee employee : employeesWithSalaryGreaterThan5000) {
            System.out.println(employee + "\n");
        }

        System.out.println("PESSOAS MAIORES DE IDADE:");
        for (Person person : personsOfAge) {
            System.out.println(person + "\n");
        }

        System.out.println("CLIENTES MAIORES DE IDADE:");
        for (Client client : clientsOfAge) {
            System.out.println(client + "\n");
        }
    }
}
