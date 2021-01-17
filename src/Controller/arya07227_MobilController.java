package Controller;

import Entity.arya07227_MobilEntity;
import javax.swing.table.DefaultTableModel;

public class arya07227_MobilController {

    public arya07227_MobilController() {
    }

    public void insert(String arya07227_brand, String arya07227_type, String arya07227_warna, String arya07227_harga) {
        arya07227_AllObjectModel.mobilModel.insertMobil(new arya07227_MobilEntity(arya07227_brand, arya07227_type, arya07227_warna, arya07227_harga));
    }

    public void listMobil() {
        arya07227_AllObjectModel.mobilModel.view();
    }

    public void hapusMobil(String arya07227_brand) {
        arya07227_AllObjectModel.mobilModel.hapus(arya07227_brand);
    }

    public void updatemobil(String arya07227_brand, String newArya07227_type, String newArya07227_warna, String newArya07227_harga) {
        arya07227_AllObjectModel.mobilModel.update(arya07227_brand, newArya07227_type, newArya07227_warna, newArya07227_harga);
    }

    public DefaultTableModel daftarmobil() {
        DefaultTableModel dtmdaftarmobil = new DefaultTableModel();
        Object[] kolom = {"index", "Brand", "Type", "Warna", "Harga"};
        dtmdaftarmobil.setColumnIdentifiers(kolom);
        int size = arya07227_AllObjectModel.mobilModel.alldatamobil().size();
        for (int i = 0; i < size; i++) {
            Object[] data = new Object[10];
            data[0] = i;
            data[1] = arya07227_AllObjectModel.mobilModel.alldatamobil().get(i).arya07227_brand;
            data[2] = arya07227_AllObjectModel.mobilModel.alldatamobil().get(i).arya07227_type;
            data[3] = arya07227_AllObjectModel.mobilModel.alldatamobil().get(i).arya07227_warna;
            data[4] = arya07227_AllObjectModel.mobilModel.alldatamobil().get(i).arya07227_harga;
            dtmdaftarmobil.addRow(data);
        }
        return dtmdaftarmobil;
    }
}
