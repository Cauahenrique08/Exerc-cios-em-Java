/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cauah
 */
import javax.swing.JOptionPane;

public class ex2
        
{

  public static void main(String args[])
  {
   int comp,alt,larg,V;
   
   comp = Integer.parseInt(JOptionPane.showInputDialog
                            ("Insira o Comprimento: "));
   alt = Integer.parseInt(JOptionPane.showInputDialog
                            ("Insira a Altura: "));
   larg = Integer.parseInt(JOptionPane.showInputDialog
                            ("Insira a Largura: "));
   
   V = (comp * alt * larg);
   
   JOptionPane.showMessageDialog(null,"O volume do paralelepípedo é : "+V);
   
   
   
    
  }
    
}
