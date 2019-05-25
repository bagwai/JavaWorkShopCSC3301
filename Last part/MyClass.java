import javax.swing.*;

import java.awt.event.*;

public class MyClass extends JFrame{
	
	public static void main(String[] args){
		new MyClass();
	}
		
	public MyClass(){
		JPanel panel = new JPanel();
		JLabel label = new JLabel("You Clicked");
		JButton button = new JButton("Click");
		JTextField textField =  new JTextField("0",10);
		//JTextField textField =  new JTextField("I am a JTextField", 10);
		//button.setToolTipText("I do not do much");
		
		panel.add(label);
		panel.add(textField);
		panel.add(button);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				int n = Integer.parseInt(textField.getText());
				n++;
				textField.setText(Integer.toString(n));
			}			
		});

		this.setTitle("JLabel Demo");
		this.setSize(200, 150);
		//this.pack(); // Why does it collapse the Window?
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}