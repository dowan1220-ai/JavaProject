package 학원.p0213;

class Dog1{
    String name;
    int age;
    public Dog1(String name, int age) {
        this.name = name;
        this.age = age;

    }
    void disp() {
        System.out.println(name + " : " + age);
    }
}


public class Ex04 {
    static void main(String[] args) {
        Dog1[] dogs = new Dog1[3];//배열객체

        Dog1 d1 = new Dog1("땡칠이", 5);
        Dog1 d2 = new Dog1("발발이", 3);
        Dog1 d3 = new Dog1("영구", 7);
        dogs[0] = d1;
        dogs[1] = d2;
        dogs[2] = d3;

        for (int i = 0; i < dogs.length; i++) {
            dogs[i].disp();
        }

    }
}
