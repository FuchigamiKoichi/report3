package jp.ac.uryukyu.ie.e235714;

public class LivingThing{
    private String name;
    private double hitPoint;
    private int attack;
    private boolean dead;

    LivingThing(String name, int hitPoint, int attack){
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        dead = false;
    }

    public boolean isDead(){
        return dead;
    }

    public void setDead(boolean state){
        dead = state;
    }

    public String getName(){
        return name;
    }

    public void setHitPoint(double aftersoul){
        hitPoint = aftersoul;
    }

    public double getHitPoint(){
        return hitPoint;
    }

    public int getattack(){
        return attack;
    }

    public void attack(LivingThing opponent){
        if(hitPoint > 0){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(double damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた\n", name);
        }
    }

}
