class FFCharacter {
    //atribut
    String name;
    String role;
    String element;
    int health;
    Skill skill; //instance variabel

    // Constructor 
    public FFCharacter(String name) {
        this.name = name;
        System.out.println("Character " + name );
    }

    public FFCharacter(int health) {
        this.health = health;
        System.out.println("Character health set to " + health);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}

class Skill {
    //atribut
    String power1;
    String power2;
    //konstruktor
    public Skill(String power1, String power2) {
        this.power1 = power1;
        this.power2 = power2;
    }
    //method
    public String getFullSkill() {
        return power1 + ", " + power2;
    }
}
//method main
public class Freefire {
    public static void main(String[] args) {
        Skill skill = new Skill("Sprint", "Art of Blades");

        FFCharacter character = new FFCharacter("Hayato");
        character.setSkill(skill);
        character.setHealth(200);
        character.setRole("Rhuser");
        character.setElement("Shield Damage");

        System.out.println("Character Name: " + character.getName());
        System.out.println("Health: " + character.getHealth());
        System.out.println("Role: " + character.getRole());
        System.out.println("Element: " + character.getElement());
        System.out.println("Skill: " + character.getSkill().getFullSkill());
    }
}
