public class Goblin extends Enemy {
    public Goblin() {}

    @Override
    public Enemy clone() {
        Goblin clone = new Goblin();
        clone.name = this.name;
        clone.health = this.health;
        clone.damage = this.damage;
        clone.defense = this.defense;
        clone.speed = this.speed;
        clone.element = this.element;
        clone.abilities = this.abilities;
        clone.loot = this.loot;
        clone.ai = this.ai;
        return clone;
    }
}