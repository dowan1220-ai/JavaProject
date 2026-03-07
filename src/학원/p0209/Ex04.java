package 학원.p0209;

import java.util.Scanner;

class Calc {
    private int x;
    private int y;
    private static int tot;
    Scanner sc = new Scanner(System.in);

    public Calc() {
        System.out.println("x = ");
        this.x = Integer.parseInt(sc.nextLine());
        System.out.println("y = ");
        this.y = Integer.parseInt(sc.nextLine());
        Calc.tot = this.x + this.y;
    }

    public static int getTot() {
        return Calc.tot;
    }

    public static void setTot() {
        Calc.tot = tot;

    }

    public void display() {
        System.out.println(this.x + " + " + this.y + " = " + Calc.tot);

    }

}

public class Ex04 {
    static void main(String[] args) {
        Calc rd = new Calc();
        System.out.println();
        System.out.println(Calc.getTot());
        System.out.println();
        rd.display();
    }
}
