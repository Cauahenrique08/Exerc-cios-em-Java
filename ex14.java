/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/** Objetivo: 	Receba 2 valores reais. Calcule e mostre o maior deles.
 *
 * @author Cauã Henrique 
 */
import javax.swing.JOptionPane;
        
public class ex14 
{
    public static void main(String args[])
    {
     double x,y;
     x = Double.parseDouble(JOptionPane.showInputDialog
                            ("Insira o valor de x: "));
     y = Double.parseDouble(JOptionPane.showInputDialog
                            ("Insira o valor de y: "));
     if (x > y) 
     {
        JOptionPane.showConfirmDialog(null,"O maior valor é: "+ x);
     }
     else
         if (y > x)
         {
             JOptionPane.showConfirmDialog(null, "O maior valor é: "+y);
         }
        else
             JOptionPane.showConfirmDialog(null, " Não há diferença de valores entre os dois números");
    }
}
