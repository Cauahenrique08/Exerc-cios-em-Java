/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cauah
 */

import javax.swing.JOptionPane;

public class ex8 
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
