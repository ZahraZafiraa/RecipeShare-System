package service;

public interface PengelolaPengguna {
    void daftarkanPengguna(String namaPengguna, String kataSandi, String email);
    boolean verifikasiPengguna(String namaPengguna, String kataSandi);
    void perbaruiProfil(String namaPengguna, String dataProfilBaru);
}