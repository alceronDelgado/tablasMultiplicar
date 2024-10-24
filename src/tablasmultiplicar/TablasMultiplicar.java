/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablasmultiplicar;

/**
 *
 * @author lalej
 */
import javax.swing.*;
public class TablasMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int valor;
        String tablas="";
        
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de tablas que deseas visualizar"));
        
        for(int i = 1; i <= valor; i++){
            for(int j = 1;j < 11;j++){
                tablas += "\n"+i+"X"+j+" = "+(i * j);
            }
        }
        
        JOptionPane.showMessageDialog(null, tablas);
    }
    
}
