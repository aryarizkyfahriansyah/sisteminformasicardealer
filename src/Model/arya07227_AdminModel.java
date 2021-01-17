package Model;

import Entity.arya07227_AdminEntity;
import java.util.ArrayList;

public class arya07227_AdminModel implements ModelInterfaces07227 {

    private ArrayList<arya07227_AdminEntity> adminEntityArrayList;

    public arya07227_AdminModel() {
        adminEntityArrayList = new ArrayList<arya07227_AdminEntity>();
    }

    public void insertAdmin(arya07227_AdminEntity admin) {
        adminEntityArrayList.add(admin);
    }

    @Override
    public void view() {
        for (arya07227_AdminEntity admin : adminEntityArrayList) {
            System.out.print(admin.getArya07227_nama());
            System.out.print(admin.getArya07227_password());
            System.out.println();
        }
    }

    public int cekData(String arya07227_nama, String arya07227_password) {
        int loop = 0;
        for (arya07227_AdminEntity admin : adminEntityArrayList) {
            if (admin.getArya07227_nama().equals(arya07227_nama) && admin.getArya07227_password().equals(arya07227_password)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }

    public arya07227_AdminEntity showDataAdmin(int index) {
        return adminEntityArrayList.get(index);
    }

}
