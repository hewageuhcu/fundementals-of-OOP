package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


public abstract class department {
    protected String name;
    protected String location;
    protected int noEmployee;
    protected double budget;


    public department(String name, String location, int noEmployee, double budget) {
        this.budget = budget;
        this.location = location;
        this.name = name;
        this.noEmployee = noEmployee;

    }


    public void prepareBudget() {
        System.out.println("enter prices and calculate the budget");

    }


    public void conductInterviews() {
        System.out.println("call applications for interviews");
    }


}
