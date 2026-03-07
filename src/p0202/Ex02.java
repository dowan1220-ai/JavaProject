package p0202;

// Fishbread1 클래스 정의 (붕어빵 설계도)
class Fishbread1 {
    String filling;

    Fishbread1(String filling) {
        this.filling = filling;
    }

    void info() {
        System.out.println(filling + "붕어빵");
    }
}

public class Ex02 {
    static void main(String[] args) {
        Fishbread1 f1 = new Fishbread1("팥");//Fishbread1: 틀 f1: 변수(객체) Fishbread1("팥"):생성자 호출
        Fishbread1 f2 = new Fishbread1("초코");
        Fishbread1 f3 = new Fishbread1("슈크림");
        f1.info();
        f2.info();
        f3.info();
    }

}
