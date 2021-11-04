package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner playerMove = new Scanner(System.in);
	    InitalizeBoard ib = new InitalizeBoard();
	    Player player = new Player();
	    Player playerOne = new Player();
        Player playerTwo = new Player();

	    boolean winner = false;
	    int counter = 0;
	    int num;

	    //Init Board -> only once
        ib.initBoard();
        ib.printBoard();

	    while(winner != true){
        System.out.println("Pick a number that corresponds to the board");
        num = playerMove.nextInt();

            if(player.checkMove(num)){
                System.out.println("This was already picked. Pick a different value");
            }else{
                if(counter % 2 == 0){
                    player.setCheck(num);
                    ib.setPlayerMove(num, playerOne.assignPlayer("X"));
                    ib.updateBoard();
                    ib.printBoard();
                    if(ib.declareWinner()){
                        System.out.println();
                        System.out.println("Player one wins");
                        winner = true;
                    }else if(ib.draw()){
                        System.out.println();
                        System.out.println("It's a draw");
                        System.out.println();
                        ib.printBoard();
                    }
                    counter++;
                }else{
                    player.setCheck(num);
                    ib.setPlayerMove(num, playerTwo.assignPlayer("O"));
                    ib.updateBoard();
                    ib.printBoard();
                    if(ib.declareWinner()){
                        System.out.println();
                        System.out.println("Player two wins");
                        winner = true;
                    }else if(ib.draw()){
                        System.out.println();
                        System.out.println("It's a draw");
                        System.out.println();
                        ib.printBoard();
                    }
                    counter++;
                }
            }
        }
    }
}
