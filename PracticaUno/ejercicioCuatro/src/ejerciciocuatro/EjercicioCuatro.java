
package ejerciciocuatro;

import javax.swing.JOptionPane;

public class EjercicioCuatro {

    public static void main(String[] args) {
        float d1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Teclea una diagonal: "));
        float d2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Teclea la otra diagonal: "));
        // constante
        final float DOS = 2;
        
        float area = d1 * d2 / DOS;
        
        JOptionPane.showMessageDialog(null,"El área del rombo es: "+area);
    }
    
}
