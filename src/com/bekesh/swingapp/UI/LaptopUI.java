/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bekesh.swingapp.UI;

import com.bekesh.swingapp.dao.LaptopDAO;
import com.bekesh.swingapp.dao.impl.laptopDAOImpl;
import com.bekesh.swingapp.entity.Laptop;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author bekesh
 */
public class LaptopUI extends JFrame {

    private JLabel lblLaptopName;
    private JTextField txtLaptopName;
    private JLabel lblPrice;
    private JTextField txtPrice;
    private JLabel lblSize;
    private JTextField txtSize;
    private JButton btnSave;

    public LaptopUI() {
        setTitle("Laptop");
        setSize(500, 500);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        setVisible(true);
    }

    private void initComponents() {
        lblLaptopName = new JLabel("laptop name:");
        txtLaptopName = new JTextField(30);
        lblPrice = new JLabel("Laptop price");
        txtPrice = new JTextField(30);
        lblSize = new JLabel("Laptop size");
        txtSize = new JTextField(35);
        btnSave=new JButton("Save");
        
        
        add(lblLaptopName);
        add(txtLaptopName);
        add(lblPrice);
        add(txtPrice);
        add(lblSize);
        add(txtSize);
        add(btnSave);
        
        btnSave.addActionListener(new SaveButtonListener());
        
        }
    private void clearFields(){
          txtLaptopName.setText("");
          txtPrice.setText("");
          txtSize.setText("");
    }
    private class SaveButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            LaptopDAO laptopDAO=new laptopDAOImpl();
            Laptop l=new Laptop();
            l.setName(txtLaptopName.getText());
            l.setPrice(Integer.parseInt(txtPrice.getText()));
            l.setSize(Integer.parseInt(txtPrice.getText()));
            try{
            laptopDAO.insert(l);
             JOptionPane.showMessageDialog(null, "laptop added successfully");
            }catch(ClassNotFoundException| SQLException le){
                JOptionPane.showMessageDialog(null, le.getMessage());
            
        }
        }
        
    }
}