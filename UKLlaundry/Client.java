package UKLlaundry;

import java.util.ArrayList;

public class Client implements User {
        private ArrayList<String> namaClient = new ArrayList<String>();
        private ArrayList<String> alamat = new ArrayList<String>();
        private ArrayList<String> telepon = new ArrayList<String>();
        private ArrayList<Integer> saldo = new ArrayList<Integer>();

        public Client (){
            this.namaClient.add("Mamat");
            this.alamat.add("Srono");
            this.telepon.add("083311113333");
            this.saldo.add(100000);

            this.namaClient.add("Budi");
            this.alamat.add("Srono");
            this.telepon.add("082211113333");
            this.saldo.add(200000);

            this.namaClient.add("Wawan");
            this.alamat.add("Srono");
            this.telepon.add("084411113333");
            this.saldo.add(300000);
        }

        public void setSaldo (int saldo){
            this.saldo.add(saldo);
        }

        public int getSaldo (int idMember){
            return this.saldo.get(idMember);
        }

        public void editSaldo (int idMember, int saldo){
            this.saldo.set(idMember, saldo);
        }

    @Override
    public String getNama(int idClient) {
        return this.namaClient.get(idClient);
    }

    public int getJmlhNama() {
        return this.namaClient.size();
    }

    @Override
    public String getAlamat(int idClient) {
        return this.alamat.get(idClient);
    }

    @Override
    public String getTelepon(int idClient) {
        return this.telepon.get(idClient);
    }
}
