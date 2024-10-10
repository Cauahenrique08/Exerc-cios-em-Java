/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *  Objetivo: Receba um número inteiro. Calcule e mostre o seu fatorial.
 * @author Cauã Henrique 
 */
import javax.swing.JOptionPane;

public class ex24 
{
    public static void main(String[] args) 
    {
        int x, aux;
        aux = 1;
       x= Integer.parseInt(JOptionPane.showInputDialog
        ("Insira o valor do número a ser fatorado: "));
        
       while (x > 1)
       { aux = aux * x;
         x--;    
       }
       
       JOptionPane.showConfirmDialog(null,"O fatorial do número é: "+aux);
    }
}
