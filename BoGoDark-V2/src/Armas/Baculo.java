/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Armas;

/**
 *
 * @author familia velasco
 */
public class Baculo {
    public String nombre;
    public int damage;
    public int alcanze;
    public int velocidad;
    public int poder;
    
    public Baculo (){
    this.nombre="";
    this.damage=24;
    this.alcanze=15;
    this.velocidad=12;
    this.poder=28;
    
    
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getAlcanze() {
        return alcanze;
    }

    public void setAlcanze(int alcanze) {
        this.alcanze = alcanze;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
    
    
    
    
}
