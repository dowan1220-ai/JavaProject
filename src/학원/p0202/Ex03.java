package 학원.p0202;

import java.util.Scanner;

class Sj {
    String name;
    int kor, eng, math, tot;
    float avg;
    char grade;
    Scanner sc = new Scanner(System.in);

    Sj() {
        System.out.print("이름: ");
        name = sc.nextLine();

        System.out.print("국어: ");
        kor = Integer.parseInt(sc.nextLine());

        System.out.print("영어: ");
        eng = Integer.parseInt(sc.nextLine());

        System.out.print("수학: ");
        math = Integer.parseInt(sc.nextLine());

        tot = kor + eng + math;
        avg = tot / 3.0f;

        if (avg >= 90) {
            grade = 'A';
        } else if (avg >= 80) {
            grade = 'B';
        } else if (avg >= 70) {
            grade = 'C';
        } else if (avg >= 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }
    }

    void disp() {
        System.out.println(name + " " + kor + " " + eng + " " + math + " " + tot + " " + avg + " " + grade);
    }
}

public class Ex03 {
    public static void main(String[] args) {
        Sj s1 = new Sj();
        s1.disp();

        Sj s2 = new Sj();
        s2.disp();
    }
}
