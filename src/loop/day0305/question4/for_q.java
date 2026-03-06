package loop.day0305.question4;

public class for_q {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                sum++;
                sum = i * j;
                System.out.println(i + " * " + j + " = " + sum);
            }
        }
    }
}
