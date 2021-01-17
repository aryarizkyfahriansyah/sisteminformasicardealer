package Entity;

public abstract class arya07227_BiodataEntity 
{
    public String arya07227_nama,arya07227_password;

    public arya07227_BiodataEntity(String arya07227_nama,String arya07227_password) {
        this.arya07227_nama = arya07227_nama;
        this.arya07227_password = arya07227_password;
    }

    public arya07227_BiodataEntity(){
    
    }

    public abstract String getArya07227_nama();

    public void setArya07227_nama(String arya07227_nama) {
        this.arya07227_nama = arya07227_nama;
    }
    public String getArya07227_password() {
        return arya07227_nama;
    }
    public void setArya07227_password(String arya07227_password) {
        this.arya07227_password = arya07227_password;
    }
        
}
