package chap2.item1.ex1;

public class Enemy {
    private int health;
    private int damage;
    private int speed;
    private String name;
    private Boolean armor;
    private Boolean sword;
    private Boolean shield = Boolean.FALSE;
    private Boolean magic = Boolean.FALSE;

    public Enemy(int health, int damage, int speed, String name, Boolean armor, Boolean sword, Boolean shield, Boolean magic) {
        this.health = health;
        this.damage = damage;
        this.speed = speed;
        this.name = name;
        this.armor = armor;
        this.sword = sword;
        this.shield = shield;
        this.magic = magic;
    }

    public static Enemy createEnemyWithArmor() {
        return new Enemy(1000, 10, 1, "Khang", true, false, false, false);
    }

    public static Enemy createEnemyWithNothing() {
        return new Enemy(1000, 10, 1, "Culi", false, false, false, false);
    }
}
