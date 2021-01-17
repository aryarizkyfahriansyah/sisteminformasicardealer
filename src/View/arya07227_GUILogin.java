package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class arya07227_GUILogin {

    JFrame MenuLogin = new JFrame();
    JLabel judul,namalogin, passwordlogin;
    JButton login, back;
    JRadioButton radioadmin, radiopelanggan;
    JTextField textnamalogin,textpasswordlogin;
    JPasswordField passwordlogin1;
    private boolean ceklogin = false;

    public arya07227_GUILogin() {
        MenuLogin.setSize(800, 630);
        MenuLogin.setLayout(null);
        MenuLogin.getContentPane().setBackground(Color.GREEN);
        
        judul = new JLabel("CAR DEALER ARYA");
        judul.setBounds(130, 10, 600, 50);
        judul.setFont(new Font("Lucida Bright", Font.BOLD, 50));
        MenuLogin.add(judul);
        
        radioadmin = new JRadioButton("Admin");
        radioadmin.setBounds(300, 180, 100, 30);
        radioadmin.setBackground(Color.CYAN);
        MenuLogin.add(radioadmin);
        
        radiopelanggan = new JRadioButton("Pelanggan");
        radiopelanggan.setBounds(400, 180, 100, 30);
        radiopelanggan.setBackground(Color.CYAN);
        MenuLogin.add(radiopelanggan);

        namalogin = new JLabel("Nama");
        namalogin.setBounds(300, 210, 200, 30);
        MenuLogin.add(namalogin);
        textnamalogin = new JTextField();
        textnamalogin.setBounds(300, 240, 200, 30);
        MenuLogin.add(textnamalogin);
        
        passwordlogin = new JLabel("Password");
        passwordlogin.setBounds(300, 270, 200, 30);
        MenuLogin.add(passwordlogin);
        passwordlogin1 = new JPasswordField();
        passwordlogin1.setBounds(300, 300, 200, 30);
        MenuLogin.add(passwordlogin1);

        login = new JButton("Login");
        login.setBounds(300, 350, 200, 30);
        login.setFont(new Font("Arial", Font.BOLD, 15));
        login.setBackground(Color.CYAN);
        MenuLogin.add(login);

        back = new JButton("Back");
        back.setBounds(100, 520, 80, 30);
        back.setFont(new Font("Arial", Font.BOLD, 15));
        back.setBackground(Color.CYAN);
        MenuLogin.add(back);

        MenuLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MenuLogin.setVisible(true);
        MenuLogin.setLocationRelativeTo(null);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                MenuLogin.dispose();
                arya07227_GUI gui = new arya07227_GUI();
            }
        });
        radioadmin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (radioadmin.isSelected()) {
                    radiopelanggan.setSelected(false);
                    ceklogin = true;
                }
            }
        });
        radiopelanggan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (radiopelanggan.isSelected()) {
                    radioadmin.setSelected(false);
                    ceklogin = false;
                }
            }

        });
        login.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ceklogin==true){
                    try{
                        arya07227_AllObjectController.adminController.dataAdmin();
                        arya07227_AllObjectController.adminController.login(textnamalogin.getText(), passwordlogin.getText());
                        String nama = arya07227_AllObjectController.adminController.adminEntity().getArya07227_nama();
                        JOptionPane.showMessageDialog(null,"Selamat Datang "+nama,"information",JOptionPane.INFORMATION_MESSAGE);
                        arya07227_GUIAdmin admin = new arya07227_GUIAdmin();
                        MenuLogin.dispose();                        
                    }catch(Exception exception){
                        JOptionPane.showMessageDialog(null,"Nama atau password salah","information",JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                }else{
                    try{
                        arya07227_AllObjectController.pelangganController.login(textnamalogin.getText(),passwordlogin.getText());
                        String nama = arya07227_AllObjectController.pelangganController.pelangganEntity().getArya07227_nama();
                        JOptionPane.showMessageDialog(null,"Selamat Datang "+nama,"information",JOptionPane.INFORMATION_MESSAGE);
                        arya07227_GUIPelanggan pelangan = new arya07227_GUIPelanggan();
                        MenuLogin.dispose();
                    }catch(Exception exception){
                        JOptionPane.showMessageDialog(null,"Nama atau password salah","information",JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                }
            }
        });

    }

    void kosong() {

        textnamalogin.setText(null);
        passwordlogin.setText(null);
    }
}
