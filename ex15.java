/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**  Objetivo: Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
 *
 * @author Cauã Henrique 
 */
import javax.swing.JOptionPane;

public class ex15 
{
    public static void main(String args[])
    {
     int a,b,c;
     double Delta, x1, x2;
     a = Integer.parseInt(JOptionPane.showInputDialog
                          ("Insira o valor de A: "));
     b = Integer.parseInt(JOptionPane.showInputDialog
                          ("Insira o valor de B: "));
     c = Integer.parseInt(JOptionPane.showInputDialog
                          ("Insira o valor de C: "));
     
     Delta = (Math.pow(b, 2)) - 4 * a * c;
     
     if (Delta >= 0)
     {
       x1 = (-b + Math.sqrt(Delta))/ 2 * a;
       x2 = (-b - Math.sqrt(Delta))/ 2 * a;
       
       JOptionPane.showConfirmDialog(null,"O valor das raízes são: "+x1+" , "+x2);
     }
     else
         JOptionPane.showConfirmDialog(null," Não existe raíz da expressão");
     
     
    
    }
    
}
