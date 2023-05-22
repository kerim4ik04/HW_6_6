public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setWeapon(WeaponType.FIRE_CHOOT);
        boss.setDamage(50);
        System.out.println("boss health:" + boss.getHealth() + " |" + "boss damage:" + boss.getDamage() + "boss weapon type:" + boss.getWeapon() );
    }
}
