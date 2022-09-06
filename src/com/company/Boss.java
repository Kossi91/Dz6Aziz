package com.company;

public class Boss extends GameEntity {
     private Weapon weapon= new Weapon("Mech", "Katana");

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String ptintInfo(){
      return super.info() + " " + getWeapon().getTip() + " " +  getWeapon().getName();

    }
}








