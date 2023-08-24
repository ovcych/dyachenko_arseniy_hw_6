public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Death of The Universe Sword");
        boss.setWeapon(bossWeapon);
        System.out.println(boss.printInfo());
        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(100);
        skeleton1.setDamage(10);
        skeleton1.setArrowCount(20);
        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(120);
        skeleton2.setDamage(12);
        skeleton2.setArrowCount(15);
        System.out.println("\nSkeleton 1 Info:\n" + skeleton1.printInfo());
        System.out.println("\nSkeleton 2 Info:\n" + skeleton2.printInfo());
    }
}
