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
public class Espada 

{
   public String nombre;
   public int alcanze;
   public int damage;
   public int poder;
   public int velocidad;
   
   public Espada (){
   this.nombre="";
   this.alcanze=15;
   this.damage=30;
   this.poder=25;
   this.velocidad=20;
   
   
   
   
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAlcanze() {
        return alcanze;
    }

    public void setAlcanze(int alcanze) {
        this.alcanze = alcanze;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
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
