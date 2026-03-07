package p0112;


import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {

            int kor, eng, mat, tot;
            float avg;

            System.out.println("[" + i + "번 학생]");

            System.out.println("국어=");
            kor = sc.nextInt();

            System.out.println("영어=");
            eng = sc.nextInt();

            System.out.println("수학=");
            mat = sc.nextInt();

            tot = kor + eng + mat;
            avg = tot / 3.0f;

            System.out.println("총점 :" + tot);
            System.out.println("평균 :" + avg);
            System.out.println();
        }

    }

}
