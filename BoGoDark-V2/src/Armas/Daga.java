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
public class Daga {
    
    private String nombre;
    private int damage;
    private int alcanze;
    private int velocidad;
    private int poder;
    
    public Daga(){
        this.nombre= "";
        this.damage=18;
        this.velocidad=35;
        this.alcanze=8;
        this.poder=20;
    
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
