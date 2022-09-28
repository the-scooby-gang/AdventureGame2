package CharactersInventory;

public abstract class CharacterInventory {

    private String type;
    private int xpEffect;

    public CharacterInventory(String type, int xpEffect) {
        this.type = type;
        this.xpEffect = xpEffect;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getXpEffect() {
        return xpEffect;
    }

    public void setXpEffect(int xpEffect) {
        this.xpEffect = xpEffect;
    }
}
