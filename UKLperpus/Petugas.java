package UKLperpus;

import UKLlelang.User;

import java.util.ArrayList;

public class Petugas implements User {

        private ArrayList<String> namaKaryawan = new ArrayList<String>();
        private ArrayList<String> alamat = new ArrayList<String>();
        private ArrayList<String> telepon = new ArrayList<String>();

        public Petugas (){
            this.namaKaryawan.add("Mulyono");
            this.alamat.add("Bojonegoro");
            this.telepon.add("084322134455");
        }

        @Override
        public String getNama(int idPetugas) {
            return this.namaKaryawan.get(idPetugas);
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

