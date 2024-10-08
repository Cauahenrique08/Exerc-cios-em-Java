/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/** Objetivo:	Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
 *
 * @author     Cauã Henrique 
 */

import javax.swing.JOptionPane;

public class ex11 
{
    public static void main(String args[])
    {
     double HT, VH, PD, ND, SLR;
     
     HT = Double.parseDouble(JOptionPane.showInputDialog
                     ("Insira as horas trabalhadas: "));
     VH = Double.parseDouble(JOptionPane.showInputDialog
               ("Insira o valor da hora trabalhada: "));
     PD = Double.parseDouble(JOptionPane.showInputDialog
                 ("Insira o percentual de desconto: "));
     ND = Double.parseDouble(JOptionPane.showInputDialog
                 ("Insira o número de descendentes: "));
     
     SLR = (HT * VH);
     SLR = SLR - (SLR * PD / 100);
     SLR = SLR + (100 * ND);
     
     JOptionPane.showConfirmDialog(null," O valor do salário a receber é: "+SLR);
     
                
                
        
    }
    
}
