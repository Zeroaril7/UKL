package UKLlaundry;

import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi extends Petugas{
    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    private ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> Durasi = new ArrayList<Integer>();
    private ArrayList<Integer> tagihan = new ArrayList<Integer>();

    public void prosesTransaksi (Client client, JenisLaundry jenisLaundry, Transaksi transaksi){
        int idC, idL, idD, syarat=0, i,total=0, z=0;
        String tanya;

        Scanner in = new Scanner(System.in);
        syarat++;

        super.outPetugas(z);

        do {

            do {
                syarat--;

                System.out.println("Selamat datang di Lost Laundry");


                System.out.println("\nMasukkan ID Client anda");
                idC = in.nextInt();

                if (idC > 0 && idC <= client.getJmlhNama()) {
                    this.idClient.add(idC - 1);

                    syarat++;
                    do {
                        syarat--;

                        System.out.println();
                        for (i = 0; i < jenisLaundry.getJmlhJenisLaundry(); i++) {
                            System.out.println((i + 1) + ". " + jenisLaundry.getJenisLaundry(i) + " harga " + jenisLaundry.getHarga(i));

                        }

                        System.out.println("\nMasukkan jenis laundry : ");
                        idL = in.nextInt();

                        if (idL > 0 && idL <= jenisLaundry.getJmlhJenisLaundry()) {

                            this.idJenisLaundry.add(idL - 1);

                            System.out.println("Masukkan berapa berat cucian (Kg): ");
                            this.banyak.add(in.nextInt());

                            System.out.println();
                            for (i = 0; i < jenisLaundry.getJmlhDurasi(); i++) {
                                System.out.println((i + 1) + ". " + jenisLaundry.getDurasi(i) + " hari");
                            }

                            syarat++;
                            do {

                                System.out.println("Masukkan durasi waktu laundry : ");
                                idD = in.nextInt();

                                syarat--;

                                if (idD > 0 && idD <= jenisLaundry.getJmlhDurasi()) {
                                    this.Durasi.add(idD);
                                    total = this.banyak.get(z) * jenisLaundry.getHarga(idJenisLaundry.get(z));
                                    this.tagihan.add(total);
                                    client.editSaldo(idClient.get(z), client.getSaldo(idClient.get(z)) - total);
                                    z++;
                                } else {
                                    System.out.println("Inputan tidak sesuai");
                                    syarat++;

                                }
                            } while (syarat == 1);

                        } else {
                            System.out.println("Inputan tidak sesuai");
                            syarat++;
                        }

                    } while (syarat == 1);

                } else {
                    System.out.println("Inputan tidak sesuai");
                    syarat++;
                }

            } while (syarat == 1);

            System.out.println("\nApakah ada transaksi lain?");
            tanya=in.next();

            if (tanya.equalsIgnoreCase("ya")){
                syarat++;
                System.out.println();
            }else {
                System.out.println("Terimakasih telah menggunakan jasa Lost Laundry");
            }

        }while(syarat==1);
    }

    public void hasilTransaksi (Client client, JenisLaundry jenisLaundry){

        for (int p = 0 ; p<Durasi.size();p++) {
            System.out.println("\nCatatan Transaksi : \nNama Pelanggan : " + client.getNama(idClient.get(p)) + "\nAlamat : "+client.getAlamat(idClient.get(p))+ "\nNomor Telepon : "+client.getTelepon(idClient.get(p))+ "\nHarga : " + tagihan.get(p) +"\nSaldo : " + client.getSaldo(idClient.get(p)));
            System.out.println("\nJenis Laundry : " + jenisLaundry.getJenisLaundry(idJenisLaundry.get(p)) + "\nDurasi : " + Durasi.get(p) + " hari" + "\nBanyak : " + banyak.get(p) + " Kg");
        }
    }
}
