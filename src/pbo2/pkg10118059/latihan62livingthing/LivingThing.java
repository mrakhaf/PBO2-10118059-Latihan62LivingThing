/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan62livingthing;

/**
 *
 * @author 
 * Nama : Muhammad Rakha Firdaus
 * NIM : 10118059
 * Kelas : IF-2
 * 
 */
public abstract class LivingThing {
    public abstract void walk(String nama);
    
    public void breath(String nama){
        System.out.println(nama + " sedang Bernafas");
    }
    
    public void eat(String nama){
        System.out.println(nama + " sedang Makan");
    }
    
}
