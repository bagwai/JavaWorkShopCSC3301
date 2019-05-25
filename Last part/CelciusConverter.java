import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.*;

public class CelciusConverter extends JFrame {
    private JPanel panel;
    private JTextField frhFeild;
    private JTextField celcField;
    private JButton frhBtn;
    private JButton celcBtn;

    CelciusConverter() {
        panel = new JPanel();
        frhFeild = new JTextField(10);
        celcField = new JTextField(10);
        frhBtn = new JButton("F==>C");
        celcBtn = new JButton("C==>F");
        JLabel lblCelc = new JLabel("Celcius: ");
        JLabel lblFrh = new JLabel("Fahrenheit: ");

        this.add(panel);
        this.setTitle("Temperature Converter");
        this.setSize(400, 110);
        this.setResizable(false);

        panel.add(lblCelc);
        panel.add(celcField);
        panel.add(lblFrh);
        panel.add(frhFeild);
        panel.add(celcBtn);
        panel.add(frhBtn);
        frhBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                float c = Float.parseFloat(frhFeild.getText());
                float temp = ((c - 32) * 5) / 9f;
                celcField.setText(Float.toString(temp));
            }
        });
        celcBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                float f = Float.parseFloat(celcField.getText());
                float temp = (f * (9f / 5) + 32);
                frhFeild.setText(Float.toString(temp));
            }
        });
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CelciusConverter();
    }
}