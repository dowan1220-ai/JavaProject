package p0112;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        int kor, eng, mat, tot;
        float avg;

        Scanner sc = new Scanner(System.in);

        System.out.println("국어=");
        kor = Integer.parseInt(sc.nextLine());
        System.out.println("영어=");
        eng = Integer.parseInt(sc.nextLine());
        System.out.println("수학=");
        mat = Integer.parseInt(sc.nextLine());

        tot = kor + eng + mat;
        avg = tot / 3.0f;

        System.out.println("총점 :" + tot);
        System.out.println("평균 :" + avg);

        char grade;
        if (avg >= 90) {
            grade = 'A';

        } else if (avg >= 80) {
            grade = 'B';

        } else if (avg >= 70) {
            grade = 'C';

        } else if (avg >= 60) {
            grade = 'D';

        } else {
            grade = 'F';
        }
        System.out.println("학점=" + grade);
    }
}

