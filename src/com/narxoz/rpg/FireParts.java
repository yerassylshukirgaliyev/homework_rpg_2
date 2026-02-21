public class FireParts implements PartsFactory {
    @Override
    public String createAbilities() {
        return "Fire Breath, Flame Shield";
    }

    @Override
    public String createLoot() {
        return "Fire Stone, Dragon Heart";
    }

    @Override
    public String createAI() {
        return "Aggressive, attacks frequently";
    }
}