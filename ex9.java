/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**   Objetivo: Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
 *
 * @author Cauã Henrique 
 */

import javax.swing.JOptionPane;

public class ex9 
{
   public static void main (String args[])
   {
     double ang1, ang2, ang3;
     
     ang1 = Double.parseDouble(JOptionPane.showInputDialog
                   ("Insira o valor do primeiro ângulo: "));
     ang2 = Double.parseDouble(JOptionPane.showInputDialog
                    ("Insira o valor do segundo ângulo: "));
     
     if ((ang1+ang2) != 180)
        ang3 = (180-ang1-ang2);
     else 
        ang3 = 0;
     
     JOptionPane.showConfirmDialog(null, "O valor do terceiro ângulo do triângulo é: "+ang3);
                
       
   }
}
