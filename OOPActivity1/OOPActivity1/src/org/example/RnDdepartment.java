package org.example;
public class RnDdepartment extends department {
    private int numResearchProjects;
    private String researchSupervisor;


    public RnDdepartment(String name, String location, int noEmployee, double budget) {
        super(name, location, noEmployee, budget);
        this.numResearchProjects = numResearchProjects;
        this.researchSupervisor = researchSupervisor;
        name="R&D Department";
        location="3rd floor";
        budget=1200500.90;
        noEmployee=25;
        numResearchProjects=10;
        researchSupervisor="kamal";
        System.out.println("details of R&D department");
        System.out.println("name: "+name);
        System.out.println("locatoin: "+location);
        System.out.println("budget: "+budget);
        System.out.println("number of employees: "+noEmployee);
        System.out.println("number of research projects: "+numResearchProjects);
        System.out.println("name of supervisor: "+researchSupervisor);
    }
}