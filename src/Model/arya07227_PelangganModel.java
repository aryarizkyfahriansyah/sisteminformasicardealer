package Model;

import Entity.arya07227_PelangganEntity;
import java.util.ArrayList;

public class arya07227_PelangganModel implements ModelInterfaces07227 {

    private ArrayList<arya07227_PelangganEntity> pelangganEntityArrayList;

    public arya07227_PelangganModel() {
        pelangganEntityArrayList = new ArrayList<arya07227_PelangganEntity>();
    }

    public void insertPelanggan(arya07227_PelangganEntity pelanggan) {
        pelangganEntityArrayList.add(pelanggan);
    }

    @Override
    public void view() {
        for (arya07227_PelangganEntity pelanggan : pelangganEntityArrayList) {
            System.out.print(pelanggan.getArya07227_nama());
            System.out.print(pelanggan.getArya07227_password());
            System.out.print(pelanggan.getArya07227_alamat());
            System.out.print(pelanggan.getArya07227_notelp());
            System.out.println();
        }
    }

    public int cekData(String arya07227_nama, String arya07227_password) {
        int loop = 0;
        for (arya07227_PelangganEntity pelanggan : pelangganEntityArrayList) {
            if (pelanggan.getArya07227_nama().equals(arya07227_nama) && pelanggan.getArya07227_password().equals(arya07227_password)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }

    public arya07227_PelangganEntity showDataPelanggan(int index) {
        return pelangganEntityArrayList.get(index);
    }
}
