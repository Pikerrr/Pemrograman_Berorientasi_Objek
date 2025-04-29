package character;

public class Character {
    public String name;
    public int hp;
    public int attack;
    public int defense;

    public Character(String name, int hp, int attack, int defense) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    public void attack(Character target) {
        int damage = this.attack - target.defense;
        if (damage < 0) damage = 0;
        target.hp -= damage;1
        System.out.println(this.name + " menyerang " + target.name + "! Damage: " + damage);
    }

    public void defend() {
        System.out.println(this.name + " bertahan! Defense meningkat sementara.");
        this.defense += 5;
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    public int getHp() {
        return this.hp;
    }

    public void heal(int amount) {
        this.hp += amount;
        System.out.println(this.name + " meminum ramuan! HP bertambah " + amount);
    }
}