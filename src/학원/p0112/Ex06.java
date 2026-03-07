package 학원.p0112;

public class Ex06 {

    public static void main(String[] args) {
        int[] kor = new int[5];

        kor[0] = 92;
        kor[1] = 88;
        kor[2] = 95;
        kor[3] = 90;
        kor[4] = 85;

        int sum = 0;
        int max = kor[0];
        int min = kor[0];

        for (int i = 0; i < kor.length; i++) {
            System.out.println(kor[i]);
            sum += kor[i];
            if (kor[i] > max) {
                max = kor[i];
            }
            if (kor[i] < min) {
                min = kor[i];
            }
        }

        System.out.println("총합:" + sum);
        System.out.println("최고점 :" + max);
        System.out.println("최저점 :" + min);
    }

}
