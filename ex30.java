/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/** Objetivo: Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
 *
 * @author Cauã Henrique
 */
import javax.swing.JOptionPane;

public class ex30 
{
    public static void main(String args[])
    {
        int x, maior,menor, aux,c;
        c = 0;
        menor = 0;
        maior = 0;
        
        while (c != 10)
        {
               x = Integer.parseInt(JOptionPane.showInputDialog
               ("Insira um número inteiro positivo: "));
           if (c == 0)
           { maior = x;
             menor = x;
             c++;
           }
           else
           {   if (x > maior)
               { maior = x;
               c++;
               }
               else 
               { if(x < menor)
                 { menor = x;
                 c++;
                 }
               
               }
           c++;
           }
        
        }
        JOptionPane.showConfirmDialog(null, "O menor valor é: "+menor+" O maior valor é: "+maior);
        
    }
    
}
