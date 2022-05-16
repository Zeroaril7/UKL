package UKLlelang;

public class TransaksiLelang {
    public static void main(String[] args) {

        Lelang runL = new Lelang();
        Masyarakat runM = new Masyarakat();
        Barang runB = new Barang();
        runL.prosesLelang(runM, runB);
        runL.hasil(runM,runB);

    }
}
