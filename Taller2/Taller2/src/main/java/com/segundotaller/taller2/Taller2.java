/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.segundotaller.taller2;
import javax.swing.JOptionPane;
import java.math.*;

/**
1.	Realice un programa que permita ingresar 4 números y realice su multiplicación.
2.	Realice un programa que permita dividir 3 números y de su resultado.
3.	Realice un programa que permita calcular la potencia al cuadrado de un número. 
        Este ejercicio se debe utilizar la librería Math de Java con lo cual debe investigar su 
        funcionamiento y el como aplicarlo dejando explicado con sus palabras como aplicarlo.
*/
public class Taller2 {

    public static void main(String[] args) {
    
//      int number1, number2, number3, number4;
//      
//      number1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer número"));
//      number2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo número"));
//      number3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tercer número"));
//      number4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuarto número"));
//      int multiplicación = number1 * number2 * number3 * number4;
//      int división = number2 / number4 / number1;
//      String respuesta = 
//              "Total Multiplicación: " + multiplicación + "\n" +
//              "Total División: " + división;
//      
//      JOptionPane.showMessageDialog(null, respuesta);
    
        String numero1, numero2;
        double base, exponente, resultado;
        JOptionPane.showMessageDialog(null, "Potencia");
        numero1 = JOptionPane.showInputDialog("Igrese base");
        base = Double.parseDouble(numero1);
        numero2 = JOptionPane.showInputDialog("Ingrese exponente");
        exponente = Double.parseDouble(numero2);
        resultado = Math.pow(base, exponente);
        JOptionPane.showMessageDialog(null,"El resultado es " + resultado);
        
        
  
        
        
        
        
    }
}
