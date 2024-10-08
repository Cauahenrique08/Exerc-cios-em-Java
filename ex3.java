/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**  Objetivo: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
 *
 * @author Cauã Henrique 
 */

import javax.swing.JOptionPane;

public class ex3 
{
    
public static void main (String args[])
  {
    int x=0;
    double valor ,ajuste;
    
    
   valor = Integer.parseInt(JOptionPane.showInputDialog
                      ("Insira o valor a ser aplicado: "));
   ajuste = Double.parseDouble(JOptionPane.showInputDialog
                        ("Insira os meses de aplicação:"));
   
   do  {
       valor = (valor + (valor * 0.013)) ; 
       x++;
       }
   while(x != ajuste);
   
  JOptionPane.showMessageDialog(null,"O valor ajustado é: "+valor);
       
           
  
   
   
    
    

        
  }   



}
