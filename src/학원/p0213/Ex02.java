package 학원.p0213;

class Test2 {
    void bbb(){
        System.out.println("bbb....");
    }
    static void ddd() {
        System.out.println("ddd....");
    }

}

public class Ex02 {
    private void aaa(){
        System.out.println("aaa....");
    }
    private static void ccc() {
        System.out.println("ccc....");
    }
    public static void main(String[] args) {
        Ex02 r1 = new Ex02();
        r1.aaa();//aaa....
        Test2 r2 = new Test2();
        r2.bbb();//bbb....
        ccc();//ccc....
        Test2.ddd();//ddd....

    }


}
