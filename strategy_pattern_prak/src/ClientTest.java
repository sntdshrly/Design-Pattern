public class ClientTest {
    public static void main(String[] args) {
        Person joni = new Joni();
        joni.performWrite();

        joni.setWriteBehaviour(new WriteLeftHand()); // Tadinya joni pakai tangan kanan sekarang coba pakai tangan kiri
        joni.performWrite();
    }
}
