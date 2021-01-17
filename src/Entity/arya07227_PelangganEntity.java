package Entity;

public class arya07227_PelangganEntity extends arya07227_BiodataEntity {

    String arya07227_alamat;
    String arya07227_notelp;
    public arya07227_PelangganEntity(String arya07227_nama, String arya07227_password,String arya07227_alamat,String arya07227_notelp) {
        super(arya07227_nama, arya07227_password);
        this.arya07227_alamat = arya07227_alamat;
        this.arya07227_notelp = arya07227_notelp;
    }

    @Override
    public String getArya07227_nama() {
        return arya07227_nama;
    }

    public String getArya07227_alamat() {
        return arya07227_alamat;
    }

    public String getArya07227_notelp() {
        return arya07227_notelp;
    }
    
}
