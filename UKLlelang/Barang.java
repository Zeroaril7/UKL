package UKLlelang;

import java.util.ArrayList;

public class Barang {
    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> hargaAwal = new ArrayList<Integer>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();

    public Barang() {
        this.idMasyarakat.add(1);
        this.namaBarang.add("Patung");
        this.hargaAwal.add(200000);
        this.status.add(true);

        this.idMasyarakat.add(0);
        this.namaBarang.add("Lukisan");
        this.hargaAwal.add(400000);
        this.status.add(true);

        this.idMasyarakat.add(5);
        this.namaBarang.add("Panci Legendaris");
        this.hargaAwal.add(1000000);
        this.status.add(true);
    }

    public int getJmlBarang() {
        return this.namaBarang.size();
    }

    public String getNamaBarang(int idBarang) {
        return this.namaBarang.get(idBarang);
    }

    public int getHargaAwal(int idBarang) {
        return this.hargaAwal.get(idBarang);
    }

    public void setStatus(boolean status, int idBarang) {
        this.status.set(idBarang, status);
    }

    public boolean getStatus(int idBarang) {
        return this.status.get(idBarang);
    }

    public Integer getIdMasyarakat(int iDMasyarakat) {
        return this.idMasyarakat.get(iDMasyarakat);
    }
}
