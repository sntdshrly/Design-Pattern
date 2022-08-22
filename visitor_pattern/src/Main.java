// Nama Program: Visitor Pattern
// Nama/NRP: 2072025/Sherly Santiadi

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Warrior g1 = new Warrior();
        Warrior g2 = new Warrior();
        Wizard w1 = new Wizard();
        Wizard w2 = new Wizard();
        Orc orc1 = new Orc();

        // Buat daftar untuk menyimpan weapon
        List<Weaponizable> characters = new ArrayList<>();

        // Tambahkan objek ke daftar warrior
        characters.add(g1);
        characters.add(g2);
        characters.add(w1);
        characters.add(w2);
        characters.add(orc1);

        WeaponSelector weaponSelector = new EquipWeapon();
        weaponSelector.setWeapon(characters);

        // Print
        System.out.println("Senjata warriror g1: " + g1.getWeapon());
        System.out.println("Senjata warriror g2: " + g2.getWeapon());
        System.out.println("Senjata wizard w1: " + w1.getWeapon());
        System.out.println("Senjata wizard w2: " + w2.getWeapon());
        System.out.println("Senjata Orc orc1: " + orc1.getWeapon());
    }
}