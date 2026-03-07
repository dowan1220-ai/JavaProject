package 학원.p0202;

import java.util.Scanner;

class Character {
    String name;
    int hp;
    Scanner sc = new Scanner(System.in);

    Character() {
        System.out.println("이름 : ");
        name = sc.nextLine();
        System.out.println("체력 : ");
        hp = Integer.parseInt(sc.nextLine());

    }

    void attack(int attack) {
        hp -= attack;
        System.out.println(attack + "정도 공격받았다!");
    }

    void heal(int heal) {
        if (hp > 0) {
            hp = hp + heal;
            System.out.println(name + " 은(는) 체력을 " + heal + " 정도 회복했다!");
        } else {
            System.out.println(name + " 은(는) 체력을 회복할 수 없다!");
        }


    }

    void status() {
        System.out.println(name + "의 현재 남은 체력은 :" + hp);
    }
}

public class Ex05 {

    public static void main(String[] args) {
        Character c1 = new Character();
        c1.attack(100);
        c1.status();
        c1.heal(50);
        c1.status();
    }
}

