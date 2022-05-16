package UKLlelang;

import java.util.ArrayList;
import java.util.Scanner;

public class Lelang extends Petugas{
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> hargaTawar = new ArrayList<Integer>();
    private ArrayList<Integer> idPenawar = new ArrayList<Integer>();
    private ArrayList<Integer> hasilLelang = new ArrayList<Integer>();
    private ArrayList<Integer> pemenangLelang = new ArrayList<Integer>();
    private ArrayList<Integer> barangLelang = new ArrayList<Integer>();

    public int getIdBarang(int id) {
        return this.idBarang.get(id);
    }

    public int getHargaTawar(int id) {
        return this.hargaTawar.get(id);
    }

    public int getIdPenawar(int id) {
        return this.idPenawar.get(id);
    }

    public int getPemenangLelang(int id) {
        return this.pemenangLelang.get(id);
    }

    public int getHasilLelang(int id) {
        return this.hasilLelang.get(id);
    }

    public int getBarangLelang(int id) {
        return this.barangLelang.get(id);
    }

    public void prosesLelang(Masyarakat masyarakat, Barang barang) {

        int y = -1;
        int z = 0;
        int a = 0;
        int syarat = 0;
        int idMasyarakat;
        String jawab;

        super.outPetugas(a);

        Scanner in = new Scanner(System.in);
        System.out.println("\nHari ini kami akan melelang barang sejumlah " + barang.getJmlBarang() + " barang yaitu : \n")
        ;

        for (int x = 0; x < barang.getJmlBarang(); x++) {

            for (int i = 0; i < barang.getJmlBarang(); i++) {
                System.out.println((i + 1) + ". " + barang.getNamaBarang(i));
            }


            syarat++;
            do {
                syarat--;
                System.out.println("Barang keberapa dulu yang harus kita lelang?");
                int urutan = in.nextInt();


                if (urutan <= barang.getJmlBarang() && urutan > 0) {
                    this.idBarang.add(urutan);

                } else {
                    System.out.println("Mohon maaf inputan tidak sesuai");
                    syarat++;
                }
            } while (syarat == 1);
        }

        for (int i = 0; i < barang.getJmlBarang(); i++) {
            System.out.println("\nLelang barang ke " + (i + 1) + " yaitu " + barang.getNamaBarang(getIdBarang(i) - 1));
            System.out.println("Dengan harga awal " + barang.getHargaAwal(getIdBarang(i) - 1) + " Rupiah");

            this.hargaTawar.add(barang.getHargaAwal(getIdBarang(i) - 1));

            syarat++;

            do {

                do {

                    syarat--;

                    System.out.println("\nApakah ada yang menawar?");
                    jawab = in.next();


                    if (jawab.equalsIgnoreCase("ya") || jawab.equalsIgnoreCase("tidak")) {

                    } else {

                        syarat++;

                    }
                } while (syarat == 1);

                if (jawab.equalsIgnoreCase("ya")) {

                    System.out.println("Silakan masukan id anda ");
                    idMasyarakat = in.nextInt();

                    if (idMasyarakat <= masyarakat.getJmlMasyarakat() && idMasyarakat > 0) {
                        this.idPenawar.add(idMasyarakat - 1);
                        System.out.println("\nNama : " + masyarakat.getNama(getIdPenawar(a)) + "\nAlamat : " + masyarakat.getAlamat(getIdPenawar(a)));
                        System.out.println("\nBerapa tawaran harga anda?");

                        this.hargaTawar.add(in.nextInt());

                        y++;
                        z++;
                        a++;

                        System.out.println("\nTawaran harga tertinggi saat ini : " + Math.max(getHargaTawar(y), getHargaTawar(z)) + " Rupiah");

                        syarat++;

                        do {

                            syarat--;

                            System.out.println("\nApakah ada yang menawar lagi?");
                            jawab = in.next();

                            if (jawab.equalsIgnoreCase("ya")) {

                                System.out.println("Silakan masukan id anda ");
                                idMasyarakat = in.nextInt();

                                if (idMasyarakat <= masyarakat.getJmlMasyarakat() && idMasyarakat > 0) {
                                    this.idPenawar.add(idMasyarakat - 1);
                                    System.out.println("\nNama : " + masyarakat.getNama(getIdPenawar(a)) + "\nAlamat : " + masyarakat.getAlamat(getIdPenawar(a)));
                                    System.out.println("\nBerapa tawaran harga anda? ");


                                    this.hargaTawar.add(in.nextInt());

                                    y++;
                                    z++;
                                    a++;

                                    System.out.println("\nTawaran harga tertinggi saat ini : " + Math.max(getHargaTawar(y), getHargaTawar(z)) + " Rupiah");

                                    syarat++;

                                } else {
                                    System.out.println("Id Tidak ditemukan");
                                    syarat++;
                                }

                            } else if (jawab.equalsIgnoreCase("tidak")) {

                                this.hasilLelang.add(getHargaTawar(z));
                                this.pemenangLelang.add(getIdPenawar(a - 1));

                                barang.setStatus(false, getIdBarang(i) - 1);
                                System.out.println("\nBarang " + barang.getNamaBarang(getIdBarang(i) - 1) + " telah terjual dengan harga " + getHargaTawar(z) + " Rupiah\nStatus : " + barang.getStatus((getIdBarang(i) - 1)));

                                y++;
                                z++;
                            } else {
                                System.out.println("Kata kunci tidak sesuai");
                                syarat++;
                            }
                        } while (syarat == 1);

                    } else {
                        System.out.println("Id Tidak ditemukan");
                        syarat++;
                    }

                } else if (jawab.equalsIgnoreCase("tidak")) {
                    this.barangLelang.add(i);
                    y++;
                    z++;
                } else {
                    System.out.println("Kata kunci tidak sesuai");
                    syarat++;
                }

            } while (syarat == 1);
        }

        int f = 0;
        for (int e = 0; e < barangLelang.size(); e++) {
            this.idBarang.remove(getBarangLelang(e) - f);
            f++;
        }
    }

    public void hasil(Masyarakat masyarakat, Barang barang) {

        if (pemenangLelang.size() != 0) {
            for (int p = 0; p < pemenangLelang.size(); p++) {

                System.out.println("\nPemenang lelang " + barang.getNamaBarang(getIdBarang(p) - 1) + "\nNama : " + masyarakat.getNama(getPemenangLelang(p)) + "\nAlamat : " + masyarakat.getAlamat(getPemenangLelang(p)) + "\nNomor Telepon : " + masyarakat.getTelepon(p) + "\nHarga Tawar : " + getHasilLelang(p) + " Rupiah");
                System.out.println("\nPemilik barang : " + masyarakat.getNama(barang.getIdMasyarakat(getIdBarang(p) - 1)) + "\nAlamat : " + masyarakat.getAlamat(barang.getIdMasyarakat(getIdBarang(p) - 1)) + "\nNomor Telepon : " + masyarakat.getTelepon(barang.getIdMasyarakat(getIdBarang(p) - 1)));
            }
        } else {
            System.out.println("\nTAK ADA SATUPUN BARANG LELANG YANG TERJUAL");
        }
    }
}
