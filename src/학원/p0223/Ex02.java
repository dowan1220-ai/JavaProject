package 학원.p0223;

import java.util.List;

public class Ex02 {
    static void main(String[] args) {
        List<Integer> li = List.of(1, 2, 3, 4, 5);
        System.out.println(li);
        for (int i = 0; i < li.size(); i++) {
            System.out.print(li.get(i) + " ");
        }
        System.out.println();
        for (int i:li) {
            System.out.print(i + " ");
        }
    }
}
