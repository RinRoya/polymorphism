/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfisme;

/**
 *
 * @author UMUM
 */
public class kendaraan {
    private String model;

    public kendaraan(String model) {
        this.model = model;
    }
    public void informasi(){
        System.out.println("Modul : " + model);
    }
    
}
