// Nama Program: Flyweight Pattern
// Nama/NRP: 2072025/Sherly Santiadi

public class Main {
    private static final String warnaList[] = {"Merah", "Hijau", "Biru", "Putih", "Hitam"};
    public static void main(String[] args) {
        // nantinya bakal ada 20 objek lingkaran; bentuknya semua sama yaitu lingkaran dg radius 100
        // cuman berubah di warna, koordinat x,y.
        for(int i=0; i < 20; ++i) {
            Lingkaran lingkaran = (Lingkaran)BangunDatarFactory.getLingkaran(getWarnaRandom());
            lingkaran.setX(getRandomX());
            lingkaran.setY(getRandomY());
            lingkaran.setRadius(100);
            lingkaran.gambar();
        }
    }
    private static String getWarnaRandom() {
        return warnaList[(int)(Math.random()*warnaList.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100);
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
