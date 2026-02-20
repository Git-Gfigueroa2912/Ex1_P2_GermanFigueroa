/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex1_p2_germanfigueroa;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author gafm2
 */
public class Ex1_P2_GermanFigueroa {
    public static Scanner entrada = new Scanner(System.in);
    public static ArrayList<Produccion> producciones = new ArrayList<>();
    
    public static void main(String[] args) {
        System.out.println("1. Mostrar Informacion");
        System.out.println("2. Costo Final");
        System.out.println("3. Es Destacable");
        System.out.println("Ingrese una opcion: ");
        int opcion = entrada.nextInt();
        entrada.nextLine();
        
        producciones.add(new Serie("D-01","Doctor Strange",40,13.45,6,8));
        producciones.add(new Serie("C90Q","Wicked",57,20.67,8,10));
        producciones.add(new Documental("QPE13","Nuestro Planeta",45,15.89,"Naturaleza",7));
        producciones.add(new Documental("WSA2459","Casos",34,16.78,"Asesinos",9));
        
        switch(opcion){
            
            case 1:
                mostrarProduccion();
                break;
        }
    }
    public static void mostrarProduccion(){
        for(Produccion p : producciones){
            System.out.println(p);
        }
    }
    public static void costoFinal(){
        System.out.println("Ingrese el codigo: ");
        String codigo_costo = entrada.nextLine();
        boolean encontradoCosto = false;
        for(Produccion p : producciones){
            if(p.getCodigo().equalsIgnoreCase(codigo_costo)){
                System.out.println("El costo final es: " +p.getTitulo() + " es : $ " +p.calcularCosto());
                encontradoCosto = true;
            }else{
                System.out.println("No se encontro");
            }
        }
    }
}
