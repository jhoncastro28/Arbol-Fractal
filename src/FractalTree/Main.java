package FractalTree;

import javax.swing.*;

/**
 *
 * @author jhonm
 */
public class Main extends JFrame {

    public Main(int n) {
        setSize(900, 900);
        setTitle("Arbol Fractal");
        add(new DrawTree(n));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        try {
            String input = JOptionPane.showInputDialog("Ingrese la cantidad de pasos:");
            if (input == null) {
                System.exit(0);
            }
            int n = Integer.parseInt(input);
            if (n < 1) {
                throw new IllegalArgumentException("El número de pasos debe ser mayor o igual a 1.");
            }
            new Main(n);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
