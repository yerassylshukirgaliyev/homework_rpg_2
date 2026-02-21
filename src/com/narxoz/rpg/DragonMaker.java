public class DragonMaker implements EnemyMaker {
    private Dragon enemy = new Dragon();

    @Override
    public EnemyMaker setName(String name) {
        enemy.name = name;
        return this;
    }

    @Override
    public EnemyMaker setHealth(int health) {
        enemy.health = health;
        return this;
    }

    @Override
    public EnemyMaker setDamage(int damage) {
        enemy.damage = damage;
        return this;
    }

    @Override
    public EnemyMaker setDefense(int defense) {
        enemy.defense = defense;
        return this;
    }

    @Override
    public EnemyMaker setSpeed(int speed) {
        enemy.speed = speed;
        return this;
    }

    @Override
    public EnemyMaker setElement(String element) {
        enemy.element = element;
        return this;
    }

    @Override
    public EnemyMaker setAbilities(String abilities) {
        enemy.abilities = abilities;
        return this;
    }

    @Override
    public EnemyMaker setLoot(String loot) {
        enemy.loot = loot;
        return this;
    }

    @Override
    public EnemyMaker setAI(String ai) {
        enemy.ai = ai;
        return this;
    }

    @Override
    public Enemy build() {
        return enemy;
    }
}