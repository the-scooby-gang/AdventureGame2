import Characters.Enemy;

import java.util.ArrayList;

public class Room {
    private String name;
    private ArrayList <Character> characters;
    Enemy enemy;

    public Room(String name, Enemy enemy) {
        this.name = name;
        this.characters = new ArrayList();
        this.enemy = enemy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCharacter(Character character){
        characters.add(character);
    }

    public int characterCount(){
        return characters.size();
    }

}
