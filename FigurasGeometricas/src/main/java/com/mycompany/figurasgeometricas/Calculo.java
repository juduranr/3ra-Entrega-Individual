/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author sebas
 */
public class Calculo {
    public static Double areaCirculo(Double Radio) {
        return Math.PI*Math.pow(Radio,2);
    }
    public static Double diametroCirculo(Double Radio) {
        return 2*Math.PI*Radio;
    }
    public static Double areaRectangulo(Double Base, Double Altura) {
        return Base * Altura;
        }
    public static Double perimetroRectangulo(Double Base, Double Altura) {
        return (2 * Base) + (2 * Altura);
        }
    public static Double areaCuadrado(Double Lado) {
        return Lado*Lado;
        }
    public static Double perimetroCuadrado(Double Lado) {
        return (4*Lado);
        }
    public static Double areaTriangulo(Double Base, Double Altura) {
        return (Base * Altura / 2);
        }
    public static Double hipotenusaTriangulo(Double Base, Double Altura) {
        return Math.pow(Base*Base + Altura*Altura, 0.5);
        }
    public static Double perimetroTriangulo(Double Base, Double Altura, Double Hipotenusa) {
        return (Base + Altura + Hipotenusa);
        }   
}
