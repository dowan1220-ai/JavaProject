package 학원.p0223;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01 {
    static void main(String[] args) {
        //
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(5);

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);//고정 크기
        //List2.add(7) 사용불가

        List<String> list3 = List.of("A", "B", "C");//자바 버젼 9부터 사용가능

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list4.add(6);

        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);

    }
}
