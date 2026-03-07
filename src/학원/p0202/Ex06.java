package 학원.p0202;

import java.util.Scanner;

class Character1 {
    String name;
    int hp;
    int life = 1;
    Scanner sc = new Scanner(System.in);

    Character1() {
        System.out.println("이름 : ");
        name = sc.nextLine();
        System.out.println("체력 : ");
        hp = Integer.parseInt(sc.nextLine());

    }

    void attack(int attack) {
        hp -= attack;
        System.out.println(attack + "정도 공격받았다!");
        if (hp <= 0) {
            System.out.println("은(는) 공격을 받아 사망하였다.. RIP");
            life = 0;
        }
    }

    void heal(int heal) {
        if (life == 0) {
            System.out.println("죽은자는 회복 할수 없습니다.\n네크로맨서라도 하시려고요?");
        } else if (hp >= 0) {
            hp = hp + heal;
            System.out.println(name + " 은(는) 체력을 " + heal + " 정도 회복했다!");
        } else {
            System.out.println(name + " 은(는) 체력을 회복할 수 없다!");
        }


    }

    void status() {
        System.out.println(name + "의 현재 남은 체력은 :" + hp);
        if (life == 0) {
            System.out.println("차가운 시신입니다..");
        }
    }
}

public class Ex06 {

    public static void main(String[] args) {
        Character1 c1 = new Character1();
        c1.attack(100);
        c1.status();
        c1.heal(50);
        c1.status();
    }
}