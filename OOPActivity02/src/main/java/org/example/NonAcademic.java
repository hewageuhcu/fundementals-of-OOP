package org.example;

public class NonAcademic extends user{
    private String DutyList;
    public NonAcademic(int UserID, String Address, int NIC, String name){
        super(UserID,Address,NIC,name);

        this.DutyList=DutyList;
        UserID=795;
        Address="Kalaniya";
        NIC=389650;
        name="Sarath";
        DutyList="12 hours";
        System.out.println("details of non academic staff");
        System.out.println("user id is: "+UserID);
        System.out.println("address is: "+Address);
        System.out.println("nic is: "+NIC);
        System.out.println("name is: "+name);
        System.out.println("work time is: "+DutyList);
        System.out.println("non academic includes admin and course coordinator");
    }
}


