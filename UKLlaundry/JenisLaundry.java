package UKLlaundry;

import java.util.ArrayList;

public class JenisLaundry {

    private ArrayList<String> jenisLaundry = new ArrayList<String>();
    private ArrayList <Integer> harga = new ArrayList<Integer>();
    private ArrayList <Integer> durasi = new ArrayList<Integer>();

    public JenisLaundry (){
        this.jenisLaundry.add("Cuci");
        this.jenisLaundry.add("Cuci Kering");
        this.jenisLaundry.add("Cuci Kering & Setrika");

        this.harga.add(5000);
        this.harga.add(7000);
        this.harga.add(9000);

        this.durasi.add(1);
        this.durasi.add(2);
        this.durasi.add(3);
    }
    public String getJenisLaundry (int idJL){
        return this.jenisLaundry.get(idJL);
    }

    public int getHarga(int idJL){
        return this.harga.get(idJL);
    }

    public int getDurasi(int idJL){
        return this.durasi.get(idJL);
    }

    public int getJmlhJenisLaundry() {
        return this.jenisLaundry.size();
    }

    public int getJmlhDurasi() {
        return this.durasi.size();
    }
}
