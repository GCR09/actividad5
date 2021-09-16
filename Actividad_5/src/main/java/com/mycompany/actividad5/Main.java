/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividad5;

/**
 *
 * @author Cortez Ramos
 */
public class Main {
    public static void main(String[] args) {
        int x = 15;
        int y = 10;
        
        // Suma:
        // En la variable "suma" se guarda el resultado 
        // de la suma entre los valores de las variables "x" y "y"
        int suma = x+y;

        // Resta:
        // En la variable "resta" se guarda el resultado 
        // de la resta entre los valores de las variables "x" y "y"
        int resta = x-y;

        // Multiplicacion:
        // En la variable "multiplicacion" se guarda el resultado 
        // de la multiplicacion entre los valores de las variables "x" y "y"
        int multiplicacion = x*y;

        // Division:
        // En la variable "division" se guarda el resultado 
        // de la division entre los valores de las variables "x" y "y"
        double division = (double) x/y;

        // Modulo:
        // En la variable "modulo" se guarda el reciduo
        // de la division entre los valores de las variables "x" y "y"
        double modulo = x%y;
        
        //Se imprime el valor que contiene la varible "suma"
        System.out.println("Suma entre " + x + " y " + y + "= "+suma);
        //Se imprime el valor que contiene la varible "resta"
        System.out.println("Resta entre " + x + " y " + y + "= "+resta);
        //Se imprime el valor que contiene la varible "multiplicacion"
        System.out.println("Multiplicacion entre " + x + " y " + y + "= "+multiplicacion);
        //Se imprime el valor que contiene la varible "division"
        System.out.println("Division entre " + x + " y " + y + "= "+division);
        //Se imprime el valor que contiene la varible "modulo"
        System.out.println("Residuo de la division entre " + x + " y " + y + "= "+modulo);
    }
}
