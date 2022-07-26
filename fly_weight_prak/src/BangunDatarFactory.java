// Nama Program: Flyweight Pattern
// Nama/NRP: 2072025/Sherly Santiadi

import java.util.HashMap;

public class BangunDatarFactory {
    private static final HashMap lingkaranMap = new HashMap();

    public static BangunDatar getLingkaran(String warna) {
        Lingkaran lingkaran = (Lingkaran)lingkaranMap.get(warna);

        if(lingkaran == null) {
            lingkaran = new Lingkaran(warna);
            lingkaranMap.put(warna, lingkaran);

            System.out.println();
            System.out.println("Program sedang membuat lingkaran");
        }
        return lingkaran;
    }

}
