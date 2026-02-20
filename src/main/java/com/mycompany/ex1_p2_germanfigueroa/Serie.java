/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1_p2_germanfigueroa;

/**
 *
 * @author gafm2
 */
class Serie extends Produccion{
    private int temporadas;
    private int episodios;
    
    Serie(String codigo, String titulo, int duracion, double presupuesto, int temporadas, int episodios){
        super(codigo, titulo, duracion, presupuesto);
        this.temporadas = temporadas;
        this.episodios = episodios;
    }
    @Override
    public double calcularCosto(){
        return getPresupuesto() +(episodios*500);
    }
    @Override
    public boolean Destacado(){
        return temporadas > 3;
    }
}
