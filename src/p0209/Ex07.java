package p0209;

class Bank {
    private String name;
    private int money;
    private static double rate = 0.03f;
    private int year;
    private double tot;

    public Bank(String name, int money, int year) {
        this.name = name;
        this.money = money;
        this.year = year;
        tot = money + money * rate * year;
    }

    public void disp() {
        System.out.println(name + " : " + money + "원 : " + rate + "% : " + year + "년 : " + "->" + tot);
    }
}

public class Ex07 {
    static void main(String[] args) {
        Bank b1 = new Bank("홍길동", 100000, 1);
        b1.disp();
        Bank b2 = new Bank("김철수", 240000, 2);
        b2.disp();
    }
}
