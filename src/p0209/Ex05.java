package p0209;

class acount {
    int count = 0;
    public void add(){
        count++;

    }
    public void sub() {
        count--;

    }
    public void disp() {
        System.out.println(count);
    }
}

public class Ex05 {
    static void main(String[] args) {
        acount p1 = new acount();
        p1.add();
        p1.disp();
        p1.add();
        p1.disp();
        p1.sub();
        p1.disp();
    }
}