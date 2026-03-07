package p0209;


public class Ex03 {
    private int x;
    private int y;

    public Ex03() {
        x = 0;
        y = 0;
    }

    public Ex03(int a, int b) {
        x = a;
        y = b;
    }

    public void disp() {
        System.out.println("x = " + x + ", y = " + y);
    }

    static void main(String[] args) {
        Ex03 rd = new Ex03();
        rd.disp();
        Ex03 rd1 = new Ex03(20, 30);
        rd1.disp();
    }
}
