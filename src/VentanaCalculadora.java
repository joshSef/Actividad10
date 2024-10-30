import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaCalculadora extends JFrame {
    private JTextField txtNum1;
    private JButton btnCalc;
    private JPanel Ventana1;
    private JTextField txtNum2;
    private JTextField txtSuma;
    private JTextField textMulti;
    private JTextField textDiv;


    public VentanaCalculadora() {
        txtNum1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                txtNum1.setBackground(Color.pink);
            }
        });
        txtNum2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                txtNum2.setBackground(Color.pink);
            }
        });
        txtNum1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                txtNum1.setBackground(Color.WHITE);
            }
        });
        txtNum2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                txtNum2.setBackground(Color.white);
            }
        });
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double a = Double.parseDouble(txtNum1.getText());
                double b = Double.parseDouble(txtNum2.getText());
                double suma = a + b;
                double multi = a * b;
                double dividir = a / b;
                txtSuma.setText("La suma es: " + String.valueOf(suma));
                textMulti.setText("La multiplicación es: " + String.valueOf(multi));
                textDiv.setText("La división es: " + String.valueOf(dividir));
            }
        });
    }

        public static void main(String[] args) {
            VentanaCalculadora v = new VentanaCalculadora();
            v.setContentPane(v.Ventana1);
            v.setSize(500, 500);
            v.setVisible(true);
            v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}

