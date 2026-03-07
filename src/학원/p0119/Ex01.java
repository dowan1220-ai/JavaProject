package 학원.p0119;

public class Ex01 {
    static void address() {
        System.out.println("대구 광역시 수성구 달구벌대로 526길 22번지 101동 801호");

    }

    static void address2(String name, String phone) {
        System.out.println("대구 광역시 수성구 달구벌대로 526길 22번지 101동 801호");
        System.out.println(name + "(" + phone + ")");
    }

    public static void main(String[] args) {
        System.out.println(10 + (10 + ""));

        address();
        address2("홍길동", "01021341234");
    }

}
