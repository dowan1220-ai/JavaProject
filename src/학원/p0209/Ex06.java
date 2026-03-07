package 학원.p0209;

class Ca {
    static int count = 0;

    public void add(int a) {
        count += a;
    }

    public static void disp() {
        System.out.println(count);
    }
}

public class Ex06 {
    static void main(String[] args) {
        Ca rd1 = new Ca();
        Ca rd2 = new Ca();
        Ca rd3 = new Ca();
        rd1.add(200);
        Ca.disp();
        rd2.add(300);
        Ca.disp();
        rd3.add(500);
        Ca.disp();
    }
}
