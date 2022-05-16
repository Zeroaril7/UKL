package UKLlaundry;

public class TransaksiLaundry {
    public static void main(String[] args) {

        Transaksi runT = new Transaksi();
        Client runC = new Client();
        Petugas runP = new Petugas();
        JenisLaundry runL = new JenisLaundry();

        runT.prosesTransaksi(runC,runL,runT);
        runT.hasilTransaksi(runC,runL);

    }
}
