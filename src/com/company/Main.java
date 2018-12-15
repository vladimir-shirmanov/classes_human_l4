package com.company;

public class Main {

    public static void main(String[] args) {
        Human person = new Human();
        person.setFirstName("Bill");
        person.setLastName("Gates");
        person.setMiddleName("Rudolfovitch");
        person.setAddress("New York, st Big Avenue 23");

        Boss boss = new Boss();
        boss.setFirstName("Josef");
        boss.setLastName("Besose");
        boss.setMiddleName("Rudolfovitch");
        boss.setAddress("New York, st Big Avenue 23");
        boss.setDepartment("Amazon");

        System.out.println(person);
        System.out.println(boss);
    }
}
