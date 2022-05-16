package UKLperpus;

public class proses {
    public static void main(String[] args) {
        Siswa runS = new Siswa();
        Buku runB = new Buku();
        Peminjaman runP = new Peminjaman();

        runP.prosesPeminjaman(runS, runB);

    }
}
