package org.example;

public class Main {
    public static void main(String[] args) {
        HRdepartment hrDepartment = new HRdepartment("HRdepartment", "3rd floor", 25, 1100500.90);

        hrDepartment.prepareBudget();
        hrDepartment.conductInterviews();

        RnDdepartment rnddepartment=new RnDdepartment("RnDdepartment","4th floor",29,1100250.75);

    }
}


