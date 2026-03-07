package 학원.p0119;

public class Ex06 {
    static float calc1(int kor, int eng, int math) {
        return (kor + eng + math) / 3.0f;


    }

    static String calc2(float avg) {
        String grade = null;
        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else {
            grade = "D";
        }

        return grade;
    }

    public static void main(String[] args) {
        float avg = calc1(77, 88, 99);
        System.out.println("평균:" + avg);
        String grade = calc2(avg);
        System.out.println("등급:" + grade);
        int age = Integer.parseInt("11");
    }


}
