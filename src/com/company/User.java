package com.company;

public class User {
    private static int count;

    static {
        count=0;
    }

    public enum TelType
    {
        individual, twin, shared
    }

    private int id;
    private String name;
    private String phone;
    private TelType telType;
    private String adress;

    public User(){count++;this.id=count;}

    public User(String name, String phone, TelType telType, String adress) {
        this.name = name;
        this.phone = phone;
        this.telType = telType;
        this.adress = adress;
        count++;
        this.id=count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public TelType getTelType() {
        return telType;
    }

    public String getAdress() {
        return adress;
    }

    public void setTelType(TelType telType) {
        this.telType = telType;
    }
    public String toString(){
        return ("\n"+id + ": Имя:"+name+" Номер:"+phone+" Тип подключения:"+telType.toString()+" Адрес:"+adress+((id==count)?"\n":""));
    }
}
