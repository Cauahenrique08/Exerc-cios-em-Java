/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cauah
 */

import javax.swing.JOptionPane;

public class ex12 
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
