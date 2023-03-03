## Introduction

This is basic RPG battle simulator that consists of having two characters fighting to determine one winner.

## Instructions

We have two types of characters, __warriors__ and __wizards__, who have different attributes and combat styles.

### Character class

This _abstract_ class has :
- Auto-generated id.
- Name.
- HP random between 100-200 to warriors and 50-100 for wizards, representing the health points.
- isAlive (defaulted to _true_).


### Warrior Class

This class is derived from the Character class.  A Warrior is a Character that fights by attacking.  Attacks inflict damage and in order to do one, stamina is required

The Warrior class has:
- Stamina (random between 10-50), representing a resource the warrior consumes to make an attack.
- Strength (random between 1-10), measuring how strong the warrior attack is.


### Wizard class

This class is also derived from the Character class. A Wizard is a Character that fights by casting spells.  Spells inflict damage and require mana to be cast.

The Wizard class has:
- Mana (random between 10-50), representing a resource the wizard consumes to cast spells.
- Intelligence (random between 1-50), measuring how strong the wizard spells are.


## How the battle simulator works

The characters are created before the battle starts. They can have either the same character type or different character types.

The battle is 1 vs. 1 and will be by rounds, in each round both combatants will attack at the same time (so even if one combatant does the killing blow both will take damage). So the combat could end in a tie. In case of a tie, the battle is restarted to have only one winner.

A complete log of the battle will be displayed on the command line. When the battle is over the winner should be displayed as well.

### Character Attacks

Both wizards and warriors will have the same attack command.

#### Warrior:

Warriors are strong well-armored characters that focus on the attribute of strength. Every round a warrior will have randomly either a Heavy attack or a Weak attack. The damage dealt by a Heavy attack is equal to their strength and every hit will decrease their stamina by 5 points. The damage dealt by a Weak attack is half of the strength (truncate decimals). Every Weak attack will recover his stamina by 1.

If a warrior does not have the stamina to make a Heavy attack he will do a Weak attack instead.

If a warrior does not have the stamina to do a Weak attack he will not inflict any damage and recover his stamina by 2.


#### Wizard:

Wizards are the masters of the arcane their main attribute is intelligence. Every round a wizard will try to randomly cast either a Fireball or a Staff hit. The damage dealt by a Fireball is equal to his intelligence and every Fireball will decrease their mana by 5 points. The damage dealt by a staff hit is equal to 2. Every staff hit will recover his mana by 1.

If a wizard does not have the mana to cast a Fireball he will do a Staff hit instead.

If a wizard does not have the mana to cast a Staff hit he will not inflict any damage and recover his mana by 2.

## Requirements

For this project you must accomplish all of the following:

- Navigate through a text-based menu using Standard Input and Output.
- Create warriors and wizards individually customizing their stats and name.
- Have a battle between the characters and determines the winner.
- Keep a detailed log (on the standard output) of every action taken during the duels.

## Bonus

- Import characters using a CSV file.
- Simulate the whole battle with one command by creating random characters with random stats and making them duel.

