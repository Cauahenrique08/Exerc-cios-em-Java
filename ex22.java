/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**Objetivo: Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
Venda Mensal	Preço Atual	Preço Novo
< 500	< 30	+ 10%
>= 500 e < 1000	>= 30 e < 80	+15%
>= 1000	>= 80	- 5%
Obs.: para outras condições, preço novo será igual ao preço atual.

 *
 * @author Cauã Henrique
 */
import javax.swing.JOptionPane;

public class ex22 
{
    public static void main(String[] args) 
    {
        double pa, vm;
      pa = Double.parseDouble(JOptionPane.showInputDialog
                    ("Insira o preço atual do produto"));
      vm = Double.parseDouble(JOptionPane.showInputDialog
                  (" Insira a média mensal do produto"));
      
      if (vm < 500 && pa < 30)
         { pa = pa + (pa*10 /100);
          JOptionPane.showConfirmDialog(null, "O novo preço do produto é: "+pa);
         }
      else
          if (vm>=500 && vm < 1000 && pa >= 30 && pa < 80)
             {  pa = pa + (pa*15 /100);
              JOptionPane.showConfirmDialog(null, "O novo preço do produto é: "+pa);
             }
          else
              if (vm >= 1000 && pa >= 80)
                 { pa = pa + (pa*5 /100);
                  JOptionPane.showConfirmDialog(null, "O novo preço do produto é: "+pa);
                 }
              else 
                  JOptionPane.showConfirmDialog(null, "O novo preço do produto é: "+pa);
      
    }
}
