public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        System.out.println("boss health:" + boss.getHealth() + " |" + "boss damage:" + boss.getDamage() + "boss weapon type:" + WeaponType.FIRE_CHOOT);
    }
}
