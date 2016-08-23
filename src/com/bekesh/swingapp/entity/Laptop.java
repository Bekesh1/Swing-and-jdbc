/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bekesh.swingapp.entity;

/**
 *
 * @author bekesh
 */
public class Laptop {
    private int id;
    private String name;
    private int price;
    private int size;

    public Laptop() {
    }

    public Laptop(int id, String name, int price, int size) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int Price) {
        this.price = Price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}
