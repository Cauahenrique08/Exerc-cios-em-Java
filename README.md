/** Objetivo: Receber os valores em x e y e efetuar a troca de seus valores e mostrar seus conteúdos.
 *  
 *  @author Cauã Henrique 
 */

import javax.swing.JOptionPane;

public class ex6       
{
    public static void main (String args[])
    {
    int X,Y,Z;
    
    X = Integer.parseInt(JOptionPane.showInputDialog
                                 ("Insira o Valor de X"));
    
    Y = Integer.parseInt(JOptionPane.showInputDialog
                                 ("Insira o valor de Y"));
    
    Z = X;
    X = Y;
    Y = Z;
    
          JOptionPane.showMessageDialog(null,"O valor de X é: "+X);
          JOptionPane.showMessageDialog(null,"O valor de Y é: "+Y);
            
    }

}
