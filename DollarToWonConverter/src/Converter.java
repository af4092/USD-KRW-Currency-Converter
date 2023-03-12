import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Converter extends JFrame {

	private JPanel contentPane;
	private JTextField tfCurrencyRate;
	private JTextField tfAmount;
	private JLabel lbDisplay;
	private String currencyRate;
	private String convertAmount;

	public Converter() {
		setTitle("Dollar To Won Conversion");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\FAbdu\\Downloads\\currency.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 402, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfCurrencyRate = new JTextField();
		tfCurrencyRate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfCurrencyRate.setBounds(250, 78, 128, 33);
		contentPane.add(tfCurrencyRate);
		tfCurrencyRate.setColumns(10);
		
		JLabel lbCurrencyRate = new JLabel("USD to KRW rate");
		lbCurrencyRate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbCurrencyRate.setBounds(10, 78, 150, 33);
		contentPane.add(lbCurrencyRate);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setForeground(Color.RED);
		lblCurrencyConverter.setBackground(Color.RED);
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCurrencyConverter.setBounds(109, 21, 172, 33);
		contentPane.add(lblCurrencyConverter);
		
		JLabel lbAmount = new JLabel("Enter Amount To Convert");
		lbAmount.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbAmount.setBounds(10, 158, 211, 33);
		contentPane.add(lbAmount);
		
		tfAmount = new JTextField();
		tfAmount.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfAmount.setColumns(10);
		tfAmount.setBounds(250, 158, 128, 33);
		contentPane.add(tfAmount);
		/*********************************************/
		
		/*********************************************/
		
		JButton btnUSDtoKRW = new JButton("USD-To-KRW");
		btnUSDtoKRW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				currencyRate = tfCurrencyRate.getText();
				convertAmount = tfAmount.getText();
				ConverterMethod obj = new ConverterMethod(currencyRate, convertAmount);	
				lbDisplay.setText(obj.DollarToWonString() + " KRW");
					
			}
		});
		btnUSDtoKRW.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnUSDtoKRW.setBounds(10, 240, 131, 33);
		contentPane.add(btnUSDtoKRW);
		
		JButton btnKRWtoUSD = new JButton("KRW-To-USD");
		btnKRWtoUSD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				currencyRate = tfCurrencyRate.getText();
				convertAmount = tfAmount.getText();
				ConverterMethod obj = new ConverterMethod(currencyRate, convertAmount);		
				lbDisplay.setText(obj.WonToDollarString() + " USD");
				
			}
		});
		btnKRWtoUSD.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnKRWtoUSD.setBounds(247, 240, 131, 33);
		contentPane.add(btnKRWtoUSD);
		
		lbDisplay = new JLabel("");
		lbDisplay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbDisplay.setBounds(118, 297, 150, 33);
		contentPane.add(lbDisplay);
	}
}
