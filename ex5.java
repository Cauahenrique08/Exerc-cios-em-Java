/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/** Objetivo: 	Receba 2 números reais. Calcule e mostre a diferença desses valores.
 *
 * @author      Cauã Henrique 
 */

import javax.swing.JOptionPane;

public class ex5 
{
   public static void main (String args[])
   {
     double x,y, R;
     
     x = Double.parseDouble(JOptionPane.showInputDialog
                           ("Insira um número real: "));
     y = Double.parseDouble(JOptionPane.showInputDialog
                         ("Insira outro número real: "));
     
     if (x > y)
     { 
       R = (x - y);
       JOptionPane.showMessageDialog(null,"A diferença entre os dois valores é: "+R);
     }
    else
     {
       R = (y - x);
       JOptionPane.showMessageDialog(null,"A diferença entre os dois valores é: "+R);
     }
     
         
   }

}
