package com.jmarques.friendsplit;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scan= new Scanner(System.in);



    public static void main(String[] args) {

        Management.addUser("Joao",1);
        Management.addUser("Pedro",2);
        Management.addUser("Ana",3);
        Management.addUser("Gabriela",4);


        ArrayList<User> fritasList = new ArrayList<>(Management.users);


        ArrayList<User> coca = new ArrayList<>(Management.users);
        coca.remove(1);

        Management.addItem("Fritas",19.20,fritasList);
        Management.addItem("coca cola",10.20,coca);

        Management.addDebt(0,1,3);

        Management.calculateTotalPrice();


        for(User x : Management.users){
            x.printUserInfo();
            System.out.println("---------------\n");
        }

    }

}

