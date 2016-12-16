package fpij.chapter4;

/**
 * Created by rafal.wawryk on 24/02/16.
 */
public class Asset {

    public enum AssetType { BOND, STOCK;};

    private final AssetType type;
    private final int value;

    public Asset(AssetType type, int value) {
        this.type = type;
        this.value = value;
    }

    public AssetType getType() {
        return type;
    }

    public int getValue() {
        return value;
    }
}
