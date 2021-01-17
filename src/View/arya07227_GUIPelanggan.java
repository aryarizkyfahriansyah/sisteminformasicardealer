package View;

import Entity.arya07227_MobilEntity;
import Controller.arya07227_MobilController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class arya07227_GUIPelanggan {

    private static arya07227_MobilController datamobil = new arya07227_MobilController();
    JFrame view = new JFrame();
    JTable tabel = new JTable();
    JScrollPane scrollmobil = new JScrollPane(tabel);
    JLabel mobil;
    JButton back;

    public arya07227_GUIPelanggan() {
        view.setSize(720, 600);
        view.setLayout(null);
        view.getContentPane().setBackground(Color.GREEN);
        mobil = new JLabel("Data Mobil");
        mobil.setFont(new Font("Times New Roman", Font.BOLD, 30));
        mobil.setBounds(90, 30, 200, 30);
        view.add(mobil);

        scrollmobil.setBounds(50, 80, 580, 380);
        tabel.setModel(datamobil.daftarmobil());
        view.add(scrollmobil);

        back = new JButton("Back");
        back.setBounds(100, 520, 80, 30);
        back.setFont(new Font("Arial", Font.BOLD, 15));
        back.setBackground(Color.CYAN);
        view.add(back);

        view.setVisible(true);
        view.setLocationRelativeTo(null);
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                view.dispose();
                arya07227_GUILogin gui = new arya07227_GUILogin();
            }
        });
    }
}
