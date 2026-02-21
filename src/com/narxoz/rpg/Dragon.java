public class Dragon extends Enemy {
    public Dragon() {}

    @Override
    public Enemy clone() {
        Dragon clone = new Dragon();
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