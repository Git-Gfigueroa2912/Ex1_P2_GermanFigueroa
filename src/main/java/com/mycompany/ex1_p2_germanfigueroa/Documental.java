/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1_p2_germanfigueroa;

/**
 *
 * @author gafm2
 */
abstract class Documental extends Produccion{
    private String tema;
    private int meses_investigacion;
    
    Documental(String codigo, String titulo, int duracion, double presupuesto, String tema, int meses_investigacion){
        super(codigo, titulo, duracion, presupuesto);
        this.tema = tema;
        this.meses_investigacion = meses_investigacion;
    }
    @Override
    public double calcularCosto(){
        return getPresupuesto() + (meses_investigacion*1000);
    }
    @Override
    public boolean Destacado(){
        return meses_investigacion > 6;
    }
}
