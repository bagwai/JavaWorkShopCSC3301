import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.RoundingMode;

import javax.swing.*;
import javax.swing.event.*;
import java.text.DecimalFormat;

//import com.sun.imageio.stream.StreamCloser.CloseAction;

public class Quadratic extends JFrame {

    Quadratic() {
        JPanel panel = new JPanel();
        this.add(panel);
        this.setSize(330, 130);
        this.setResizable(false);

        JLabel lvlA = new JLabel("a = ");
        panel.add(lvlA);
        JTextField txtA = new JTextField(6);
        panel.add(txtA);

        JLabel lvlB = new JLabel("b = ");
        panel.add(lvlB);
        JTextField txtB = new JTextField(6);
        panel.add(txtB);

        JLabel lvlC = new JLabel("c = ");
        panel.add(lvlC);
        JTextField txtC = new JTextField(6);
        panel.add(txtC);

        JLabel lvlRoot1 = new JLabel("Root1 = ");
        panel.add(lvlRoot1);
        JTextField txtRoot1 = new JTextField(8);
        panel.add(txtRoot1);

        JLabel lvlRoot2 = new JLabel("Root2 = ");
        panel.add(lvlRoot2);
        JTextField txtRoot2 = new JTextField(8);
        panel.add(txtRoot2);

        JButton btnCalc = new JButton("Calculate");
        panel.add(btnCalc);
        btnCalc.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double a = (Double.parseDouble(txtA.getText()));
                double b = (Double.parseDouble(txtB.getText()));
                double c = (Double.parseDouble(txtC.getText()));

                double root1, root2;
                double d = b * b - 4 * 2 * c;

                // testing a real and diffrent roots

                if (d > 0) {
                    root1 = (-b + Math.sqrt(d)) / (2 * a);
                    root2 = (-b - Math.sqrt(d)) / (2 * a);
                }
                // condition real and equal root1
                else if (d == 0) {
                    root1 = root2 = -b / (2 * a);
                }
                // if roots are not equal
                else {
                    double realpart = -b / (2 * a);
                    double imaginepart = Math.sqrt(-d) / (2 * a);
                    root1 = realpart + imaginepart;
                    root2 = realpart - imaginepart;
                }
                DecimalFormat x = new DecimalFormat("#.##");
                x.setRoundingMode(RoundingMode.FLOOR);

                double p = new Double(x.format(root1));
                double q = new Double(x.format(root2));
                txtRoot1.setText(Double.toString(p));
                txtRoot2.setText(Double.toString(q));
            }
        });

        JButton btnQuit = new JButton("Close");
        panel.add(btnQuit);
        btnQuit.addActionListener(e -> System.exit(0));
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        new Quadratic();
    }
}