package com.eldenhackers.classes;

import com.eldenhackers.utilities.AnsiColors;
import com.eldenhackers.utilities.CustomRandomGenerator;
import com.eldenhackers.utilities.Emoji;

public class Wizard extends Character {

    private Integer mana;
    private Integer intelligence;

    public Wizard() {
        setRandomStats();
    }

    public Wizard(String name) {
        super(name);
        setRandomStats();
    }

    /**
     * Wizard attack power is based on intelligence.  They use mana as their attack energy source.
     * If their mana is greater or equal to 5, they cast a fireball, and they loose -5 mana points.
     * If their mana is lower than 5 but greater than 0, they perform a staff hit (weak attack), and they recover +1 mana points.
     * If their mana is 0, they don't perform any attack, and they recover +2 mana points.
     *
     * @param character
     * @return the character they attack, with modified hp if required.
     */
    @Override
    public Character attack(Character character) {
        Character attackedCharacter = character;
        if (mana >= 5) {
            attackedCharacter.setHp(character.getHp() - intelligence);
            mana -= 5;
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t"+AnsiColors.BLUE + getName() + AnsiColors.RESET + " casted a fireball and lost -5 stamina. " + Emoji.FIREBALL);
        } else if (mana > 0) {
            attackedCharacter.setHp(character.getHp() - intelligence / 2);
            mana++;
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t"+AnsiColors.BLUE + getName() + AnsiColors.RESET + " hit with the staff and recovered +1 stamina. " + Emoji.STAFF);
        } else {
            mana += 2;
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t"+AnsiColors.BLUE + getName() + AnsiColors.RESET + " is preparing the next attack and recovered +2 stamina. " + Emoji.WIZARD_CONCENTRATION);
        }
        return attackedCharacter;
    }

    @Override
    public String getCharacterType() {
        return AnsiColors.RESET + AnsiColors.BLUE + "WIZARD" + AnsiColors.RESET;
    }

    private void setRandomStats() {
        super.setHp(CustomRandomGenerator.getRangedInt(50, 100));
        mana = CustomRandomGenerator.getRangedInt(10, 50);
        intelligence = CustomRandomGenerator.getRangedInt(1, 50);
    }

    @Override
    public String getStats() {
        String stats = AnsiColors.RESET + AnsiColors.BLUE + getName() + AnsiColors.RESET + " || Mana: " + AnsiColors.BLUE + getMana() + AnsiColors.RESET + " || Intelligence: " + AnsiColors.BLUE + getIntelligence() + AnsiColors.RESET + " || Hp: " + AnsiColors.BLUE + getHp() + AnsiColors.RESET;
        if (!isAlive()) {
            stats += " " + Emoji.SKULL;
        }
        return stats;
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }
}
