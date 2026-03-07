package 학원.p0119;

public class Ex04 {

    static int machine(int money, String drink) {

        int price = 0;

        if (drink.equals("콜라")) {
            price = 800;
        } else if (drink.equals("사이다")) {
            price = 700;
        } else if (drink.equals("물")) {
            price = 700;
        } else {
            System.out.println("없는 음료입니다.");
        }

        if (money < price) {
            System.out.println("돈이 부족합니다.");
            return money;
        } else {
            System.out.println(drink + "가 나왔습니다.");
            int change = money - price;
            return change;
        }

    }

    public static void main(String[] ar) {
        int result = machine(1000, "콜라");
        System.out.println("거스름돈:" + result);

    }

}
