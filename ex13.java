/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/** Objetivo:  	Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.
 *
 * @author Cauã Henrique
 */
import javax.swing.JOptionPane;

public class ex13
{
    public static void main(String args[])
    {
      double x, y, z;
      
      x = Double.parseDouble(JOptionPane.showInputDialog
                               ("Insira o valor de x: "));
      y = Double.parseDouble(JOptionPane.showInputDialog
                               ("Insira o valor de y: "));
      
      if (x > y)
      {  z = x - y;  
      }
         else
           if (y > x)
           {  z = y - x;  
           }
           else
              z = 0;
      
      JOptionPane.showConfirmDialog(null,"O valor da diferença entre os valores é: "+z);
      
    }
}
