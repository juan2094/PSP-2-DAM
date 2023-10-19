/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author Cala
 */

public class Empleado {
    
    int numero;
    String nombre;
    String fechaAlta;
    int sueldo;
    String puesto;
    
    public Empleado(int sueldo, String puesto){
    
           this.sueldo=sueldo;
           this.puesto=puesto;
           
    }

  
    
    public Empleado(int numero,String nombre,String fecha,int sueldo, String puesto){
        
        this(sueldo,puesto);
        this.numero=numero;
        this.nombre=nombre;
        this.fechaAlta=fecha;
        
        
    }
  public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   


    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    
    
    
    }
    
   

