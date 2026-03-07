package 학원.p0119;


public class Ex05 {
    static void calculateScore(int korean, int math, int english) {
        int total = korean + math + english;
        float average = (korean + math + english) / 3.0f;
        String grade;
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else {
            grade = "D";
        }
        System.out.println("총점:" + total);
        System.out.println("평균:" + average);
        System.out.println("등급" + grade);

    }
}
