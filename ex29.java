/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/** Objetivo: Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
 *
 * @author Cauã Henrique
 */
import javax.swing.JOptionPane;

public class ex29 
{
    public static void main(String args[])
    {
        int x, aux,aux1, c, total;
        
       
        total = 0;
        aux= 0;
        aux1 = 1;
        c = 0;
        x = Integer.parseInt(JOptionPane.showInputDialog
                         ("Insira um valor inteiro: "));
        
        while (c != x)
                { total =(aux + aux1);
                aux1 = aux;
                aux = total;
                c++;           
                }
        JOptionPane.showConfirmDialog(null,"O valor da sequência é: "+ total);
         
    }
}
