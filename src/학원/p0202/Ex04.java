package 학원.p0202;

class Car {
    String model;
    String color;
    int year;

    Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    void info() {

        System.out.println("모델 : " + model + " 색상 : " + color + " 연식 : " + year);
    }
}

public class Ex04 {
    public static void main(String[] args) {
        Car c1 = new Car("제네시스", "검정", 2026);
        Car c2 = new Car("벤츠", "은색", 2025);
        Car c3 = new Car("아우디", "빨강", 2020);
        c1.info();
        c2.info();
        c3.info();
    }
}
