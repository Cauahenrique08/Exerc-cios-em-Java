/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**  Objetivo: Receba um número. Calcule e mostre os resultados da tabuada desse número.
 *
 * @author Cauã Henrique 
 */
import javax.swing.JOptionPane;

public class ex26 
{
    public static void main(String[] args) 
    {
        int x, aux; 
        aux = 0;
        
        x = Integer.parseInt(JOptionPane.showInputDialog
                         ("Insira um número inteiro: "));
        String mostra="";
        while (aux <= 10)
        { 
            mostra+= ("\nvalor "+ x * aux);
            aux++; 
        }
        JOptionPane.showMessageDialog(null,mostra);
    }
}
