package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class arya07227_GUI {

    JFrame MenuUtama = new JFrame();
    JLabel judul;
    JButton login, daftar;

    public arya07227_GUI() {
        MenuUtama.setSize(800, 630);
        MenuUtama.setLayout(null);
        MenuUtama.getContentPane().setBackground(Color.GREEN);

        judul = new JLabel("CAR DEALER ARYA");
        judul.setBounds(130, 10, 600, 50);
        judul.setFont(new Font("Lucida Bright", Font.BOLD, 50));
        MenuUtama.add(judul);

        login = new JButton("LOGIN");
        login.setBounds(300, 210, 200, 50);
        login.setBackground(Color.CYAN);
        MenuUtama.add(login);

        daftar = new JButton("Daftar Pelanggan");
        daftar.setBounds(300, 270, 200, 50);
        daftar.setBackground(Color.CYAN);
        MenuUtama.add(daftar);

        MenuUtama.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MenuUtama.setVisible(true);
        MenuUtama.setLocationRelativeTo(null);

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                arya07227_GUILogin login = new arya07227_GUILogin();
                MenuUtama.dispose();
            }
        });
        daftar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                arya07227_GUIDaftar daftar = new arya07227_GUIDaftar();
                MenuUtama.dispose();
            }
        });
    }
}
