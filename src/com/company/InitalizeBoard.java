package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class InitalizeBoard extends Player{

    private ArrayList<Integer> playerMove = new ArrayList<>();
    private ArrayList<String> playerSpot = new ArrayList<>();
    Integer temp = 1;

    private String[][] board = new String[3][3];

    private int  move;
    private String player;

    public InitalizeBoard(){

    }

    public void initBoard(){
        for(int i = 0; i <3; i++){
            for(int j = 0; j < 3; j++){
                String spot = temp.toString();
                board[i][j] = spot;
                temp++;
            }
        }
        temp = 1;
    }

    public void setPlayerMove(int m, String p){
        move = m;
        player = p;
        playerMove.add(move);
        playerSpot.add(player);
    }


    public void updateBoard(){
        initBoard();
        for(int i = 0; i < playerMove.size(); i++){
            if(playerMove.get(i) == 1){
                board[0][0] = playerSpot.get(i);
            }
            if(playerMove.get(i) == 2){
                board[0][1] = playerSpot.get(i);
            }
            if(playerMove.get(i) == 3){
                board[0][2] = playerSpot.get(i);
            }
            if(playerMove.get(i) == 4){
                board[1][0] = playerSpot.get(i);
            }
            if(playerMove.get(i) == 5){
                board[1][1] = playerSpot.get(i);
            }
            if(playerMove.get(i) == 6){
                board[1][2] = playerSpot.get(i);
            }
            if(playerMove.get(i) == 7){
                board[2][0] = playerSpot.get(i);
            }
            if(playerMove.get(i) == 8){
                board[2][1] = playerSpot.get(i);
            }
            if(playerMove.get(i) == 9){
                board[2][2] = playerSpot.get(i);
            }
        }
    }

    public boolean declareWinner(){
        updateBoard();
        if(board[0][0].equalsIgnoreCase("O") && board[0][1].equalsIgnoreCase("O") && board[0][2].equalsIgnoreCase("O") ||
                board[1][0].equalsIgnoreCase("O") && board[1][1].equalsIgnoreCase("O") && board[1][2].equalsIgnoreCase("O") ||
                board[2][0].equalsIgnoreCase("O") && board[2][1].equalsIgnoreCase("O") && board[2][2].equalsIgnoreCase("O") ||
                board[0][0].equalsIgnoreCase("O") && board[1][0].equalsIgnoreCase("O") && board[2][0].equalsIgnoreCase("O") ||
                board[0][1].equalsIgnoreCase("O") && board[1][1].equalsIgnoreCase("O") && board[2][1].equalsIgnoreCase("O") ||
                board[0][2].equalsIgnoreCase("O") && board[1][2].equalsIgnoreCase("O") && board[2][2].equalsIgnoreCase("O") ||
                board[0][0].equalsIgnoreCase("O") && board[1][1].equalsIgnoreCase("O") && board[2][2].equalsIgnoreCase("O") ||
                board[0][2].equalsIgnoreCase("O") && board[1][1].equalsIgnoreCase("O") && board[2][0].equalsIgnoreCase("O")){
                    return true;
        }else if(board[0][0].equalsIgnoreCase("X") && board[0][1].equalsIgnoreCase("X") && board[0][2].equalsIgnoreCase("X") ||
                board[1][0].equalsIgnoreCase("X") && board[1][1].equalsIgnoreCase("X") && board[1][2].equalsIgnoreCase("X") ||
                board[2][0].equalsIgnoreCase("X") && board[2][1].equalsIgnoreCase("X") && board[2][2].equalsIgnoreCase("X") ||
                board[0][0].equalsIgnoreCase("X") && board[1][0].equalsIgnoreCase("X") && board[2][0].equalsIgnoreCase("X") ||
                board[0][1].equalsIgnoreCase("X") && board[1][1].equalsIgnoreCase("X") && board[2][1].equalsIgnoreCase("X") ||
                board[0][2].equalsIgnoreCase("X") && board[1][2].equalsIgnoreCase("X") && board[2][2].equalsIgnoreCase("X") ||
                board[0][0].equalsIgnoreCase("X") && board[1][1].equalsIgnoreCase("X") && board[2][2].equalsIgnoreCase("X") ||
                board[0][2].equalsIgnoreCase("X") && board[1][1].equalsIgnoreCase("X") && board[2][0].equalsIgnoreCase("X")){
                    return true;
        }
        return false;
    }

    public boolean draw(){
        if(check.size() == 9){
            playerMove.clear();
            playerSpot.clear();
            check.clear();
            initBoard();
            return true;
        }
        return false;
    }

    public void printBoard(){
        System.out.println(Arrays.deepToString(board).replace("],","\n")
                .replace("[[", "").replace("[", "\n")
                .replace("]]", "").replace(","," |"));
        }
}

