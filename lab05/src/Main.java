import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows,cols,numMines;
        System.out.println("sorasıyla mayın tarlanızın satır,sütun ve mayınlı bölge adet sayınızı giriniz.. ");
        rows = sc.nextInt();
        cols = sc.nextInt();
        numMines = sc.nextInt();
        MyMinesweeper m = new MyMinesweeper(rows,cols,numMines);
        //bundan sonrasında consol üzerinde oynanması için iyileştirilmeye gidilebilir..
        m.printClues(m.generateClues());
    }
}

