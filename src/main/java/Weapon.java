public class Weapon {

    private String type;
    private String attack;

    public Weapon(String type, String attack) {
        this.type = type;
        this.attack = attack;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }
}
