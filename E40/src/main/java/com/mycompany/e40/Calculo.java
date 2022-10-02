/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e40;

/**
 *
 * @author sebas
 */
public class Calculo {
    public static Double calcularRaiz(Double num){
        Double resultado=Math.sqrt(num);
        return resultado;
    }
    public static Double calcularCuadrado(Double num){
        Double resultado=Math.pow(num,2);
        return resultado;
    }
    public static Double calcularCubo(Double num){
        Double resultado=Math.pow(num,3);
        return resultado;
    }
}
