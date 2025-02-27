package main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainVentana {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Profesor Tester");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            
            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());

            JLabel label = new JLabel("Selecciona una opción:");
            
            // Opciones del combo box
            String[] opciones = {"Profesor Favorito..", "DiegoMat", "Lorena", "Thomas", "Lidia"};
            JComboBox<String> comboBox = new JComboBox<>(opciones);
            comboBox.setSelectedIndex(0);
            
            
            JButton btnAnalizar = new JButton("Analizar");
            btnAnalizar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(frame, "¿Qué te pensabas, que me iba a esforzar en esto?");
                }
            });

            panel.add(label);
            panel.add(comboBox);
            panel.add(btnAnalizar);
            
            frame.add(panel);
            frame.setVisible(true);
        });
    }
}
