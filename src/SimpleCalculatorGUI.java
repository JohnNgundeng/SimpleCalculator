import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleCalculatorGUI {

	private JFrame frmSimpleCalculator;
	private JTextField txtNumber1;
	private JButton btnSubtract;
	private JButton btnDivide;
	private JButton btnMultiply;
	private JTextField txtNumber2;
	private JLabel lblFirstNumber;
	private JLabel lblSecondNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculatorGUI window = new SimpleCalculatorGUI();
					window.frmSimpleCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SimpleCalculatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSimpleCalculator = new JFrame();
		frmSimpleCalculator.setTitle("Simple Calculator");
		frmSimpleCalculator.setBounds(100, 100, 226, 423);
		frmSimpleCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSimpleCalculator.getContentPane().setLayout(null);
		
		
		
		// Creating text field for the first number
		txtNumber1 = new JTextField();
		txtNumber1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNumber1.setBounds(10, 24, 190, 59);
		frmSimpleCalculator.getContentPane().add(txtNumber1);
		txtNumber1.setColumns(10);
		
		JLabel lblAnswer = new JLabel("");
		lblAnswer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAnswer.setBounds(10, 329, 190, 44);
		frmSimpleCalculator.getContentPane().add(lblAnswer);
		
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) 
			{
				// calling variables
				int number1 ;
				int number2;
				
				//Converting the text to an int 
				number1 = Integer.parseInt(txtNumber1.getText());
				number2 = Integer.parseInt(txtNumber2.getText());
				//adding the numbers and displaying the answer
				int answer = number1 + number2;
				lblAnswer.setText("The answer is " + answer); 
			}
				
		});
		btnAdd.setToolTipText("Add");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnAdd.setBounds(24, 176, 59, 59);
		frmSimpleCalculator.getContentPane().add(btnAdd);
		
		btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// calling variables
				int number1;
				int number2;
			
				//Converting the text to an int 
				number1 = Integer.parseInt(txtNumber1.getText());
				number2 = Integer.parseInt(txtNumber2.getText());
			
			//subtracting the numbers and displaying the answer
			int answer = number1 - number2;
			lblAnswer.setText("The answer is " + answer);
			}
		});
		btnSubtract.setToolTipText("Subtract");
		btnSubtract.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnSubtract.setBounds(128, 176, 59, 59);
		frmSimpleCalculator.getContentPane().add(btnSubtract);
		
		btnDivide = new JButton("\u00F7");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// calling variables
			double number1;
			double number2;
			
			//Converting the text to an int 
				number1 = Integer.parseInt(txtNumber1.getText());
				number2 = Integer.parseInt(txtNumber2.getText());
			// dividing the numbers and displaying the answer
			double answer = number1 / number2;
			lblAnswer.setText("The answer is " + answer);
			}
		});
		btnDivide.setToolTipText("Divide");
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnDivide.setBounds(128, 259, 59, 59);
		frmSimpleCalculator.getContentPane().add(btnDivide);
		
		btnMultiply = new JButton("x");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			// calling variables
			int number1;
			int number2;
			
			//Converting the text to an int 
			number1 = Integer.parseInt(txtNumber1.getText());
			number2 = Integer.parseInt(txtNumber2.getText());
			// multiplying the numbers and displaying the answer
			int answer = number1 * number2;
			lblAnswer.setText("The answer is " + answer);
			}
		});
		btnMultiply.setToolTipText("Multiply");
		btnMultiply.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnMultiply.setBounds(24, 259, 59, 59);
		frmSimpleCalculator.getContentPane().add(btnMultiply);
		

		
		txtNumber2 = new JTextField();
		txtNumber2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNumber2.setColumns(10);
		txtNumber2.setBounds(10, 106, 190, 59);
		frmSimpleCalculator.getContentPane().add(txtNumber2);
		
		lblFirstNumber = new JLabel("First Number");
		lblFirstNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFirstNumber.setBounds(58, 0, 107, 23);
		frmSimpleCalculator.getContentPane().add(lblFirstNumber);
		
		lblSecondNumber = new JLabel("Second Number");
		lblSecondNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSecondNumber.setBounds(47, 83, 140, 23);
		frmSimpleCalculator.getContentPane().add(lblSecondNumber);
	}
}
