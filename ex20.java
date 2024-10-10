/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *  Objetivo: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
 * @author Cauã Henrique 
 */

import javax.swing.JOptionPane;

public class ex20 
{
    public static void main(String[] args) 
    {
        int x, y;
        
        x = Integer.parseInt(JOptionPane.showInputDialog
                ("Insira o valor do primeiro número: "));
        y = Integer.parseInt(JOptionPane.showInputDialog
                ("Insira o valor do segundo  número: "));
        if (x > y)
        {  if (x % y == 0)
            { JOptionPane.showConfirmDialog(null, " O número "+x+" é um multiplo de "+y );
            }
           else
            { JOptionPane.showConfirmDialog(null, " O número "+x+" não é um multiplo de "+y );
            }
        }
        else
        {
          if (y > x)
          { if (y % x == 0)
            { JOptionPane.showConfirmDialog(null, " O número "+y+" é um multiplo de "+x );
            }
           else
            { JOptionPane.showConfirmDialog(null, " O número "+y+" não é um multiplo de "+x );
            }
              
          }
          else
          {JOptionPane.showConfirmDialog(null, " O número "+y+" é o mesmo que "+x );}
          
          
          
        }  
    }
    
}
