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
public class Escudo {
    
   public String nombre;
   public int defense;
   public int damage;
   public int poder;
   public int velocidad;
   
   
   public Escudo(){
   this.nombre="";
   this.defense=40;
   this.poder=10;
   this.damage=13;
   this.velocidad=8;
   
   
   
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getDaño() {
        return damage;
    }

    public void setDaño(int daño) {
        this.damage = daño;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    
}
