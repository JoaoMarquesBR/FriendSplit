package com.jmarques.friendsplit;

import java.util.ArrayList;

public class User {
    public String name;
    public int ID;
    public double bill;
    public double debt;
    public double credit;

    public ArrayList<Debt>debts;

    public  User(String name,int id){
        this.name = name;
        this.ID = id;
        bill = 0;
        debts = new ArrayList<>();
    }

    public void addBillValue(double amount){
        bill+=amount;
    }

    /**
     * Assigns debt to user
     */
    public void assignDebt(String user, double amount){
        debts.add(new Debt(user,amount));
        this.debt+=amount;
    }

    /**
     * Assigns debt to user
     */
    public void assignCredit(String user, double amount){
        debts.add(new Debt(user,amount));
        this.credit+=amount;
    }

    public void printUserInfo(){
        System.out.println("User: "+ name+"\nBill: "+bill+"\nDebt: "+ debt+"\nReceiving: "+credit);
    }




}
