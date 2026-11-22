package tidypanels.submarkets;

public enum ButtonLayout {

    TILES("Tiles"),
    STRETCHED("Stretched"),
    FIVE_PER_ROW("Five per row");

    // defaultValue in data/config/LunaSettings.csv
    public static final ButtonLayout DEFAULT = FIVE_PER_ROW;
    // 1.0.a name of TILES, still in old LunaLib saves
    public static final String OLD_TILES_LABEL = "Unfold on hover";

    // radio option text in data/config/LunaSettings.csv, also what LunaLib saves
    public final String label;

    ButtonLayout(String label) {
        this.label = label;
    }

    public static ButtonLayout byLabel(String label) {
        if (OLD_TILES_LABEL.equals(label)) return TILES;
        for (ButtonLayout layout : values()) {
            if (layout.label.equals(label)) return layout;
        }
        return DEFAULT;
    }
}
