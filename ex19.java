/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**  Objetivo: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
 *
 * @author Cauã Henrique 
 */
import javax.swing.JOptionPane;
        
public class ex19 
{
  public static void main(String args[])
  {
    int x;
    
    x = Integer.parseInt(JOptionPane.showInputDialog
                        ("Insira um número inteiro"));
    if (x%2 == 0)
     { if (x%3 == 0)
        { JOptionPane.showConfirmDialog(null, "O número é divisível por 2 e 3");
        }
       else
         JOptionPane.showConfirmDialog(null, "O número é divisível por 2 mas não por 3");
     }
    else
        if (x%3 == 0)
        {JOptionPane.showConfirmDialog(null, "O número não é divisível por 2 mas é divisível por 3");
        }
        else
            {JOptionPane.showConfirmDialog(null, "O número não é divisível por 2 nem por 3");}
   }     
}
