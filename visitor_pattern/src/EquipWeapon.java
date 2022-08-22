// Nama Program: Visitor Pattern
// Nama/NRP: 2072025/Sherly Santiadi

import java.util.List;

public class EquipWeapon implements WeaponSelector {

    @Override
    public void setWeapon(Wizard wizard) {
        wizard.setWeapon("Tongkat sihir");
    }

    @Override
    public void setWeapon(Warrior warrior) {
        warrior.setWeapon("Pedang");
    }

    @Override
    public void setWeapon(Orc orc) {
        orc.setWeapon("Tongkat palu");
    }

    @Override
    public void setWeapon(List<Weaponizable> characters) {
        for (Weaponizable p : characters) {
            p.weaponize(this);
        }
    }
}