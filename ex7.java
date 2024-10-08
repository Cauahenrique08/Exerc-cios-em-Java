/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/** Objetivo: Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
 *
 * @author Cauã Henrique 
 */

import javax.swing.JOptionPane;

public class ex7 
{
    public static void main(String args[])
    {
    int nasc,idade;
    
    
    nasc = Integer.parseInt(JOptionPane.showInputDialog
                  ("Insira o seu ano de nascimento: "));
            
    idade = (2024 - nasc);
    
    JOptionPane.showConfirmDialog(null,"A sua idade é: "+idade + "\n Sua idade daqui 17 anos será: "+ (idade+17));
     
        
     
        
    }
    
}
