public interface EnemyMaker {
    EnemyMaker setName(String name);
    EnemyMaker setHealth(int health);
    EnemyMaker setDamage(int damage);
    EnemyMaker setDefense(int defense);
    EnemyMaker setSpeed(int speed);
    EnemyMaker setElement(String element);
    EnemyMaker setAbilities(String abilities);
    EnemyMaker setLoot(String loot);
    EnemyMaker setAI(String ai);
    Enemy build();
}