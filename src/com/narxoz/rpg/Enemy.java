public abstract class Enemy {
    protected String name;
    protected int health;
    protected int damage;
    protected int defense;
    protected int speed;
    protected String element;
    protected String abilities;
    protected String loot;
    protected String ai;

    public abstract Enemy clone();

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Damage: " + damage);
        System.out.println("Defense: " + defense);
        System.out.println("Speed: " + speed);
        System.out.println("Element: " + element);
        System.out.println("Abilities: " + abilities);
        System.out.println("Loot: " + loot);
        System.out.println("AI: " + ai);
    }
}