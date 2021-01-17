package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class arya07227_GUIDaftar {

    JFrame MenuDaftar = new JFrame();
    JTextField textnamadaftar, textnotelp, textalamat;
    JLabel judul, labelnotelp, labelalamat, labelnamadaftar, labelpassworddaftar;
    JPasswordField passworddaftar;
    JButton login, daftar, back;

    public arya07227_GUIDaftar() {
        MenuDaftar.setSize(700, 650);
        MenuDaftar.setLayout(null);
        MenuDaftar.getContentPane().setBackground(Color.GREEN);
        
        judul = new JLabel("Daftar Pelanggan");
        judul.setBounds(150, 60, 600, 50);
        judul.setFont(new Font("Consolas", Font.BOLD, 40));
        MenuDaftar.add(judul);
        
        labelnamadaftar = new JLabel("Nama");
        labelnamadaftar.setBounds(250, 210, 100, 30);
        MenuDaftar.add(labelnamadaftar);
        textnamadaftar = new JTextField();
        textnamadaftar.setBounds(250, 240, 200, 30);
        MenuDaftar.add(textnamadaftar);
        
        labelpassworddaftar = new JLabel("Password");
        labelpassworddaftar.setBounds(250, 270, 100, 30);
        MenuDaftar.add(labelpassworddaftar);
        passworddaftar = new JPasswordField();
        passworddaftar.setBounds(250, 300, 200, 30);
        MenuDaftar.add(passworddaftar);
        
        labelalamat = new JLabel("alamat");
        labelalamat.setBounds(250, 330, 100, 30);
        MenuDaftar.add(labelalamat);
        textalamat = new JTextField();
        textalamat.setBounds(250, 360, 200, 30);
        MenuDaftar.add(textalamat);

        labelnotelp = new JLabel("No Telepon");
        labelnotelp.setBounds(250, 390, 200, 30);
        MenuDaftar.add(labelnotelp);
        textnotelp = new JTextField();
        textnotelp.setBounds(250, 420, 200, 30);
        MenuDaftar.add(textnotelp);
        
        daftar = new JButton("Daftar");
        daftar.setBounds(250, 460, 200, 30);
        daftar.setFont(new Font("Arial", Font.BOLD, 15));
        daftar.setBackground(Color.CYAN);
        MenuDaftar.add(daftar);
        
        back = new JButton("Back");
        back.setBounds(100, 520, 80, 30);
        back.setFont(new Font("Arial", Font.BOLD, 15));
        back.setBackground(Color.CYAN);
        MenuDaftar.add(back);

        MenuDaftar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MenuDaftar.setVisible(true);
        MenuDaftar.setLocationRelativeTo(null);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                MenuDaftar.dispose();
                arya07227_GUI gui = new arya07227_GUI();
            }
        });

        daftar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String arya07227_nama = textnamadaftar.getText();
                String arya07227_password = passworddaftar.getText();
                String arya07227_alamat = textalamat.getText();
                String arya07227_Notelp = textnotelp.getText();
                arya07227_AllObjectController.pelangganController.insert(arya07227_nama, arya07227_password, arya07227_alamat, arya07227_Notelp);
                JOptionPane.showMessageDialog(null, "Registrasi Sukses", "information", JOptionPane.INFORMATION_MESSAGE);
                kosong();
            }
        });

    }

    void kosong() {
        textnamadaftar.setText(null);
        passworddaftar.setText(null);
        textalamat.setText(null);
        textnotelp.setText(null);
    }
}
