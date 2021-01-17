package View;

import Entity.arya07227_MobilEntity;
import Controller.arya07227_MobilController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class arya07227_GUIAdmin {

    private static arya07227_MobilController datamobil = new arya07227_MobilController();
    JFrame MenuAdmin = new JFrame();
    JTable tabel = new JTable();
    JScrollPane scrollmobil = new JScrollPane(tabel);
    JLabel judul, labelbrand, labelbrand2, labelbrand3, labeltype, labelwarna, labelharga, labeltype2, labelwarna2, labelharga2;
    JTextField textbrand, textbrand2, textbrand3, texttype, textwarna, textharga, texttype2, textwarna2, textharga2;
    JButton back, input, refresh, update, delete;

    public arya07227_GUIAdmin() {
        MenuAdmin.setSize(900, 600);
        MenuAdmin.setLayout(null);
        MenuAdmin.getContentPane().setBackground(Color.GREEN);

        judul = new JLabel("Data Mobil");
        judul.setFont(new Font("Times New Roman", Font.BOLD, 30));
        judul.setBounds(90, 30, 200, 30);
        MenuAdmin.add(judul);

        scrollmobil.setBounds(50, 80, 500, 350);
        tabel.setModel(datamobil.daftarmobil());
        MenuAdmin.add(scrollmobil);

        labelbrand = new JLabel("Brand Mobil");
        labelbrand.setBounds(600, 110, 100, 30);
        MenuAdmin.add(labelbrand);
        textbrand = new JTextField();
        textbrand.setBounds(600, 140, 100, 30);
        MenuAdmin.add(textbrand);

        labeltype = new JLabel("Type");
        labeltype.setBounds(600, 170, 100, 30);
        MenuAdmin.add(labeltype);
        texttype = new JTextField();
        texttype.setBounds(600, 200, 100, 30);
        MenuAdmin.add(texttype);

        labelwarna = new JLabel("warna");
        labelwarna.setBounds(600, 230, 100, 30);
        MenuAdmin.add(labelwarna);
        textwarna = new JTextField();
        textwarna.setBounds(600, 260, 100, 30);
        MenuAdmin.add(textwarna);

        labelharga = new JLabel("harga");
        labelharga.setBounds(600, 290, 100, 30);
        MenuAdmin.add(labelharga);
        textharga = new JTextField();
        textharga.setBounds(600, 320, 100, 30);
        MenuAdmin.add(textharga);

        input = new JButton("Input");
        input.setBounds(600, 400, 100, 30);
        input.setFont(new Font("Arial", Font.BOLD, 15));
        input.setBackground(Color.CYAN);
        MenuAdmin.add(input);

        labelbrand2 = new JLabel("Brand Mobil");
        labelbrand2.setBounds(750, 110, 100, 30);
        MenuAdmin.add(labelbrand2);
        textbrand2 = new JTextField();
        textbrand2.setBounds(750, 140, 100, 30);
        MenuAdmin.add(textbrand2);

        labeltype2 = new JLabel("Type");
        labeltype2.setBounds(750, 170, 100, 30);
        MenuAdmin.add(labeltype2);
        texttype2 = new JTextField();
        texttype2.setBounds(750, 200, 100, 30);
        MenuAdmin.add(texttype2);

        labelwarna2 = new JLabel("warna");
        labelwarna2.setBounds(750, 230, 100, 30);
        MenuAdmin.add(labelwarna2);
        textwarna2 = new JTextField();
        textwarna2.setBounds(750, 260, 100, 30);
        MenuAdmin.add(textwarna2);

        labelharga2 = new JLabel("harga");
        labelharga2.setBounds(750, 290, 100, 30);
        MenuAdmin.add(labelharga2);
        textharga2 = new JTextField();
        textharga2.setBounds(750, 320, 100, 30);
        MenuAdmin.add(textharga2);

        update = new JButton("update");
        update.setBounds(750, 400, 100, 30);
        update.setFont(new Font("Arial", Font.BOLD, 15));
        update.setBackground(Color.CYAN);
        MenuAdmin.add(update);

        labelbrand3 = new JLabel("brand");
        labelbrand3.setBounds(60, 430, 100, 30);
        MenuAdmin.add(labelbrand3);
        textbrand3 = new JTextField();
        textbrand3.setBounds(60, 460, 100, 30);
        MenuAdmin.add(textbrand3);

        delete = new JButton("Delete");
        delete.setBounds(200, 460, 100, 30);
        delete.setFont(new Font("Arial", Font.BOLD, 15));
        delete.setBackground(Color.CYAN);
        MenuAdmin.add(delete);

        back = new JButton("Back");
        back.setBounds(100, 520, 80, 30);
        back.setFont(new Font("Arial", Font.BOLD, 15));
        back.setBackground(Color.CYAN);
        MenuAdmin.add(back);

        refresh = new JButton("Refresh");
        refresh.setBounds(700, 520, 100, 30);
        refresh.setFont(new Font("Arial", Font.BOLD, 15));
        refresh.setBackground(Color.CYAN);
        MenuAdmin.add(refresh);

        MenuAdmin.setVisible(true);
        MenuAdmin.setLocationRelativeTo(null);
        MenuAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                MenuAdmin.dispose();
                arya07227_GUILogin gui = new arya07227_GUILogin();
            }
        });
        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String arya07227_brand = textbrand.getText();
                String arya07227_type = texttype.getText();
                String arya07227_warna = textwarna.getText();
                String arya07227_harga = textharga.getText();
                arya07227_AllObjectController.mobilController.insert(arya07227_brand, arya07227_type, arya07227_warna, arya07227_harga);
                JOptionPane.showMessageDialog(null, "Data Telah di Inputkan", "information", JOptionPane.INFORMATION_MESSAGE);
                kosong();
            }
        });
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String newArya07227_type = texttype2.getText();
                String newArya07227_warna = textwarna2.getText();
                String newArya07227_harga = textharga2.getText();
                arya07227_AllObjectController.mobilController.updatemobil(textbrand2.getText(), newArya07227_type, newArya07227_warna, newArya07227_harga);
                JOptionPane.showMessageDialog(null, "Data Telah Diperbarui", "information", JOptionPane.INFORMATION_MESSAGE);
                kosong();
            }
        });
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    arya07227_AllObjectController.mobilController.hapusMobil(textbrand3.getText());
                    JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus", "information", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Barang Tidak Tersedia", "information", JOptionPane.INFORMATION_MESSAGE);

                }

            }
        });
        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                arya07227_GUIAdmin admin = new arya07227_GUIAdmin();
                MenuAdmin.dispose();
            }
        });

    }

    void kosong() {
        textbrand.setText(null);
        texttype.setText(null);
        textwarna.setText(null);
        textharga.setText(null);
    }
}
