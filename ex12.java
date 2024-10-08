/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/** Objetivo: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
 *
 * @author cauah
 */
import javax.swing.JOptionPane;
        
public class ex12 
{
    public static void main(String args[])
    {
      int TDP, VM;
      double LG;
      
      TDP = Integer.parseInt(JOptionPane.showInputDialog
                        ("Insira o tempo de percurso: "));
      VM = Integer.parseInt(JOptionPane.showInputDialog
                         ("Insira a velocidade média: "));
      
      LG = ((TDP*VM)/12);
      
      JOptionPane.showConfirmDialog(null, "O Gasolina gasta foi de: "+ LG);
      
      
    }
    
}
