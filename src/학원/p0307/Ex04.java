package 학원.p0307;

public class Ex04 {
    static void main(String[] args) {
        int k = 5;
        int j = 4;
        int result = 0;
        ++k;
        --j;
//        result = k++ + --j;
        result = k++ + j--;
        System.out.println(result);
        System.out.println(k);
        System.out.println(j);
    }
}
