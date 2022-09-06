package com.company;

public class GameEntity {
    private int hp;
    private int damage;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String info(){
        return (getHp() + " " + getDamage());
    }
}
