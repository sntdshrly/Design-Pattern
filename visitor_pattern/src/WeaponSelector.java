// Nama Program: Visitor Pattern
// Nama/NRP: 2072025/Sherly Santiadi

import java.util.List;

public interface WeaponSelector {
    void setWeapon(Wizard wizard);

    void setWeapon(Warrior warrior);

    void setWeapon(Orc orc);

    void setWeapon(List<Weaponizable> characters);
}