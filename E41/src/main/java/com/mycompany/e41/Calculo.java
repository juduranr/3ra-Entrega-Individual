/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e41;
import java.util.List;

/**
 *
 * @author sebas
 */
public class Calculo {
    public static Double hallarMayor(List<Double> lista){
        Double Mayor = lista.get(0);
        for (Double num : lista){
            if (num > Mayor){
                Mayor = num;
            }
        }
        return Mayor;
    }
}
