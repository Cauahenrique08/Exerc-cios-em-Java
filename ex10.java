/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/** Objetivo: 	Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
 *
 * @author      Cauã Henrique 
 */

import javax.swing.JOptionPane;
public class ex10 
{
    public static void main(String args[])
    {
      double cat1, cat2, hip;
      
      cat1 = Double.parseDouble(JOptionPane.showInputDialog
                    ("Insira o valor do primeiro cateto: "));
      cat2 = Double.parseDouble(JOptionPane.showInputDialog
                    ("Insira o valor do primeiro cateto: "));
      
      cat1= (cat1 * cat1);
      cat2= (cat2 * cat2);
      
      hip = (cat1+cat2);
      hip = Math.sqrt(hip);
      
      JOptionPane.showConfirmDialog(null,"O valor da hipotenusa é: "+hip);
       
    }
    
}
