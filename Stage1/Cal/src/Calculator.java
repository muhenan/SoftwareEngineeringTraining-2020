import javax.swing.*;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;

public class Calculator extends JFrame{

	public Calculator() {

		JPanel panel;
		JLabel result, op, eq;
		JTextField op1, op2;
		JButton add, sub, mul, div, equal;
	
		setBounds(100, 100, 450, 200);		
		setTitle("Carculator By Muhenan");			
	
		// op1 and op2
		op1 = new JTextField("12");
		op1.setBackground(Color.orange);
		op1.setHorizontalAlignment(JTextField.CENTER);
		op2 = new JTextField("2");
		op2.setBackground(Color.orange);
		op2.setHorizontalAlignment(JTextField.CENTER);
		op = new JLabel("",JLabel.CENTER);
	
		
	
		eq = new JLabel("=",JLabel.CENTER);
	
		result = new JLabel("",JLabel.CENTER);
	
		add = new JButton("+");
		sub = new JButton("-");
		mul = new JButton("*");
		div = new JButton("/");
		equal = new JButton("Go");
		
		panel = new JPanel();
		
		//2 rows 5 cols
		
		panel.setLayout(new GridLayout(2,5));
		panel.add(op1); 
		panel.add(op);
		panel.add(op2);  
	    panel.add(eq);
	    panel.add(result);
		panel.add(add);  
	    panel.add(sub);  
	    panel.add(mul);  
	    panel.add(div);
	    panel.add(equal);
	
	    add(panel);
	    
	    
	    ActionListener res = new ActionListener() {
			public void actionPerformed(ActionEvent e){
				result.setText("");
				result.setForeground(Color.red);
				double num1 = Double.parseDouble(op1.getText());
				double num2 = Double.parseDouble(op2.getText());
				if(op.getText().equals("+")){
					result.setText("" + (num1 + num2));
				}
				if(op.getText().equals("-")){
					result.setText("" + (num1 - num2));
				}
				if(op.getText().equals("*")){
					result.setText("" + (num1 * num2));
				}
				if(op.getText().equals("/")){
					if(num2 == 0) result.setText("Illegal");
					else result.setText("" + (num1 / num2));
				}
			}
		};
		
		
		ActionListener chop = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op.setText(((JButton)e.getSource()).getText());
			}
		};
		
	    // calculate
	    add.addActionListener(chop);
	    sub.addActionListener(chop);
	    mul.addActionListener(chop);
	    div.addActionListener(chop);
		
	    equal.addActionListener(res);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new Calculator();
	}
} 
