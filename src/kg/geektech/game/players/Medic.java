package kg.geektech.game.players;

public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, int healPoints, String name) {
        super(health, damage, SuperAbility.HEAL, name);
        this.healPoints = healPoints;

    }

    @Override
    public int applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && this != heroes[i]) {
                heroes[i].setHealth(heroes[i].getHealth() + this.healPoints);
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " heal points: " + this.healPoints;
    }
}
