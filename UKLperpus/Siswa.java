package UKLperpus;

import java.util.ArrayList;

public class Siswa implements User {

    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();

    public Siswa (){
        this.namaSiswa.add("Mamat");
        this.alamat.add("Papua");
        this.telepon.add("082233451209");
        this.status.add(false);

        this.namaSiswa.add("Budi");
        this.alamat.add("Bojonegoro");
        this.telepon.add("082233451287");
        this.status.add(true);

        this.namaSiswa.add("Wawan");
        this.alamat.add("Kalimantan");
        this.telepon.add("082233451212");
        this.status.add(true);

    }

    @Override
    public String getNama(int idSiswa) {
        return this.namaSiswa.get(idSiswa);
    }

    @Override
    public String getAlamat(int idSiswa) {
        return this.alamat.get(idSiswa);
    }

    @Override
    public String getTelepon(int idSiswa) {
        return this.telepon.get(idSiswa);
    }
    public void setStatus(boolean status, int idBarang) {
        this.status.set(idBarang, status);
    }

    public boolean getStatus(int idBarang) {
        return this.status.get(idBarang);
    }

    public int getJmlSiswa(){
        return this.namaSiswa.size();
    }
}
