// Nama Program: Visitor Pattern
// Nama/NRP: 2072025/Sherly Santiadi

public class Orc extends Character {

    public Orc() {
    }

    @Override
    public void weaponize(WeaponSelector character) {
        character.setWeapon(this);
    }
}