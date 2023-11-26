import jp.ac.uryukyu.ie.e235714.*;

public class Main {
    public static void main(String[] args){
        //Hero hero = new Hero("勇者", 10, 5);
        Enemy enemy = new Enemy("スライム", 50, 3);
        Warrior warrior = new Warrior("戦士", 30, 6);

        // System.out.printf("%s vs. %s\n", hero.getName(), enemy.getName());

        // int turn = 0;
        // while( hero.getDead() == false && enemy.getDead() == false ){
        //     turn++;
        //     System.out.printf("%dターン目開始！\n", turn);
        //     hero.attack(enemy);
        //     enemy.attack(hero);
        // }
        // System.out.println("戦闘終了");

        System.out.printf("%s vs. %s\n", warrior.getName(), enemy.getName());

        int turn = 0;
        while(warrior.isDead() == false && enemy.isDead() == false){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            warrior.attackWithWeaponSkill(enemy);
            enemy.attack(warrior);
        }
        System.out.println("戦闘終了");
    }
}