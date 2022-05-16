package UKLlelang;

import java.util.ArrayList;

public class Masyarakat implements User {
    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public Masyarakat (){
        this.namaMasyarakat.add("Mamat");
        this.alamat.add("Papua");
        this.telepon.add("082233451209");

        this.namaMasyarakat.add("Budi");
        this.alamat.add("Bojonegoro");
        this.telepon.add("082233451287");

        this.namaMasyarakat.add("Wawan");
        this.alamat.add("Kalimantan");
        this.telepon.add("082233451212");

        this.namaMasyarakat.add("Dono");
        this.alamat.add("Jakarta");
        this.telepon.add("082233451443");

        this.namaMasyarakat.add("Fiko");
        this.alamat.add("Bandung");
        this.telepon.add("082233462136");

        this.namaMasyarakat.add("Jaenab");
        this.alamat.add("Yogyakarta");
        this.telepon.add("082233462258");
    }

    @Override
    public String getNama(int idMasyarakat) {
        return this.namaMasyarakat.get(idMasyarakat);
    }

    @Override
    public String getAlamat(int idMasyarakat) {
        return this.alamat.get(idMasyarakat);
    }

    @Override
    public String getTelepon(int idMasyarakat) {
        return this.telepon.get(idMasyarakat);
    }

    public int getJmlMasyarakat(){
        return this.namaMasyarakat.size();
    }
}
