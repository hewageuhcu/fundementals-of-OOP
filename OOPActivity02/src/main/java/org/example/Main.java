package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
org.example.Academic academic=new org.example.Academic(123,"3rd street, colombo.",312435,"seetha");

HoD hod=new HoD(234,"3/A, Kandy",7855321,"Jayaratne");

org.example.Dean dean =new org.example.Dean(8954,"Nawala,Rajagiriya",745590,"Nihal");

Lecturer lecturer=new Lecturer(940348,"Waskaduwa",4239138,"Saman");

lecturer.updateAll();
lecturer.edtiAll();
lecturer.deleteAll();

NonAcademic nonacademic=new NonAcademic(795,"Kalaniya",389650,"Sarath");


org.example.CourseCoordinator ccoordinator=new org.example.CourseCoordinator(954,"Udawalawe",785431,"Rajini");

ccoordinator.enrollLecturer();
ccoordinator.enrollStudent();

Admin admin=new Admin(49970,"Muthur,Kinniya",884239,"Aravinthan");
        admin.addUser();
        admin.editUser();
        admin.deleteUser();
        admin.addCourse();
        admin.editCourse();
        admin.deleteCourse();
        admin.enrollCourseCoordinator();

        org.example.Student student=new org.example.Student(213884759,"Ratnapura",204900,"Nimali");
        student.viewMaterial();
        student.uploadAssaignment();








    }
}