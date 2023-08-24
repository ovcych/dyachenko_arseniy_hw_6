public class Boss extends GameEntity {
    public Weapon weapon;
    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo() {
        return "Boss Info:\n" +
                "Health: " + getHealth() + "\n" +
                "Damage: " + getDamage() + "\n" +
                "Weapon: " + (weapon != null ? weapon.getName() : "None");
    }
}
