import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.*;

public class Calculator extends JFrame {

    Calculator() {
        JPanel panel = new JPanel();
        this.add(panel);
        this.setSize(600, 120);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        JLabel lvlNum1 = new JLabel("Number 1: ");
        panel.add(lvlNum1);
        JTextField fldNum1 = new JTextField(10);
        panel.add(fldNum1);

        JLabel lvlNum2 = new JLabel("Number 2: ");
        panel.add(lvlNum2);
        JTextField fldNum2 = new JTextField(10);
        panel.add(fldNum2);

        JLabel lvlResult = new JLabel("Result: ");
        panel.add(lvlResult);
        JTextField fldResult = new JTextField(10);
        panel.add(fldResult);

        JButton btnAdd = new JButton("ADD");
        panel.add(btnAdd);

        btnAdd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int number1 = (Integer.parseInt(fldNum1.getText()));
                int number2 = (Integer.parseInt(fldNum2.getText()));

                int sum = number1 + number2;

                fldResult.setText(Integer.toString(sum));
            }
        });

        JButton btnSub = new JButton("SUBTRACT");
        panel.add(btnSub);
        btnSub.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int number1 = (Integer.parseInt(fldNum1.getText()));
                int number2 = (Integer.parseInt(fldNum2.getText()));

                int sub = number1 - number2;

                fldResult.setText(Integer.toString(sub));
            }
        });

        JButton btnMul = new JButton("MULTIPLY");
        panel.add(btnMul);
        btnMul.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int number1 = (Integer.parseInt(fldNum1.getText()));
                int number2 = (Integer.parseInt(fldNum2.getText()));

                int mul = number1 * number2;

                fldResult.setText(Integer.toString(mul));
            }
        });

        JButton btnDiv = new JButton("DIVIDE");
        panel.add(btnDiv);
        btnDiv.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int number1 = (Integer.parseInt(fldNum1.getText()));
                int number2 = (Integer.parseInt(fldNum2.getText()));

                int div;
                if (number2 == 0) {
                    fldResult.setText("Division By Zero");
                } else {
                    div = number1 / number2;
                    fldResult.setText(Integer.toString(div));
                }
            }
        });

        JButton btnClear = new JButton("CLEAR");
        panel.add(btnClear);
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                fldNum1.setText(" ");
                fldNum2.setText(" ");
                fldResult.setText(" ");
            }
        });

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}