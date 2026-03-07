package 학원.p0223;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {
    public void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);
        set.add(20);
        Set<String> set2 = Set.of("a", "a", "b", "c");
        Set<String> set3 = new HashSet<>(Set.of("A", "B", "C"));
        System.out.println(set);
        System.out.println(set2);
        System.out.println(set3);
    }
}
