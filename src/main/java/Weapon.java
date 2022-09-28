public class Weapon {

    private String type;
    private int attack;

    public Weapon(String type, int attack) {
        this.type = type;
        this.attack = attack;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
