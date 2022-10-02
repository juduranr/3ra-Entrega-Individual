/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e18;

/**
 *
 * @author sebas
 */
public class Trabajador {
    public static Double calculoSB(Double Horas, Double Valor){
        Double salarioBruto=Horas*Valor;
        return salarioBruto;
    }
    public static Double calculoSN(Double salarioBruto, Double Fuente){
        Double resultado=salarioBruto-(salarioBruto*Fuente);
        return resultado;
    }
}
