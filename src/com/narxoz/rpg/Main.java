public class Main {
    public static void main(String[] args) {
        PartsFactory fireParts = new FireParts();
        String fireAbilities = fireParts.createAbilities();
        String fireLoot = fireParts.createLoot();
        String fireAI = fireParts.createAI();

        EnemyMaker dragonMaker = new DragonMaker();
        Enemy fireDragon = dragonMaker
                .setName("Fire Dragon")
                .setHealth(50000)
                .setDamage(500)
                .setDefense(200)
                .setSpeed(50)
                .setElement("FIRE")
                .setAbilities(fireAbilities)
                .setLoot(fireLoot)
                .setAI(fireAI)
                .build();

        System.out.println("- Fire Dragon (built)");
        fireDragon.display();


        EnemyMaker goblinMaker = new GoblinMaker();
        Enemy baseGoblin = goblinMaker
                .setName("Goblin")
                .setHealth(100)
                .setDamage(15)
                .setDefense(5)
                .setSpeed(30)
                .setElement("NORMAL")
                .setAbilities("Claw, Bite")
                .setLoot("Coins, Leather")
                .setAI("Simple")
                .build();


        Enemy goblinWarrior = baseGoblin.clone();
        goblinWarrior.name = "Goblin Warrior";
        goblinWarrior.health = 150;
        goblinWarrior.damage = 20;

        Enemy goblinShaman = baseGoblin.clone();
        goblinShaman.name = "Goblin Shaman";
        goblinShaman.health = 120;
        goblinShaman.abilities = "Heal, Curse";
        goblinShaman.element = "DARK";

        System.out.println("- Base Goblin");
        baseGoblin.display();
        System.out.println("- Goblin Warrior (cloned)");
        goblinWarrior.display();
        System.out.println("- Goblin Shaman (cloned)");
        goblinShaman.display();


        PartsFactory iceParts = new IceParts();
        Enemy iceDragon = new DragonMaker()
                .setName("Ice Dragon")
                .setHealth(45000)
                .setDamage(450)
                .setDefense(250)
                .setSpeed(40)
                .setElement("ICE")
                .setAbilities(iceParts.createAbilities())
                .setLoot(iceParts.createLoot())
                .setAI(iceParts.createAI())
                .build();

        System.out.println("- Ice Dragon (built)");
        iceDragon.display();
    }
}