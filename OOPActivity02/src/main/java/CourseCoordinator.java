package org.example;
public class CourseCoordinator extends NonAcademic{
private String CoordinatingCourse;
    public CourseCoordinator(int UserID, String Address, int NIC, String name) {
        super(UserID, Address, NIC, name);
        this.CoordinatingCourse=CoordinatingCourse;
        UserID =954;
        Address = "Udawalawe";
        NIC = 785431;
        name = "Rajini";
        CoordinatingCourse="english";
        System.out.println("details of Course Coordinator");
        System.out.println("user id is: " + UserID);
        System.out.println("address is: " + Address);
        System.out.println("nic is: " + NIC);
        System.out.println("name is: " + name);
        System.out.println("course is: " +CoordinatingCourse);

    }
    public void enrollLecturer(){
        System.out.println("lecturer is Rajini");
    }
    public void enrollStudent(){
        System.out.println("20 students are there");
    }
}
