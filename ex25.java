/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**  Objetivo:  Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 *
 * @author Cauã Henrique
 */
import javax.swing.JOptionPane;

public class ex25 
{
  public static void main(String args[])
  {
      int x;
      double soma, aux;
      soma = 0;
      aux = 1;
      
      x = Integer.parseInt(JOptionPane.showInputDialog
                      ("Insira um número inteiro: "));
      do 
      {  soma = soma + (1/aux);
         aux++;   
      }
      while(aux <= x);
      
      JOptionPane.showConfirmDialog(null,"O valor da serie com o número é: "+soma);
      
      
  }
}
