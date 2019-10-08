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
public class Main {
    public static void main(String[] args) {
        kendaraan p;
        pesawat psw = new pesawat("Boing 707", "Pesawat komersial");
        mobil mbl1 = new mobil("Toyota Kijang", "Jeep");
        mobil mbl2 = new mobil("Suzuki Baleno", "Sedan");
        mobil mbl3 = new mobil("VW Combi");
        kapal kpl = new kapal("Queen Mary 2", "Kapal Pesiar");
        
        p = psw;
        p.informasi();
        p = mbl1;
        p.informasi();
        p = mbl2;
        p.informasi();
        p = mbl3;
        p.informasi();
        p = kpl;
        p.informasi();
    }
}
