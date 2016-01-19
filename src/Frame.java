import java.lang.reflect.Constructor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.FlowLayout;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;


public class Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	public Frame() {
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JButton btnClear = new JButton("Clear");
		panel.add(btnClear);
		
		JButton btnEncrypt = new JButton("Encrypt");
		btnEncrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(btnEncrypt);
		
		JButton btnDecrypt = new JButton("Decrypt");
		panel.add(btnDecrypt);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.PAGE_AXIS));
		
		JLabel lblInput = new JLabel("Input text:");
		lblInput.setVerticalAlignment(SwingConstants.TOP);
		panel_1.add(lblInput);
		
		//panel_1.add(txtrInput);
		
		
		
		
		JTextArea txtrInput = new JTextArea();
		txtrInput.setWrapStyleWord(true);
		txtrInput.setLineWrap(true);
		panel_1.add(txtrInput);
		txtrInput.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtrInput.setText("Microsoft Edge \u0434\u0435\u043B\u0430\u0435\u0442 \u0440\u0430\u0431\u043E\u0442\u0443 \u0432 \u0418\u043D\u0442\u0435\u0440\u043D\u0435\u0442\u0435 \u0443\u0434\u043E\u0431\u043D\u0435\u0439.");
		
		JScrollPane scrollPane = new JScrollPane(txtrInput);
		panel_1.add(scrollPane);
		
		JSeparator separator = new JSeparator();
		panel_1.add(separator);
		
		JLabel lblNewLabel = new JLabel("Result:");
		panel_1.add(lblNewLabel);
		
		
		
		JTextArea txtrResult = new JTextArea(4,20);
		txtrResult.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtrResult.setEditable(false);
		txtrResult.setWrapStyleWord(true);
		txtrResult.setLineWrap(true);
		txtrResult.setText("Microsoft Edge \u0434\u0435\u043B\u0430\u0435\u0442 \u0440\u0430\u0431\u043E\u0442\u0443 \u0432 \u0418\u043D\u0442\u0435\u0440\u043D\u0435\u0442\u0435 \u0443\u0434\u043E\u0431\u043D\u0435\u0439.\r\n\r\n\u042D\u0442\u043E\u0442 \u043D\u043E\u0432\u044B\u0439 \u0431\u0440\u0430\u0443\u0437\u0435\u0440 \u0441\u043E\u0437\u0434\u0430\u043D \u0434\u043B\u044F \u0443\u0434\u043E\u0431\u043D\u043E\u0433\u043E \u043E\u0431\u043C\u0435\u043D\u0430 \u0434\u0430\u043D\u043D\u044B\u043C\u0438, \u0447\u0442\u0435\u043D\u0438\u044F, \u043F\u043E\u0438\u0441\u043A\u0430 \u0438 \u0440\u0430\u0431\u043E\u0442\u044B \u0432 \u0418\u043D\u0442\u0435\u0440\u043D\u0435\u0442\u0435.\r\n\r\n\u0423\u0437\u043D\u0430\u0442\u044C \u0431\u043E\u043B\u044C\u0448\u0435");
		panel_1.add(txtrResult);
		
		JScrollPane scrollPane_1 = new JScrollPane(txtrResult);
		panel_1.add(scrollPane_1);
		
		
		setSize(400, 300);		
		//pack();
		setLocationRelativeTo(null);
		
	}
}
