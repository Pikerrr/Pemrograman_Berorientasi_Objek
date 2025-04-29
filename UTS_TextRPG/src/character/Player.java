package character;

public class Player extends Character {
    public Player(String name, int hp, int attack, int defense) {
        super(name, hp, attack, defense);
    }

    public void attack(Character target, boolean isPowerAttack) {
        int bonus = isPowerAttack ? 10 : 0;
        int damage = (this.attack + bonus) - target.defense;
        if (damage < 0) damage = 0;
        target.hp -= damage;
        System.out.println(this.name + " melakukan serangan " + (isPowerAttack ? "kuat" : "biasa") + " ke " + target.name + "! Damage: " + damage);
    }

    @Override
    public void defend() {
        System.out.println(this.name + " bertahan dengan perisai! Defense meningkat lebih besar.");
        this.defense += 10;
    }
}