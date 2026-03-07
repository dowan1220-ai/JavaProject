package p0209;

class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;

    }
}

class VendingMachine {
    int money;

    void insertMoney(int amount) {
        money += amount;
    }

    void buy(Product product) {

        if (money >= product.price) {
            money -= product.price;
            System.out.println(product.name + "나왔습니다" + "\n잔돈 " + money + "원이 나왔습니다.");
        } else {
            System.out.println("돈이 부족합니다.");
        }
    }
}

public class Ex01 {
    static void main() {
        Product p1 = new Product("콜라", 1500);
        Product p2 = new Product("물", 1000);
        VendingMachine machine = new VendingMachine();
        machine.insertMoney(2000);
        machine.buy(p1);

    }
}
