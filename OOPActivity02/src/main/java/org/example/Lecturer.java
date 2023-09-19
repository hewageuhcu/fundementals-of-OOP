package org.example;
public class Lecturer extends org.example.Academic {
private String CoursesConducted;
    public Lecturer(int UserID, String Address, int NIC, String name) {
        super(UserID, Address, NIC, name);
        this.CoursesConducted=CoursesConducted;
        UserID = 940348;
        Address = "Waskaduwa";
        NIC = 4239138;
        name = "Saman";
        CoursesConducted="OOAD,SE";
        System.out.println("details of lecturer");
        System.out.println("user id is: " + UserID);
        System.out.println("address is: " + Address);
        System.out.println("nic is: " + NIC);
        System.out.println("name is: " + name);
        System.out.println("courses are "+CoursesConducted);
    }
    public void updateAll(){
        System.out.println("lecturers can update all");
    }
public void edtiAll(){
    System.out.println("lecturers can edit all");
}
public void deleteAll(){
    System.out.println("lecturers can delete all");
}

}
