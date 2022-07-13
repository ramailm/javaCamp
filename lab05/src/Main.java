import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows,cols,numMines;
        rows = sc.nextInt();
        cols = sc.nextInt();
        numMines = sc.nextInt();
        MyMinesweeper m = new MyMinesweeper(rows,cols,numMines);
        //bundan sonrasi gelistirilebilir
        m.printClues(m.generateClues());
    }
}

