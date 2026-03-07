package 학원.p0209;

class Student{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

class GradePolicy {
    static String grade0f(int score) {
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        if (score >= 70) return "C";
        return "F";
    }
}
public class Ex09 {
    static void main(String[] args) {
        Student s1 = new Student("철수", 92);
        Student s2 = new Student("영희", 78);
        System.out.println(s1.getName()+" : "+ GradePolicy.grade0f(s1.getScore()));
        System.out.println(s2.getName()+" : "+ GradePolicy.grade0f(s2.getScore()));
    }
}
