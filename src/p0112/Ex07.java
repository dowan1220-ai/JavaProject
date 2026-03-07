package p0112;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] kor = new int[5];

        for (int i = 0; i < kor.length; i++) {
            System.out.println((i + 1) + "번째 함수 입력: ");
            kor[i] = sc.nextInt();

        }
        int min = kor[0];

        for (int i = 0; i < kor.length; i++) {
            System.out.println(kor[i]);

            if (kor[i] < min) {
                min = kor[i];

            }
        }
        System.out.println("최저점: " + min);
    }

}