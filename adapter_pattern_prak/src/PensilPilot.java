// Nama Program: Adapter Pattern
// Nama/NRP: 2072025/Sherly Santiadi


public class PensilPilot implements Pensil{
    @Override
    public void tulis() {
        System.out.println("Menulis pakai pensil...");
    }

    @Override
    public void hapus() {
        System.out.println("Hapus pakai pensil...");
    }
}
