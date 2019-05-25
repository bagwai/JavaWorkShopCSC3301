import javax.swing.*;

class TestGUI extends JFrame {
    TestGUI() {
        JPanel panel = new JPanel();
        JLabel lvlUserName = new JLabel();
        // JFrame frm = new JFrame();
        this.add(panel);
        this.setSize(220, 130);
        this.setTitle("Login Form");
        JButton btnLogin = new JButton();
        JTextField fldUserName = new JTextField(10);
        JPasswordField fldPassword = new JPasswordField(10);
        JLabel lvlPassword = new JLabel();
        JButton btnExit = new JButton();
        lvlUserName.setText("User Name");
        panel.add(lvlUserName);
        panel.add(fldUserName);
        lvlPassword.setText("Password: ");
        panel.add(lvlPassword);
        panel.add(fldPassword);
        btnLogin.setText("Login");
        // btnExit.setText("Exit");
        panel.add(btnLogin);
        // panel.add(btnExit);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestGUI();
    }
}