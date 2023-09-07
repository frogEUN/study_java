package first;

import java.util.Random;
import java.util.Scanner;

public class First {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Kiriko player = new Kiriko();
        player.setHp(player.fullHp);

        System.out.print("당신의 이름을 입력하세요. : ");
        String name = sc.nextLine();

        main : while(true){
            System.out.println("1) 공격  2) 치유  3) 기술1  4) 기술2  (종료 : 0)");
            System.out.printf("[%s] 체력 : %d / %d\n", name, player.getHp(), player.fullHp);
            String choice = sc.nextLine();
            switch(choice){
                case "1" :
                    player.Attack();
                    break;
                case "2" :
                    player.Heal();
                    break;
                case "3" :
                    player.SkillE();
                    break;
                case "4" :
                    player.SkillShift();
                    break;
                case "0" : break main;
                default : System.out.println("올바른 값을 입력하십시오.");
            }  // end of switch
            player.BeAttacked();
        }  // end of while
    }  // end of main
}

class Kiriko{
    private int hp;
    public int fullHp = 200;

    public void setHp(int hp){
        this.hp = hp;
        if(this.hp <= 0) this.hp = 0;
        else if(this.hp >= fullHp) this.hp = fullHp;
    }

    public int getHp(){
        return hp;
    }

    public void BeAttacked(){
        Random rd = new Random();
        setHp(getHp() - rd.nextInt(11) * 10);
    }

    public void Attack(){
        System.out.println("쿠나이 - 쿠나이를 날립니다.");
    }

    public void Heal(){
        System.out.println("치유의 부적 - 치유의 힘이 깃든 부적을 날립니다.");
        setHp(getHp() + 50);
    }

    public void SkillE(){
        System.out.println("정화의 방울 - 수호의 힘이 깃든 방울을 던져 해로운 효과를 정화합니다.");
    }

    public void SkillShift(){
        System.out.println("순보 - 아군에게 즉시 순간이동합니다.");
    }

}