package Controller;

import Entity.*;

public class arya07227_AdminController implements arya07227_ControllerInterface {

    int indexLogin = 0;

    public arya07227_AdminController() {
    }

    public void dataAdmin() {
        String arya07227_nama[] = {"arya", "rizky"};
        String arya07227_password[] = {"01", "02"};
        for (int i = 0; i < arya07227_password.length; i++) {
            arya07227_AllObjectModel.adminModel.insertAdmin(new arya07227_AdminEntity(arya07227_nama[i], arya07227_password[i]));
        }
    }

    public arya07227_AdminEntity adminEntity() {
        return arya07227_AllObjectModel.adminModel.showDataAdmin(indexLogin);
    }

    public void viewAdmin() {
        arya07227_AllObjectModel.adminModel.view();
    }

    @Override
    public void login(String arya07227_nama, String arya07227_password) {
        arya07227_AllObjectModel.adminModel.cekData(arya07227_nama, arya07227_password);
    }
}
