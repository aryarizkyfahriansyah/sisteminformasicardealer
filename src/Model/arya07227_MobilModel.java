package Model;

import Entity.arya07227_MobilEntity;
import java.util.ArrayList;

public class arya07227_MobilModel {

    private ArrayList<arya07227_MobilEntity> mobilEntityArrayList;

    public arya07227_MobilModel() {
        mobilEntityArrayList = new ArrayList<arya07227_MobilEntity>();
    }

    public void insertMobil(arya07227_MobilEntity mobil) {
        mobilEntityArrayList.add(mobil);
    }

    public void view() {
        for (arya07227_MobilEntity mobil : mobilEntityArrayList) {
            System.out.println("Brand = " + mobil.getArya07227_brand());
            System.out.println("Type = " + mobil.getArya07227_type());
            System.out.println("Warna = " + mobil.getArya07227_warna());
            System.out.println("Harga = " + mobil.getArya07227_harga());
            System.out.println("======================");
        }
    }

    public void hapus(String arya07227_brand) {
        for (int i = 0; i < mobilEntityArrayList.size(); i++) {
            if (arya07227_brand.equals(mobilEntityArrayList.get(i).getArya07227_brand())) {
                mobilEntityArrayList.remove(i);
                System.out.println("Data Telah Di Hapus");
                System.out.println("======================");
            } else {
                System.out.println("Salah nama brand");
                System.out.println("======================");
            }
        }
    }

    public void update(String arya07227_brand, String newArya07227_type, String newArya07227_warna, String newArya07227_harga) {
        for (int i = 0; i < mobilEntityArrayList.size(); i++) {
            if (arya07227_brand.equals(mobilEntityArrayList.get(i).getArya07227_brand())) {
                mobilEntityArrayList.get(i).arya07227_type = newArya07227_type;
                mobilEntityArrayList.get(i).arya07227_warna = newArya07227_warna;
                mobilEntityArrayList.get(i).arya07227_harga = newArya07227_harga;
                System.out.println("Data Telah DI Update");
                System.out.println("======================");
            }
        }
    }
    public ArrayList<arya07227_MobilEntity> alldatamobil(){
        return mobilEntityArrayList;
    }
}
