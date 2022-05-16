package UKLperpus;

import java.util.ArrayList;

public class Buku {
    private ArrayList<String> namaBuku= new ArrayList<String>();
    private ArrayList <Integer> stok = new ArrayList<Integer>();
    private ArrayList <Integer> harga = new ArrayList<Integer>();

    public Buku() {
        this.namaBuku.add("Alam Semestapun Setuju");
        this.stok.add(10);


        this.namaBuku.add("Diri Ini");
        this.stok.add(3);


        this.namaBuku.add("Pikologi Pikiran");
        this.stok.add(5);

    }

    public int getStok (int stok){
        return this.stok.get(stok);
    }

    public void editStok (int stok, int idBarang){
        this.stok.set(stok,idBarang);
    }

    public String getNamaBuku (int idBarang){
        return this.namaBuku.get(idBarang);
    }
    public int getJmlBuku(){
        return this.namaBuku.size();
    }
}
