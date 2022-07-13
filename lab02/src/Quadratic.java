import java.util.Scanner;

public class Quadratic {

    double a,b,c;
    double x1,x2;
    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        double delta = getDiscriminant();
        x1 = (-b + Math.sqrt(delta))/(2*a);
        x2 = (-b - Math.sqrt(delta))/(2*a);

    }
    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getDiscriminant() {
        return b*b - 4*a*c;
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        Quadratic q = new Quadratic(a,b,c);
        System.out.println("x1: " + q.getX1() +"\nx2: " + q.getX2());
        scanner.close();
    }
}