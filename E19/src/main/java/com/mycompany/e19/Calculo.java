/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e19;

/**
 *
 * @author sebas
 */
public class Calculo {
    public static Double calcularPerimetro(Double Lado){
        Double resultado=Lado*3;
        return resultado;
    }
    public static Double calcularAltura(Double Lado){
        Double resultado=(Math.pow(Lado,2)*Math.sqrt(3))/4;
        return resultado;
    }
    public static Double calcularArea(Double Lado){
        Double resultado = (Lado*Math.sqrt(3)) / 2;
        return resultado;
    }
}
