package 학원.p0213;

class Test {
    int y = 2;
    static int w = 4;


}

public class Ex01 {

    private int x = 1;
    private static int z = 3;


    static void main(String[] args) {
        Ex01 r1 = new Ex01();
        System.out.println(r1.x);
        Test r2 = new Test();
        System.out.println(r2.y);
        System.out.println(z);
        System.out.println(Test.w);
    }
}
