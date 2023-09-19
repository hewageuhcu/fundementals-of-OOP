package org.example;
public class Student extends user {
    private int Batch;
    private String EnrolledCourse;

    public Student(int UserID, String Address, int NIC, String name) {
        super(UserID, Address, NIC, name);
        this.Batch = Batch;
        this.EnrolledCourse = EnrolledCourse;
        UserID = 213884759;
        Address = "Ratnapura";
        NIC = 204900;
        name = "Nimali";
        Batch = 21;
        EnrolledCourse = "SE,java";
        System.out.println("details of Student");
        System.out.println("user id is: " + UserID);
        System.out.println("address is: " + Address);
        System.out.println("nic is: " + NIC);
        System.out.println("name is: " + name);
        System.out.println("batch is: " + Batch);
        System.out.println("enrollments are: " + EnrolledCourse);
    }

        public void  viewMaterial(){
            System.out.println("students can view materials");
        }
        public void uploadAssaignment(){
            System.out.println("students can upload assignments");
        }


}
