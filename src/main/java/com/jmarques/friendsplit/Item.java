package com.jmarques.friendsplit;

import java.util.ArrayList;

public class Item {
    private String name;
    private double price;
    public ArrayList<User>usersAssigned;


    public Item(String name,double price,ArrayList<User>usersAssigned){
        this.name = name;
        this.price = price;
        this.usersAssigned = usersAssigned;
    }

    /**
     * Calculate price to be assigned for each user
     */
    public double pricePerUser(){
        return price/usersAssigned.size();
    }

}
