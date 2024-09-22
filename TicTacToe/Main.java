package TicTacToe;

import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {
       TicTakToe ticTakToe=new TicTakToe();

       ticTakToe.initialiseGame();
//        System.out.println(ticTakToe.gameBoard.board);
        System.out.println("game winner is :"+ticTakToe.startGame());
    }
}
