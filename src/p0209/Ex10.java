package p0209;

class Sj {
    String name = "홍길동";
    int score = 88;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}


public class Ex10 {
    static void main(String[] args) {
        Sj s = new Sj();
        s.setName("이영희");
        s.setScore(100);
        System.out.println(s.getName() + " : " + s.getScore());
    }
}
