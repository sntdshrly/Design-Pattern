// Nama Program: Visitor Pattern
// Nama/NRP: 2072025/Sherly Santiadi
public class Warrior extends Character {

    public Warrior() {
    }

    @Override
    public void weaponize(WeaponSelector weaponSelector) {
        weaponSelector.setWeapon(this);
    }

}