package p0213;

class Animal {
    public Animal() {
        System.out.println("동물입니다....");

    }

    void eat() {
        System.out.println("먹는다....");
    }
}

class Dog extends Animal {
//extends: 온전히 상속
    public Dog() {
//        this : 자기자신
//        super : 상속 받은 부모
//        super(); : 해도 되고 안해도 되지만 하면 좋다
        System.out.println("개입니다.....");
    }
    void eat() {
        super.eat();
        System.out.println("개 먹이를 먹습니다.....");
    }
}
class Cat extends Animal{
    public Cat(){
        System.out.println("고양이 입니다....");
    }
    void eat(){
        System.out.println("고양이 먹이를 먹습니다.....");
    }

}

class Bird extends Animal{
    public Bird(){
        System.out.println("새 입니다....");
    }
    void eat(){
        System.out.println("새 모이를 먹습니다.....");
    }

}

public class Ex03 {

    static void main(String[] args) {
//      new Animal();
        Animal an = new Animal();
        an.eat();
        System.out.println("------------------");
        Animal dog1 = new Dog();
        dog1.eat();
        System.out.println("------------------");
        Animal Cat = new Cat();
        Cat.eat();
        System.out.println("------------------");
        Animal bird = new Bird();
        bird.eat();

    }
}
