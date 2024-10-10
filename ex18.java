/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**   Objetivo: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.
 *
 *   @author  Cauã Henrique 
 */
import javax.swing.JOptionPane;

public class ex18 
{
    public static void main(String args[])
    {
      double a,b,c,d;
     a = Double.parseDouble(JOptionPane.showInputDialog
                               ("Insira um número: "));
       do 
       {b = Double.parseDouble(JOptionPane.showInputDialog
                               ("Insira um número maior que "+a ));
       } while (b<=a);
       
       do 
       {c = Double.parseDouble(JOptionPane.showInputDialog
                               ("Insira um número maior que"+b));
       } while (c<=b);
       
       d = Double.parseDouble(JOptionPane.showInputDialog
                       ("Insira um número aleatório: "));
       
       if (d>c)
       { JOptionPane.showConfirmDialog(null,"A Ordem dos números é: "+a+" , "+b+" , "+c+ " , "+d);}
       
       else
           if (d<c && d>b)
            { JOptionPane.showConfirmDialog(null,"A Ordem dos números é: "+a+" , "+b+" , "+d+ " , "+c);}
           else
               if (d<b && d>a)
                   { JOptionPane.showConfirmDialog(null,"A Ordem dos números é: "+a+" , "+d+" , "+b+ " , "+c);}
               else
                   { JOptionPane.showConfirmDialog(null,"A Ordem dos números é: "+d+" , "+a+" , "+b+ " , "+c);}
    } 
}
