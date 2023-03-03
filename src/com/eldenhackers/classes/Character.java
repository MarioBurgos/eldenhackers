package com.eldenhackers.classes;

import com.eldenhackers.interfaces.Attacker;

import java.util.UUID;

public abstract class Character implements Attacker {
    private String id;
    private String name;
    private Integer hp;
    private boolean isAlive;

    public Character() {
        id = UUID.randomUUID().toString();
        isAlive = true;
    }

    public Character(String name) {
        id = UUID.randomUUID().toString();
        isAlive = true;
        this.name = name;
    }

    public abstract Character attack(Character character);
    public abstract String getStats();
    public abstract String getCharacterType();

    public void checkAlive(){
        isAlive = hp <= 0 ? false : true;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return hp < 0 ? 0 : hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
