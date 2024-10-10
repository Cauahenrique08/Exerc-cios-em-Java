/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/** Objetivo: Calcule e mostre o quadrado dos números entre 10 e 150.
 *
 * @author Cauã Henrique
 */
import javax.swing.JOptionPane;
        
public class ex23 
{
    public static void main(String[] args) 
    {
      double x, y;
      
      x = 10;
      y = 150;
              
      x = Math.pow(x, 2);
      y = Math.pow(y, 2);
      
      JOptionPane.showConfirmDialog(null, "O quadrado de 10 é "+x+ " e o quadrado de 150 é "+y);
    }
    
}
