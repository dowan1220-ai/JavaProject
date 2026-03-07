package 학원.p0223;

import java.util.Iterator;
import java.util.Set;

public class Ex04 {
    public static void main(String[] args) {
        Set<Integer> num = Set.of(1, 2, 3, 4, 5);

        for (int i :num) {
            System.out.print(i + " ");
        }
        System.out.println();
        Iterator<Integer> it = num.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
