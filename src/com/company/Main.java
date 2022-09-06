package com.company;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHp(700);
        boss.setDamage(50);
        boss.setWeapon(new Weapon("Mech", "Katana"));
        System.out.println(boss.getHp() + " " + boss.getDamage() + " " + boss.getWeapon().getName() + "" +
                " " + boss.getWeapon().getTip() );
        System.out.println( boss.ptintInfo());

        Sceleton sceleton1 = new Sceleton();
        sceleton1.setHp(300);
        sceleton1.setDamage(20);
        sceleton1.setNumberOfArrows(15);
        System.out.println(sceleton1.ptintInfo());



        Sceleton sceleton2 =new Sceleton();
        sceleton2.setHp(250);
        sceleton2.setDamage(30);
        sceleton2.setNumberOfArrows(20);
        System.out.println(sceleton2.ptintInfo());
        }
    }

