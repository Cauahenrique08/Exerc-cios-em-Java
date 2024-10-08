/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**  Objetivo: 21.	Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
a.	Se a média for >= 6,0 exibir “APROVADO”;
b.	Se a média for >= 3,0 ou  < 6,0 exibir “EXAME”;
c.	Se a média for < 3,0 exibir “RETIDO”.

 * @author Cauã Henrique 
 */
import javax.swing.JOptionPane;
        
public class ex16 
{
    public static void main(String args[])
    {
        int a,b,c,d;
        double m;
     a = Integer.parseInt(JOptionPane.showInputDialog
                        ("Insira a primeira nota: "));
     b = Integer.parseInt(JOptionPane.showInputDialog
                        ("Insira a segunda nota: "));
     c = Integer.parseInt(JOptionPane.showInputDialog
                        ("Insira a terceira nota: "));
     d = Integer.parseInt(JOptionPane.showInputDialog
                        ("Insira a quarta nota: "));
     m = ((a+b+c+d)/4);
     
     if (m >= 6)
     { JOptionPane.showConfirmDialog(null, "Aprovado");  
     }
     else
         if (m < 6 && m >= 3)
         {
          JOptionPane.showConfirmDialog(null, "Exame");    
         }
         else
          JOptionPane.showConfirmDialog(null, "Retido"); 
                 
         
    }
}
