package enemy;

import character.Character;

public class Enemy extends Character {
    public Enemy(String name, int hp, int attack, int defense) {
        super(name, hp, attack, defense);
    }

    @Override
    public void attack(Character target) {
        int damage = this.attack - target.defense;
        if (damage < 0) damage = 0;
        target.hp -= damage;
        System.out.println(this.name + " menyerang balik! Damage: " + damage);
    }
}