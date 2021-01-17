package Controller;

import Entity.arya07227_PelangganEntity;

public class arya07227_PelangganController implements arya07227_ControllerInterface {
    arya07227_AllObjectModel allobject = new arya07227_AllObjectModel();
    int indexLogin = 0;

    public arya07227_PelangganController() {
    }

    @Override
    public void login(String arya07227_nama, String arya07227_password) {
        arya07227_AllObjectModel.pelangganModel.cekData(arya07227_nama, arya07227_password);
    }

    public void insert(String arya07227_nama, String arya07227_password, String arya07227_alamat, String arya07227_Notelp) {
        arya07227_PelangganEntity pelangganModel = new arya07227_PelangganEntity(arya07227_nama, arya07227_password, arya07227_alamat, arya07227_Notelp);
        allobject.pelangganModel.insertPelanggan(pelangganModel);
    }
    public arya07227_PelangganEntity pelangganEntity() {
        return arya07227_AllObjectModel.pelangganModel.showDataPelanggan(indexLogin);
    }
}
