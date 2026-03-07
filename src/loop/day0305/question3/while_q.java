package loop.day0305.question3;

import java.util.Scanner;

public class while_q {
    public static void main(String[] args) {
        int max = 100;
        int sum = 0;
        int i = 1;
        while (i <= max) {
            sum += i;
            i++;
    }
        System.out.println(sum);
    }
}
