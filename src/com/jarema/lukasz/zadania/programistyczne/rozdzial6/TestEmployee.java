package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Sara Magura", 47899, "Rachunkowość", "Wiceprezes");
        Employee employee2 = new Employee("Marek Janczyk", 39119, "Informatyka", "Programista");
        Employee employee3 = new Employee("Julia Rak", 81774, "Produkcja", "Inżynier");

        System.out.println("Imię i nazwisko pracownika\t\tIdentyfikator\t\tDział\t\tStanowisko");
        System.out.println(employee1.getName() + "\t\t\t\t\t\t" + employee1.getIdNumber() + "\t\t\t\t" +
                employee1.getDepartment() + employee1.getPosition());
        System.out.println(employee2.getName() + "\t\t\t\t\t" + employee2.getIdNumber() + "\t\t\t\t" +
                employee2.getDepartment() + employee2.getPosition());
        System.out.println(employee3.getName() + "\t\t\t\t\t\t" + employee3.getIdNumber() + "\t\t\t\t" +
                employee3.getDepartment() + "\t" + employee3.getPosition());
    }
}
