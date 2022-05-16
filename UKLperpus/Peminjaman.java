package UKLperpus;

import java.util.ArrayList;
import java.util.Scanner;

public class Peminjaman {
    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    private ArrayList<Integer> idBuku = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();

    public int getIdSiswa(int idSiswa) {
        return this.idSiswa.get(idSiswa);
    }

    public int getIdBuku(int idBuku) {
        return this.idBuku.get(idBuku);
    }

    public int getBanyak(int id) {
        return this.banyak.get(id);
    }

    public void prosesPeminjaman(Siswa siswa, Buku buku) {
        int syarat = 0, j, idS, idB, size, sta = 0;
        String jawab;


        Scanner in = new Scanner(System.in);

        System.out.println("Selamat Datang di Gramudia");

        syarat++;
        do {
            syarat--;

            System.out.println("Apa yang ingin anda lakukan ? (Peminjaman/Pengembalian)");
            jawab = in.next();

            syarat++;
            do {
                syarat--;
                if (jawab.equalsIgnoreCase("peminjaman")) {

                    System.out.println("Masukkan ID Anda : ");
                    idS = in.nextInt();

                    if (idS > 0 && idS <= siswa.getJmlSiswa() && siswa.getStatus(idS - 1) == true) {
                        this.idSiswa.add(idS - 1);

                        System.out.println();
                        for (int r = 0; r < buku.getJmlBuku(); r++) {
                            System.out.println((r + 1) + ". " + buku.getNamaBuku(r));
                        }
                        System.out.println("Masukkan ID Buku yang ingin anda Pinjam : ");
                        idB = in.nextInt();

                        if (idB > 0 && idB <= buku.getJmlBuku()) {
                            this.idBuku.add(idB - 1);

                            System.out.println("\n" + buku.getNamaBuku(idB - 1) + " stok " + buku.getStok(idB - 1));
                            System.out.println("Masukkan banyak buku yang ingin dipinjam ");
                            size = in.nextInt();

                            if (size > 0 && size <= buku.getStok(idBuku.get(sta))) {

                                this.banyak.add(size);
                                siswa.setStatus(false, getIdSiswa(sta));

                                buku.editStok(idBuku.get(sta), buku.getStok(idBuku.get(sta)) - banyak.get(sta));

                                System.out.println("\nNama : " + siswa.getNama(getIdSiswa(sta)) + "\nNama Buku yang dipinjam : " + buku.getNamaBuku(getIdBuku(sta)) + "\nBanyak buku yang dipinjam : " + getBanyak(sta) + "\nStatus Siswa : " + siswa.getStatus(sta));

                                sta++;

                            } else {
                                System.out.println("Inputan tidak sesuai");
                            }


                        } else {
                            System.out.println("ID tidak ditemukan");
                            syarat++;
                        }

                    } else {
                        System.out.println("ID tidak ditemukan");
                        syarat++;
                    }
                } else if (jawab.equalsIgnoreCase("pengembalian")) {

                    System.out.println("Masukkan ID Anda : ");
                    idS = in.nextInt();

                    if (idS > 0 && idS <= siswa.getJmlSiswa() && siswa.getStatus(idS - 1) == false) {
                        this.idSiswa.add(idS - 1);

                        System.out.println();
                        for (int r = 0; r < buku.getJmlBuku(); r++) {
                            System.out.println((r + 1) + ". " + buku.getNamaBuku(r));
                        }
                        System.out.println("Masukkan ID Buku yang ingin anda Kembalikan: ");
                        idB = in.nextInt();

                        if (idB > 0 && idB <= buku.getJmlBuku()) {
                            this.idBuku.add(idB - 1);

                            System.out.println("\n" + buku.getNamaBuku(idB - 1) + " stok " + buku.getStok(idB - 1));
                            System.out.println("Masukkan banyak buku yang ingin dikembalikan ");
                            size = in.nextInt();

                            if (size > 0 && size <= buku.getStok(idBuku.get(sta))) {

                                this.banyak.add(size);
                                siswa.setStatus(true, getIdSiswa(sta));

                                buku.editStok(idBuku.get(sta), buku.getStok(idBuku.get(sta)) + banyak.get(sta));

                                System.out.println("\nNama : " + siswa.getNama(getIdSiswa(sta)) + "\nNama Buku yang dikembalikan: " + buku.getNamaBuku(getIdBuku(sta)) + "\nBanyak buku yang dikembalikan : " + getBanyak(sta) + "\nStatus Siswa : " + siswa.getStatus(sta));

                                sta++;

                            } else {
                                System.out.println("Inputan tidak sesuai");
                            }


                        } else {
                            System.out.println("ID tidak ditemukan");
                            syarat++;
                        }

                    } else {
                        System.out.println("ID tidak ditemukan");
                        syarat++;
                    }

                }
            } while (syarat == 1);

            System.out.println("Apakah anda ingin melakukan hal lain?");
            String tanya = in.next();

            if (tanya.equalsIgnoreCase("ya")) {
                syarat++;
            } else {
                System.out.println("TERIMAKASIH");
            }
        } while (syarat == 1);
    }

}
