import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JScrollPane;
import java.awt.Component;

public class Frame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JTextArea txtrOutput = new JTextArea();
	JTextArea txtrInput = new JTextArea();

	public Frame() {

		// создали кнопки
		JButton btnClear = new JButton("Clear");
		btnClear.setActionCommand("Clear");
		btnClear.addActionListener(this);

		JButton btnEncrypt = new JButton("Encrypt");
		btnEncrypt.setActionCommand("Encrypt");
		btnEncrypt.addActionListener(this);

		JButton btnDecrypt = new JButton("Decrypt");
		btnDecrypt.setActionCommand("Decrypt");
		btnDecrypt.addActionListener(this);

		// панель для кнопок
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.LINE_AXIS));
		buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		//buttonPanel.add(Box.createHorizontalGlue());
		buttonPanel.add(btnClear);
		buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
		buttonPanel.add(btnEncrypt);
		buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
		buttonPanel.add(btnDecrypt);

		getContentPane().add(buttonPanel, BorderLayout.PAGE_START);

		// *********** Input Panel ************
		JPanel inputPanel = new JPanel();
		inputPanel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.PAGE_AXIS));
		JLabel labelInput = new JLabel("Input:");
		inputPanel.add(labelInput);
		labelInput.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelInput.setHorizontalAlignment(SwingConstants.LEFT);

		inputPanel.add(Box.createRigidArea(new Dimension(0, 10)));

		txtrInput.setWrapStyleWord(true);
		txtrInput.setLineWrap(true);
		txtrInput.setFont(new Font("Monospaced", Font.PLAIN, 14));
		
		JScrollPane scrollPanelInput = new JScrollPane(txtrInput);
		inputPanel.add(scrollPanelInput);

		// *********** Output Panel ************
		JPanel outputPanel = new JPanel();
		outputPanel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		outputPanel.setLayout(new BoxLayout(outputPanel, BoxLayout.PAGE_AXIS));
		JLabel labelOutput = new JLabel("Output:");
		labelOutput.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelOutput.setHorizontalAlignment(SwingConstants.LEFT);
		outputPanel.add(labelOutput);

		outputPanel.add(Box.createRigidArea(new Dimension(0, 10)));

		txtrOutput.setWrapStyleWord(true);
		txtrOutput.setLineWrap(true);
		txtrOutput.setFont(new Font("Monospaced", Font.PLAIN, 14));
		
		JScrollPane scrollPanelOutput = new JScrollPane(txtrOutput);
		outputPanel.add(scrollPanelOutput);

		JPanel centralPanel = new JPanel();
		centralPanel
				.setLayout(new BoxLayout(centralPanel, BoxLayout.PAGE_AXIS));
		centralPanel.add(inputPanel);

		Component verticalStrut = Box.createVerticalStrut(20);
		centralPanel.add(verticalStrut);
		centralPanel.add(outputPanel);
		getContentPane().add(centralPanel, BorderLayout.CENTER);

		setSize(500, 400);
		// pack();
		setLocationRelativeTo(null);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if ("Clear".equals(e.getActionCommand())) {
			txtrOutput.setText(null);
			txtrInput.setText(null);
			}
		if ("Encrypt".equals(e.getActionCommand())) {
			txtrOutput.setText(Enc_decr.encrypt(txtrInput.getText()));
			}
		if ("Decrypt".equals(e.getActionCommand())) {
			txtrOutput.setText(Enc_decr.decrypt(txtrInput.getText()));
			}
		

	}
}
