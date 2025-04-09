package service;

import java.util.List;
import model.Resep;

public interface PencariResep {
    List<Resep> cariBerdasarkanBahan(List<String> bahan);
    List<Resep> cariBerdasarkanDiet(String preferensiDiet);
    List<Resep> cariBerdasarkanWaktuPersiapan(int maksimalMenit);
}