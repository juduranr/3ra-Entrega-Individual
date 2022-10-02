/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e10;

/**
 *
 * @author sebas
 */
public class Calculo {
    public static Double Matricula(Double Patrimonio, Double Estrato){
        Double pago = 50000.0;
        if (Patrimonio > 2000000 && Estrato > 3){
            pago += Patrimonio * 0.03;
        }
        return pago;
    }    
}
