package UKLlaundry;

import java.util.ArrayList;

public class Petugas implements User{
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();
    private ArrayList<String> namaJabatan = new ArrayList<String>();


    public Petugas() {
        this.namaPetugas.add("Mimin");
        this.alamat.add("Srono");
        this.telepon.add("087711113333");
        this.jabatan.add(0);

        this.namaJabatan.add("Karyawan Magang");
        this.namaJabatan.add("Karyawan Tetap");
        this.namaJabatan.add("Manager");
    }

    public  void outPetugas (int idPetugas){
        System.out.println("Petugas : " +getNama(idPetugas) + "\nAlamat : "+getAlamat(idPetugas)+"\nNomor Telepon : "+getTelepon(idPetugas) + "\nJabatan : " + getNamaJabatan(getJabatan(idPetugas)));
    }

    public int getJabatan (int idJabatan){
        return this.jabatan.get(idJabatan);
    }

    public String getNamaJabatan (int idJabatan){
        return this.namaJabatan.get(idJabatan);
    }

    @Override
    public String getNama(int idPetugas) {
        return this.namaPetugas.get(idPetugas);
    }

    @Override
    public String getAlamat(int idPetugas) {
        return this.alamat.get(idPetugas);
    }

    @Override
    public String getTelepon(int idPetugas) {
        return this.telepon.get(idPetugas);
    }

}
