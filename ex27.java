/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/** Objetivo: Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
 *
 * @author Cauã Henrique
 */
import javax.swing.JOptionPane;

public class ex27 
{
    public static void main(String[] args) 
    {
     int x, y,imp;
     imp = 0;
     x =Integer.parseInt(JOptionPane.showInputDialog
                    ("Insira um número inteiro: "));
     y =Integer.parseInt(JOptionPane.showInputDialog
                    ("Insira um número inteiro: "));
    
     if (x > y)
     {
         x--;
          while (x!=y)
          { x--;
            if (x%2 ==1)
            { imp = imp + x;
             
            }
            x--;
           
          }             
     }
     else
     {  
         if (y>x)
         { 
           while (y!=x)
           { y--;
             if (y%2 ==1)
             { imp = imp + y;
                
             }
             y--;
           
           }             
         }
     }
     
     JOptionPane.showConfirmDialog(null, "A soma entre os ímpares dos dois números é: "+imp);
    } 
}

