public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(400);
        boss.setDamage(50);
        boss.setWeapon(WeaponType.LASER);

        System.out.println(boss.info());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(100);
        skeleton1.setDamage(20);
        skeleton1.setWeapon(WeaponType.FIREARMS);
        skeleton1.setArrows(10);

        System.out.println(skeleton1.info());

        Skeleton skeleton2 = new Skeleton();
        skeleton1.setHealth(120);
        skeleton1.setDamage(15);
        skeleton1.setWeapon(WeaponType.FIREARMS);
        skeleton1.setArrows(15);

        System.out.println(skeleton2.info());
    }
}