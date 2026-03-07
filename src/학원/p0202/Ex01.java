package 학원.p0202;

class FishBread {
    static void info() {
        System.out.println("기본 붕어빵");
    }
}

public class Ex01 {
    public static void main(String[] args) {
        FishBread a = new FishBread();
        FishBread b = new FishBread();
        FishBread c = new FishBread();
        a.info();
        b.info();
        c.info();
    }
}
