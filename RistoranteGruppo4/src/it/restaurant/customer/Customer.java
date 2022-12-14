package it.restaurant.customer;


import it.restaurant.food.MenuTypeEnum;

import java.util.List;

public class Customer {

    private MenuTypeEnum type;
    private String name;
    private String surname;

    public Customer(String name, MenuTypeEnum type){
        this.type = type;
        this.name = name;
    }

    public Customer(String name, String surname, MenuTypeEnum type){
        this.type = type;
        this.name = name;
        this.surname = surname;
    }

    public String getDetails(){if(surname != null){return name +" "+ surname +" "+ " (" + type+ ")";}else{return name+" "+ "(" + type + ")";}}



    public MenuTypeEnum getType(){
        return type;
    }

    public void setType(MenuTypeEnum type){
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

}
