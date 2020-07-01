/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagen;

import java.awt.Image;
import javax.swing.*;

/**
 *
 * @author Notebook
 */
public class Imagen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        ImageIcon iconoOriginal = new ImageIcon("src/img/icon.png");
        Image nuevaImagen = iconoOriginal.getImage();
        Image imgModificada = nuevaImagen.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        ImageIcon iconoNuevo = new ImageIcon(imgModificada);
        
        JOptionPane.showMessageDialog(null, "Este es un mensaje ejemplo con imagen ", "Imagen", JOptionPane.INFORMATION_MESSAGE, iconoNuevo);
        
    }
    
}
