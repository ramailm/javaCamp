//@author sümeyye karagül

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Sırasıyla id numaranızı, cinsiyetinizi, toplam kolestrol ve HDL değerinizi giriniz");
        Scanner sc = new Scanner(System.in);
        double tChol,hdl;
        String id,gender;
        id = sc.nextLine();
        gender = sc.nextLine();
        tChol = sc.nextDouble();
        hdl = sc.nextDouble();
        Person person = new Person(id,gender,tChol,hdl);
        person.printReport();
        sc.close();
    }
}
