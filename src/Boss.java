public class Boss extends GameEntity {
    private WeaponType weapon;
    public WeaponType getWeapon() {
        return weapon;
    }
    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }
    public static String info() {
        System.out.println("byaj");
        return null;
    }
}