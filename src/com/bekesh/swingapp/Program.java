/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bekesh.swingapp;

import com.bekesh.swingapp.UI.BrowserUI;
import com.bekesh.swingapp.UI.LaptopUI;
import com.bekesh.swingapp.UI.UserInterface;
import com.bekesh.swingapp.dao.LaptopDAO;
import com.bekesh.swingapp.dao.impl.laptopDAOImpl;
import com.bekesh.swingapp.entity.Laptop;


/**
 *
 * @author bekesh
 */
public class Program {
    
    public static void main(String[] args){
     LaptopDAO ld=new laptopDAOImpl();
        LaptopUI lt=new LaptopUI();
       
    }
}
   
   
   