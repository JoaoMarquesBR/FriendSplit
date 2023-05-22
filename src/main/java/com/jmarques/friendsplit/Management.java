package com.jmarques.friendsplit;

import java.util.ArrayList;

public class Management {
    public static ArrayList<User> users = new ArrayList<>();
    public static ArrayList<Item> items = new ArrayList<>();


    public static void addUser(String name,int id){
        users.add(new User(name,id));
    }

    public static void addItem(String name, double price,ArrayList<User>users){
        items.add(new Item(name,price,users));
    }

    public static void addDebt(int indexUser,int userInReceiving,double amount){
        users.get(indexUser).assignDebt(users.get(userInReceiving).name,amount);
        users.get(userInReceiving).assignCredit(users.get(indexUser).name,amount);

    }

    public static void calculateTotalPrice(){
        for(int i=0;i<items.size();i++){

            double itemPeEach = items.get(i).pricePerUser();
            ArrayList<User>usersInCommon = usersInCommon(users,items.get(i).usersAssigned);
            updateUsersBill(usersInCommon,itemPeEach);
        }

    }

    private static void updateUsersBill(ArrayList<User>users,double amount){
        for(User x : users ){
            x.addBillValue(amount + x.debt - x.credit);
        }
    }

    private static ArrayList<User>usersInCommon(ArrayList<User>currentList,ArrayList<User>itemUserList){
        ArrayList<User>usersInCommon = new ArrayList<>();
        for(int i=0;i<currentList.size();i++){
            if(itemUserList.contains(currentList.get(i))){
                usersInCommon.add(currentList.get(i));
            }
        }
        return usersInCommon;
    }

}
