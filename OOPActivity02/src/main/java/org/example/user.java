package org.example;
public abstract class user {
    protected int UserID;
    protected String Address;
    protected int NIC;
    protected String name;

    public user(int UserID,String Address, int NIC, String name){
        this.Address=Address;
        this.name=name;
        this.NIC=NIC;
        this.UserID=UserID;
    }

}
