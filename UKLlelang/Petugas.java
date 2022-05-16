package UKLlelang;

import java.util.ArrayList;

public class Petugas implements User{
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public Petugas (){
        this.namaPetugas.add("Mulyadi");
        this.alamat.add("Sumatera");
        this.telepon.add("084322134423");
    }

    public  void outPetugas (int moderator){
        System.out.println("Selamat datang di rumah lelang Gray House \nSaya Petugas "+ getNama(moderator) + " dari " + getAlamat(moderator) + " akan memandu acara lelang kali ini \nSegala bentuk pertanyaan terkait lelang hari ini, silahkan hubungi saya di nomor " + getTelepon(moderator));
    }

    @Override
    public String getNama(int idPetugas) {
        return this.namaPetugas.get(idPetugas);
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
