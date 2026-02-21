public class IceParts implements PartsFactory {
    @Override
    public String createAbilities() {
        return "Ice Blast, Frost Armor";
    }

    @Override
    public String createLoot() {
        return "Ice Crystal, Frozen Core";
    }

    @Override
    public String createAI() {
        return "Cautious, waits for opportunity";
    }
}