// Nama Program: Visitor Pattern
// Nama/NRP: 2072025/Sherly Santiadi

public class Wizard extends Character {

    public Wizard() {
    }

    @Override
    public void weaponize(WeaponSelector weaponSelector) {
        weaponSelector.setWeapon(this);
    }
}