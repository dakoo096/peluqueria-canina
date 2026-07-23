package com.mycompany.peluqueriacanina;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.mycompany.peluqueriacanina.igu.Principal;
import javax.swing.UIManager;
import java.awt.Font;

public class PeluqueriaCanina {

    public static void main(String[] args) {
        try {
            // Configurar el tema FlatLaf moderno
            FlatMacLightLaf.setup();
            
            // Personalización de bordes redondeados y estilo visual global
            UIManager.put("Button.arc", 16);
            UIManager.put("Component.arc", 12);
            UIManager.put("TextComponent.arc", 12);
            UIManager.put("ProgressBar.arc", 12);
            UIManager.put("Component.focusWidth", 2);
            UIManager.put("ScrollBar.thumbArc", 999);
            UIManager.put("ScrollBar.thumbInsets", new java.awt.Insets(2, 2, 2, 2));
            UIManager.put("Table.rowHeight", 36);
            UIManager.put("Table.showHorizontalLines", true);
            UIManager.put("Table.showVerticalLines", false);
            UIManager.put("Table.intercellSpacing", new java.awt.Dimension(0, 1));
            
            Font font = new Font("Segoe UI", Font.PLAIN, 14);
            UIManager.put("defaultFont", font);
        } catch (Exception ex) {
            System.err.println("No se pudo inicializar FlatLaf: " + ex.getMessage());
        }

        java.awt.EventQueue.invokeLater(() -> {
            Principal pantalla = new Principal();
            pantalla.setVisible(true);
            pantalla.setLocationRelativeTo(null);
        });
    }
}
