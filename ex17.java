/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**  Objetivo: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 *
 * @author Cauã henrique
 */

import javax.swing.JOptionPane;

public class ex17 
{
    public static void main(String args[])
    {
      int x, y;
      
       x = Integer.parseInt(JOptionPane.showInputDialog
                       ("Insira um número inteiro: "));
       do 
         {y = Integer.parseInt(JOptionPane.showInputDialog
                       ("Insira um número inteiro diferente do primeiro: "));
         } 
       while (y == x);
       if (x>y)
         { JOptionPane.showConfirmDialog(null, "A Ordem é: "+y+","+x);
         }
         else
          JOptionPane.showConfirmDialog(null,"A Ordem é: "+x+","+y);
       
    }
}
