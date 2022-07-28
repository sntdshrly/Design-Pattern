// Nama Program: Adapter Pattern
// Nama/NRP: 2072025/Sherly Santiadi


// client liatnya pensil padahal nanti pake adapter ditranslate ke penghapus --> Client - Pensil - Adapter - Penghapus
public class PenghapusKaretAdapter implements Pensil{
    // Bikin variabel penghapuskaret
    // nanti adapter inherit dari pensil (yg dilihat client)
    // kemudian dikomposisikan ke penghapus (adaptee kita)

    PenghapusKaret penghapusKaret;
    public PenghapusKaretAdapter(PenghapusKaret penghapusKaret) {
        this.penghapusKaret = penghapusKaret;
    }

    // pensil cuman punya 2 method buat tulis(), sama hapus()
    @Override
    public void tulis() {
        penghapusKaret.smudge();
    }

    @Override
    public void hapus() {
        for (int i=0; i<5; i++){
            penghapusKaret.hapus();}
    }
}
