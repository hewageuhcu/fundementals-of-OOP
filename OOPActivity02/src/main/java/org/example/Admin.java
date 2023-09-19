package org.example;
public class Admin extends NonAcademic {
    public Admin(int UserID, String Address, int NIC, String name) {
        super(UserID, Address, NIC, name);
        UserID=49970;
        Address="Muthur,Kinniya";
        NIC=884239;
        name="Aravinthan";
        System.out.println("details of admin");
        System.out.println("user id is: "+UserID);
        System.out.println("address is: "+Address);
        System.out.println("nic is: "+NIC);
        System.out.println("name is: "+name);
    }
    public void addUser(){
        System.out.println("admin can add users");
    }
    public void  editUser(){
        System.out.println("admin can edit users");
    }
    public void  deleteUser(){
        System.out.println("admin can delete users");
    }
    public void  addCourse(){
        System.out.println("admin can add courses");
    }
    public void  editCourse(){
        System.out.println("admin can edit courses");
    }
    public void   deleteCourse(){
        System.out.println("admin can deoete courses");
    }
    public void  enrollCourseCoordinator(){
        System.out.println("admin can enroll course coordinators");
    }

}
