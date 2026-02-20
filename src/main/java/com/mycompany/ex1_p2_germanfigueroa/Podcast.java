/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1_p2_germanfigueroa;

/**
 *
 * @author gafm2
 */
abstract class Podcast extends Produccion{
    private int episodios;
    private boolean invitadosInternacionales;
    
    Podcast(String codigo, String titulo, int duracion, double presupuesto, int episodios, boolean invitadosInternacionales){
        super(codigo, titulo, duracion, presupuesto);
        this.episodios = episodios;
        this.invitadosInternacionales = invitadosInternacionales;
    }
    @Override
    public double calcularCosto(){
        return getPresupuesto() + (episodios*300);
    }
    public boolean Destacado(){
        return invitadosInternacionales;
    }
}
