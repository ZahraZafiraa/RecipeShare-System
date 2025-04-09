package repository;

import java.util.List;
import model.Resep;

public interface PenyimpananResep {
    void tambahResep(Resep resep);
    Resep dapatkanResepById(int id);
    List<Resep> dapatkanSemuaResep();
    List<Resep> dapatkanResepByKategori(String kategori);
}