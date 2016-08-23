/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bekesh.swingapp.dao;

import com.bekesh.swingapp.entity.Laptop;
import java.sql.SQLException;

/**
 *
 * @author bekesh
 */
public interface LaptopDAO {
    int insert(Laptop laptop)throws ClassNotFoundException,SQLException;
}
