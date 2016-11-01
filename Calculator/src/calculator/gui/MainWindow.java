package calculator.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Insets;


public class MainWindow {

	private JFrame frame;
	private JTextField displayField;
	private JButton threeButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 275, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel diplayPanel = new JPanel();
		diplayPanel.setBounds(10, 10, 254, 87);
		frame.getContentPane().add(diplayPanel);
		diplayPanel.setLayout(null);
		
		displayField = new JTextField();
		displayField.setBounds(20, 11, 211, 61);
		displayField.setHorizontalAlignment(SwingConstants.TRAILING);
		diplayPanel.add(displayField);
		displayField.setColumns(10);
		
		JPanel controlPanel = new JPanel();
		controlPanel.setBounds(10, 103, 254, 282);
		frame.getContentPane().add(controlPanel);
		controlPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton ceButton = new JButton("CE");
		ceButton.setMargin(new Insets(5, 5, 5, 5));
		ceButton.setPreferredSize(new Dimension(50, 50));
		ceButton.setMinimumSize(new Dimension(50, 50));
		ceButton.setMaximumSize(new Dimension(50, 50));
		controlPanel.add(ceButton);
		
		JButton cButton = new JButton("C");
		cButton.setPreferredSize(new Dimension(50, 50));
		cButton.setMinimumSize(new Dimension(50, 50));
		cButton.setMaximumSize(new Dimension(50, 50));
		controlPanel.add(cButton);
		
		JButton backButton = new JButton("<<");
		backButton.setPreferredSize(new Dimension(50, 50));
		backButton.setMinimumSize(new Dimension(50, 50));
		backButton.setMaximumSize(new Dimension(50, 50));
		controlPanel.add(backButton);
		
		JButton divideButton = new JButton("/");
		divideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		divideButton.setPreferredSize(new Dimension(50, 50));
		divideButton.setMinimumSize(new Dimension(50, 50));
		divideButton.setMaximumSize(new Dimension(50, 50));
		controlPanel.add(divideButton);
		
		JButton sevenButton = new JButton("7");
		sevenButton.setPreferredSize(new Dimension(50, 50));
		sevenButton.setMinimumSize(new Dimension(50, 50));
		sevenButton.setMaximumSize(new Dimension(50, 50));
		controlPanel.add(sevenButton);
		
		JButton eightButton = new JButton("8");
		eightButton.setPreferredSize(new Dimension(50, 50));
		eightButton.setMinimumSize(new Dimension(50, 50));
		eightButton.setMaximumSize(new Dimension(50, 50));
		controlPanel.add(eightButton);
		
		JButton nineButton = new JButton("9");
		nineButton.setPreferredSize(new Dimension(50, 50));
		nineButton.setMinimumSize(new Dimension(50, 50));
		nineButton.setMaximumSize(new Dimension(50, 50));
		controlPanel.add(nineButton);
		
		JButton multiplyButton = new JButton("*");
		multiplyButton.setPreferredSize(new Dimension(50, 50));
		multiplyButton.setMinimumSize(new Dimension(50, 50));
		multiplyButton.setMaximumSize(new Dimension(50, 50));
		controlPanel.add(multiplyButton);
		
		JButton fourButton = new JButton("4");
		fourButton.setPreferredSize(new Dimension(50, 50));
		fourButton.setMinimumSize(new Dimension(50, 50));
		fourButton.setMaximumSize(new Dimension(50, 50));
		controlPanel.add(fourButton);
		
		JButton fiveButton = new JButton("5");
		fiveButton.setPreferredSize(new Dimension(50, 50));
		fiveButton.setMinimumSize(new Dimension(50, 50));
		fiveButton.setMaximumSize(new Dimension(50, 50));
		controlPanel.add(fiveButton);
		
		JButton sixButton = new JButton("6");
		sixButton.setPreferredSize(new Dimension(50, 50));
		sixButton.setMinimumSize(new Dimension(50, 50));
		sixButton.setMaximumSize(new Dimension(50, 50));
		controlPanel.add(sixButton);
		
		JButton subtractButton = new JButton("-");
		subtractButton.setPreferredSize(new Dimension(50, 50));
		subtractButton.setMinimumSize(new Dimension(50, 50));
		subtractButton.setMaximumSize(new Dimension(50, 50));
		controlPanel.add(subtractButton);
		
		JButton oneButton = new JButton("1");
		oneButton.setPreferredSize(new Dimension(50, 50));
		oneButton.setMinimumSize(new Dimension(50, 50));
		oneButton.setMaximumSize(new Dimension(50, 50));
		controlPanel.add(oneButton);
		
		JButton twoButton = new JButton("2");
		twoButton.setPreferredSize(new Dimension(50, 50));
		twoButton.setMinimumSize(new Dimension(50, 50));
		twoButton.setMaximumSize(new Dimension(50, 50));
		controlPanel.add(twoButton);
		
		threeButton = new JButton("3");
		threeButton.setPreferredSize(new Dimension(50, 50));
		threeButton.setMinimumSize(new Dimension(50, 50));
		threeButton.setMaximumSize(new Dimension(50, 50));
		controlPanel.add(threeButton);
		
		JButton addButton = new JButton("+");
		addButton.setPreferredSize(new Dimension(50, 50));
		addButton.setMinimumSize(new Dimension(50, 50));
		addButton.setMaximumSize(new Dimension(50, 50));
		controlPanel.add(addButton);
		
		JButton signButton = new JButton("+/-");
		signButton.setPreferredSize(new Dimension(50, 50));
		signButton.setMinimumSize(new Dimension(50, 50));
		signButton.setMaximumSize(new Dimension(50, 50));
		controlPanel.add(signButton);
		
		JButton zeroButton = new JButton("0");
		zeroButton.setPreferredSize(new Dimension(50, 50));
		zeroButton.setMinimumSize(new Dimension(50, 50));
		zeroButton.setMaximumSize(new Dimension(50, 50));
		controlPanel.add(zeroButton);
		
		JButton decimalButton = new JButton(".");
		decimalButton.setPreferredSize(new Dimension(50, 50));
		decimalButton.setMinimumSize(new Dimension(50, 50));
		decimalButton.setMaximumSize(new Dimension(50, 50));
		controlPanel.add(decimalButton);
		
		JButton equalsToButton = new JButton("=");
		equalsToButton.setPreferredSize(new Dimension(50, 50));
		equalsToButton.setMinimumSize(new Dimension(50, 50));
		equalsToButton.setMaximumSize(new Dimension(50, 50));
		controlPanel.add(equalsToButton);
	}
}
