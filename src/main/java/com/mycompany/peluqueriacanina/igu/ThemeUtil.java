package com.mycompany.peluqueriacanina.igu;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import java.awt.*;

public class ThemeUtil {

    // Paleta de colores moderna (Ocean Teal & Slate)
    public static final Color COLOR_PRIMARY = new Color(13, 148, 136);     // Teal #0D9488
    public static final Color COLOR_SECONDARY = new Color(37, 99, 235);    // Azul Real #2563EB
    public static final Color COLOR_DANGER = new Color(239, 68, 68);      // Rojo #EF4444
    
    public static final Color COLOR_BG_MAIN = new Color(248, 250, 252);   // Slate claro #F8FAFC
    public static final Color COLOR_BG_CARD = new Color(255, 255, 255);   // Blanco #FFFFFF
    public static final Color COLOR_BG_HEADER = new Color(15, 118, 110);  // Ocean Teal Profundo #0F766E
    
    public static final Color COLOR_TEXT_DARK = new Color(30, 41, 59);    // Slate Oscuro #1E293B
    public static final Color COLOR_TEXT_LIGHT = new Color(255, 255, 255);
    
    public static final Color COLOR_BORDER = new Color(203, 213, 225);    // Slate Border #CBD5E1

    /**
     * Aplica el estilo general a una ventana JFrame.
     */
    public static void applyWindowStyle(JFrame frame) {
        frame.getContentPane().setBackground(COLOR_BG_HEADER);
    }

    /**
     * Aplica el estilo al panel de encabezado principal.
     */
    public static void applyHeaderPanel(JPanel panel, JLabel titleLabel) {
        panel.setBackground(COLOR_BG_HEADER);
        if (titleLabel != null) {
            titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 32));
            titleLabel.setForeground(COLOR_TEXT_LIGHT);
        }
    }

    /**
     * Aplica un estilo de tarjeta (Card) a un JPanel.
     */
    public static void applyCardStyle(JPanel panel) {
        panel.setBackground(COLOR_BG_CARD);
        panel.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(COLOR_BORDER, 1, true),
            BorderFactory.createEmptyBorder(12, 16, 12, 16)
        ));
    }

    /**
     * Aplica un estilo de botón primario.
     */
    public static void applyPrimaryButton(JButton button) {
        button.setFont(new Font("Segoe UI", Font.BOLD, 15));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setFocusPainted(false);
        button.setBackground(COLOR_PRIMARY);
        button.setForeground(COLOR_TEXT_LIGHT);
        button.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(15, 118, 110), 1, true),
            BorderFactory.createEmptyBorder(8, 16, 8, 16)
        ));
    }

    /**
     * Aplica un estilo de botón secundario.
     */
    public static void applySecondaryButton(JButton button) {
        button.setFont(new Font("Segoe UI", Font.BOLD, 15));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setFocusPainted(false);
        button.setBackground(COLOR_SECONDARY);
        button.setForeground(COLOR_TEXT_LIGHT);
        button.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(29, 78, 216), 1, true),
            BorderFactory.createEmptyBorder(8, 16, 8, 16)
        ));
    }

    /**
     * Aplica un estilo de botón peligro/borrar.
     */
    public static void applyDangerButton(JButton button) {
        button.setFont(new Font("Segoe UI", Font.BOLD, 14));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setFocusPainted(false);
        button.setBackground(COLOR_DANGER);
        button.setForeground(COLOR_TEXT_LIGHT);
        button.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(220, 38, 38), 1, true),
            BorderFactory.createEmptyBorder(6, 14, 6, 14)
        ));
    }

    /**
     * Aplica un estilo de botón neutro u outline.
     */
    public static void applyOutlineButton(JButton button) {
        button.setFont(new Font("Segoe UI", Font.BOLD, 14));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setFocusPainted(false);
        button.setBackground(new Color(241, 245, 249));
        button.setForeground(new Color(51, 65, 85));
        button.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(COLOR_BORDER, 1, true),
            BorderFactory.createEmptyBorder(6, 14, 6, 14)
        ));
    }

    /**
     * Aplica estilo a los campos de texto con padding moderno.
     */
    public static void applyTextFieldStyle(JTextField textField) {
        textField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        textField.setForeground(COLOR_TEXT_DARK);
        textField.setBackground(Color.WHITE);
        textField.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(COLOR_BORDER, 1, true),
            BorderFactory.createEmptyBorder(6, 10, 6, 10)
        ));
    }

    /**
     * Aplica estilo a los ComboBox.
     */
    public static void applyComboBoxStyle(JComboBox<?> comboBox) {
        comboBox.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        comboBox.setForeground(COLOR_TEXT_DARK);
        comboBox.setBackground(Color.WHITE);
    }

    /**
     * Aplica estilo a etiquetas de texto.
     */
    public static void applyLabelStyle(JLabel label, boolean isHeader) {
        if (isHeader) {
            label.setFont(new Font("Segoe UI", Font.BOLD, 15));
            label.setForeground(COLOR_TEXT_DARK);
        } else {
            label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            label.setForeground(COLOR_TEXT_DARK);
        }
    }

    /**
     * Moderniza el diseño de una JTable (VerDatos).
     */
    public static void applyTableStyle(JTable table) {
        table.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        table.setRowHeight(38);
        table.setSelectionBackground(new Color(224, 242, 254)); // Soft Sky Light
        table.setSelectionForeground(COLOR_TEXT_DARK);
        table.setShowHorizontalLines(true);
        table.setGridColor(new Color(226, 232, 240));
        
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("Segoe UI", Font.BOLD, 14));
        header.setBackground(new Color(241, 245, 249));
        header.setForeground(COLOR_TEXT_DARK);
        header.setPreferredSize(new Dimension(header.getPreferredSize().width, 42));
        
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (c instanceof JLabel) {
                    JLabel label = (JLabel) c;
                    label.setBorder(new EmptyBorder(0, 10, 0, 10));
                    
                    String strVal = String.valueOf(value);
                    if (!isSelected) {
                        if ("SI".equalsIgnoreCase(strVal)) {
                            label.setForeground(new Color(185, 28, 28));
                            label.setFont(label.getFont().deriveFont(Font.BOLD));
                        } else if ("NO".equalsIgnoreCase(strVal)) {
                            label.setForeground(new Color(22, 101, 52));
                            label.setFont(label.getFont().deriveFont(Font.PLAIN));
                        } else {
                            label.setForeground(COLOR_TEXT_DARK);
                            label.setFont(label.getFont().deriveFont(Font.PLAIN));
                        }
                    }
                }
                return c;
            }
        };
        table.setDefaultRenderer(Object.class, renderer);
    }
}
