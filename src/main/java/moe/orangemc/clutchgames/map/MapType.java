package moe.orangemc.clutchgames.map;

public enum MapType {
    BRIDGE("b"),
    NPC_KNOCKBACK("nk"),
    KNOCKBACK("k");

    private String alias;

    MapType(String alias) {
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }
}
