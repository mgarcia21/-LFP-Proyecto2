/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2j17;

import javax.swing.UIManager;

/**
 *
 * @author Oswaldo
 */
public class Proyecto2J17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        Interfaz interfaz = new Interfaz();
        interfaz.setVisible(true);
        
        
        
    }
    
}
