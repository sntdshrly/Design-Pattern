// Nama Program: Adapter Pattern
// Nama/NRP: 2072025/Sherly Santiadi

public class Main {
    public static void main(String[] args){
        // bikin objek yg dilihat client yaitu pensil
        Pensil pensil = new PensilPilot();
        // bikin objek yg !dilihat client
        Penghapus penghapus = new PenghapusKaret();
        // bikin objek adapter
        Pensil penghapusKaretAdapter = new PenghapusKaretAdapter((PenghapusKaret) penghapus);

        System.out.println("Penghapus:");
        penghapus.hapus();;
        penghapus.smudge();
        System.out.println();

        System.out.println("Pensil:");
        testPensil(pensil);
        System.out.println();

        System.out.println("Di sini biarpun client pake objectnya pensil, tapi dia bisa hapus & smudge pake object penghapus");
        System.out.println("Adapter:");
        testPensil(penghapusKaretAdapter);
    }
    static void testPensil(Pensil pensil){
        pensil.tulis();
        pensil.hapus();
    }
}
