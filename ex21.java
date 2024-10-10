/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *  Objetivo:Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h.
 * @author Cauã Henrique 
 */
import javax.swing.JOptionPane;

public class ex21 
{
    public static void main(String[] args) 
    {
        double voltas, extensao, tempo, kmh;
        
        voltas = Double.parseDouble(JOptionPane.showInputDialog
                           ("Insira a quantidade de voltas: "));
        extensao = Double.parseDouble(JOptionPane.showInputDialog
               ("Insira a extensão do circuito: (em metros) "));
        tempo = Double.parseDouble(JOptionPane.showInputDialog
                               ("Insira o tempo de duração: (minutos) "));
        
        kmh = ((voltas * extensao)/1000);
        kmh = (kmh / tempo)* 60;
        
        JOptionPane.showConfirmDialog(null, " A velocidade média era de: "+kmh+"km/h");
        
        
    }
}
