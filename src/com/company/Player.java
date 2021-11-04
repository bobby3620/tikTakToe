package com.company;


import java.util.ArrayList;

public class Player{

    static ArrayList<Integer> check = new ArrayList<>();

    public String assignPlayer = "";

    public Player(){
    }

    public void setCheck(int num){
        check.add(num);
    }

    public boolean checkMove(int move){
        for(int i = 0; i < check.size(); i++){
            if(check.get(i) == move){
                return true;
            }
        }
        return false;
    }


    public String assignPlayer(String a){
        assignPlayer = a;
        return assignPlayer;
    }
}
