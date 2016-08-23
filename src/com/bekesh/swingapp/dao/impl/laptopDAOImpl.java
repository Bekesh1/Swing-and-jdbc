/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bekesh.swingapp.dao.impl;

import com.bekesh.swingapp.dao.LaptopDAO;
import com.bekesh.swingapp.entity.Laptop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



/**
 *
 * @author bekesh
 */
public class laptopDAOImpl implements LaptopDAO {
    
    @Override
    public int insert(Laptop laptop) throws ClassNotFoundException, SQLException {
      Class.forName("com.mysql.jdbc.Driver");
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/bekesh_leapfrog", "root", "");
        String sql="INSERT INTO Laptop(name,price,size)values(?,?,?)";
        PreparedStatement stmt=connection.prepareStatement(sql);
        stmt.setString(1, laptop.getName());
        stmt.setInt(2, laptop.getPrice());
        stmt.setInt(3, laptop.getSize());
        int result=stmt.executeUpdate();
        connection.close();
        return result;
    }
    
    
}
