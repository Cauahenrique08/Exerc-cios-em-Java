/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**  Objetivo: Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
 *
 * @author     Cauã Henrique 
 */

import javax.swing.JOptionPane;

public class ex6 
{
   public static void main (String args[])
   {
     int raio;
     double circ;
     
     raio = Integer.parseInt(JOptionPane.showInputDialog
          ("Insira o valor do raio da circunferência: "));
     
     circ = (2 * 3.14 * raio);
     
     JOptionPane.showConfirmDialog(null,"O valor da circunferência é: "+circ);
     
       
      
   }
}
