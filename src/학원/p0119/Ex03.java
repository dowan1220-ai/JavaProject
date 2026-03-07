package 학원.p0119;


import java.util.Scanner;

public class Ex03 {
    static String machine(int select) {

        String product = null;

        if (select == 1) {
            product = "콜라";
        } else if (select == 2) {
            product = "사이다";
        } else if (select == 3) {
            product = "환타";
        } else {
            product = "잘못선택";
        }
        return product;

    }

    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴 선택 1. 콜라 2.사이다 3.환타");
        int sel = Integer.parseInt(sc.nextLine());
        String result = machine(sel);
        System.out.println(result);

    }

}
