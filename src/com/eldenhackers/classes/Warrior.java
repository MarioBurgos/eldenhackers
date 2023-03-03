package com.eldenhackers.classes;

import com.eldenhackers.utilities.AnsiColors;
import com.eldenhackers.utilities.Emoji;

import java.util.random.RandomGenerator;

public class Warrior extends Character {
    private Integer stamina;
    private Integer strength;

    public Warrior() {
        setRandomStats();
    }

    public Warrior(String name) {
        super(name);
        setRandomStats();
    }

    /**
     * Warriors attack power is based on strength.  They use stamina as their attack energy source.
     * If their stamina is greater or equal to 5, they perform a heavy attack, and they loose -5 stamina points.
     * If their stamina is lower than 5 but greater than 0, they perform a weak attack, and they recover +1 stamina points.
     * If their stamina is 0, they don't perform any attack, and they recover +2 stamina points.
     *
     * @param character
     * @return the character they attack, with modified hp if required.
     */
    @Override
    public Character attack(Character character) {
        Character attackedCharacter = character;
        if (stamina >= 5) {
            attackedCharacter.setHp(character.getHp() - strength);
            System.out.println(getName() + " performed a heavy attack and lost -5 stamina. " + Emoji.DAGGER);
        } else if (stamina > 0) {
            attackedCharacter.setHp(character.getHp() - strength / 2);
            System.out.println(getName() + " performed a weak attack and recovered +1 stamina. " + Emoji.PUNCH);
        } else {
            stamina += 2;
            System.out.println(getName() + " is preparing the next attack and recovered +2 stamina. " + Emoji.WARRIOR_CONCENTRATION);
        }
        return attackedCharacter;
    }
    @Override
    public String getStats(){
        String stats = AnsiColors.PURPLE + getName() + " (Warrior) || Stamina: " + getStamina() + " || Strength: " + getStrength() + " || Hp: " + getHp() + AnsiColors.RESET;
        if (!isAlive()) {
            stats += " " + Emoji.SKULL;
        }
        return stats;
    }

    @Override
    public String getCharacterType(){
        return AnsiColors.PURPLE + "WARRIOR" + AnsiColors.RESET;
    }

    private void setRandomStats() {
        super.setHp(RandomGenerator.getDefault().nextInt(100, 200));
        stamina = RandomGenerator.getDefault().nextInt(10, 50);
        strength = RandomGenerator.getDefault().nextInt(1, 10);
    }

    public Integer getStamina() {
        return stamina;
    }

    public void setStamina(Integer stamina) {
        this.stamina = stamina;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

}
