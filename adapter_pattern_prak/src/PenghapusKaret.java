// Nama Program: Adapter Pattern
// Nama/NRP: 2072025/Sherly Santiadi


public class PenghapusKaret implements Penghapus{
    @Override
    public void smudge() {
        System.out.println("Smudge pakai penghapus...");
    }

    @Override
    public void hapus() {
        System.out.println("Hapus pakai penghapus...");
    }
}
