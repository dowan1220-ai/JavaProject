package 학원.p0307;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

class Animal {
    String name;
    int age;
    String jong;

    public Animal(String name, int age, String jong) {
        this.name = name;
        this.age = age;
        this.jong = jong;
    }

    void disp() {
        System.out.println(name + " : " + age + " : " + jong);
    }
}

public class Ex01 {
    static void main(String[] args) {
        Animal[] animals = new Animal[3];
        ArrayList<Animal> li = new ArrayList();
        Animal a1 = new Animal("떙칠이", 5, "개");
        Animal a2 = new Animal("밍키", 4, "고양이");
        Animal a3 = new Animal("허키", 3, "개");
        li.add(a1);
        li.add(a2);
        li.add(a3);

//        animals[0] = a1;
//        animals[1] = a2;
//        animals[2] = a3;

//        for (int i = 0;i < li.size();i++) {
//            Animal ob = li.get(i);
//            ob.disp();
//        }

        for (Animal i:li) {
            i.disp();
        }

//        }
//        for (Object i:li){
//            ((Animal)i).disp();
//        }//제너릭뜻 검색
//        for (int i = 0; i <animals.length;i++) {
//            animals[i].disp();
//        }
//        for (Animal i:animals) {
//            i.disp();

    }
}

