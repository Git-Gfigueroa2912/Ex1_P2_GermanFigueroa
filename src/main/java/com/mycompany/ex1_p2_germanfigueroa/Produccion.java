/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1_p2_germanfigueroa;

/**
 *
 * @author gafm2
 */
abstract class Produccion {
    private String codigo;
    private String titulo;
    private int duracion;
    private double presupuesto;
    
    Produccion(String codigo, String titulo, int duracion, double presupuesto){
        this.codigo = codigo;
        this.titulo = titulo;
        this.duracion = duracion;
        this.presupuesto = presupuesto;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
    public abstract double calcularCosto();
    
    public abstract boolean Destacado();
    
    @Override
    
    public String toString(){
        return "Codigo: " + codigo + ", Titulo: " + titulo + ", Duracion: " + duracion + ", Presupuesto: " +presupuesto;
    }
}
