/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cauah
 */

import javax.swing.JOptionPane;

public class ex9 
{
   public static void main (String args[])
   {
    int x,y,soma;
    
    
    x = Integer.parseInt(JOptionPane.showInputDialog
                     ("Insira um valor inteiro: "));
    y = Integer.parseInt(JOptionPane.showInputDialog
                     ("Insira um valor inteiro: "));
   x = (x * x);
   y = (y * y);
   
   soma = (x + y);
   
   JOptionPane.showMessageDialog(null,"O valor da soma dos quadrados é: "+soma);
        
   }
    
}
