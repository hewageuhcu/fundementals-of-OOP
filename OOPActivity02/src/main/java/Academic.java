package org.example;
public  class Academic extends user{
    private String TimeTable;
public Academic(int UserID, String Address, int NIC, String name){
    super(UserID,Address,NIC,name);

    UserID=123;
    Address="3rd street, colombo.";
    NIC=312435;
    name="Seetha";
    TimeTable="6 hours";
    System.out.println("details of academic staff");
    System.out.println("user id is: "+UserID);
    System.out.println("address is: "+Address);
    System.out.println("nic is: "+NIC);
    System.out.println("name is: "+name);
    System.out.println("work time is: "+TimeTable);
    System.out.println("academic includes dean,HoD and lecturer");
}
}
