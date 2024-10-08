/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**  Objetivo: Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
 *
 *   @author Cauã Henrique 
 */

import javax.swing.JOptionPane;

public class ex8 
{
    public static void main(String args[])
    {
      int x=0;
      double comida;
      
      comida = Double.parseDouble(JOptionPane.showInputDialog
              ("Insira a quantidade de comida e quilos: "));
      
      while (comida >= 0.050)
           {
            comida = (comida - 0.050); 
            x = (x+1);
           }
      
      JOptionPane.showConfirmDialog(null,"A quantidade de dias que durará esse alimento é: "+x);
      
        
    }
}
