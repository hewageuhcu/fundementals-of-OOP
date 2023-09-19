package org.example;

public class HRdepartment extends department {



    public HRdepartment(String name, String location, int noEmployee, double budget) {
        super(name, location, noEmployee, budget);
        name = "HR Department";
        location = "4th floor";
        noEmployee = 29;
        budget = 1100250.75;
        System.out.println("details of HR department");
        System.out.println("name is: "+name);
        System.out.println("location is: "+location);
        System.out.println("number of employees is: "+noEmployee);
        System.out.println("budget is: "+budget);
    }
    public void conductInterviews() {
        System.out.println("HR:call applications for interviews");

    }
}

