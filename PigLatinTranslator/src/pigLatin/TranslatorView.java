package pigLatin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class TranslatorView
{
	
	private TranslatorController controller = new TranslatorController();
	private JFrame framePigLatinTranslator;
	private JTextField englishTextField;
	private JTextField pigLatinTextField;
	private JButton btnClear;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					TranslatorView window = new TranslatorView();
					window.framePigLatinTranslator.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	public JFrame getFramePigLatinTranslator()
	{
		return framePigLatinTranslator;
	}

	public void setFramePigLatinTranslator(JFrame framePigLatinTranslator)
	{
		this.framePigLatinTranslator = framePigLatinTranslator;
	}

	public JTextField getEnglishTextField()
	{
		return englishTextField;
	}

	public void setEnglishTextField(JTextField englishTextField)
	{
		this.englishTextField = englishTextField;
	}

	public JTextField getPigLatinTextField()
	{
		return pigLatinTextField;
	}

	public void setPigLatinTextField(JTextField pigLatinTextField)
	{
		this.pigLatinTextField = pigLatinTextField;
	}

	/**
	 * Create the application.
	 */
	public TranslatorView()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		framePigLatinTranslator = new JFrame();
		framePigLatinTranslator.setFont(new Font("Noto Sans UI", Font.PLAIN, 14));
		framePigLatinTranslator.setTitle("Pig Latin Translator");
		framePigLatinTranslator.setBounds(100, 100, 650, 350);
		framePigLatinTranslator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framePigLatinTranslator.getContentPane().setLayout(null);
		
		JLabel lblPleaseEnterA = new JLabel("Please Enter A Sentence:");
		lblPleaseEnterA.setFont(new Font("Noto Sans UI", Font.PLAIN, 15));
		lblPleaseEnterA.setBounds(40, 25, 182, 19);
		framePigLatinTranslator.getContentPane().add(lblPleaseEnterA);
		
		englishTextField = new JTextField();
		englishTextField.setFont(new Font("Noto Sans", Font.PLAIN, 14));
		englishTextField.setBounds(40, 54, 575, 30);
		framePigLatinTranslator.getContentPane().add(englishTextField);
		englishTextField.setColumns(10);
		
		JLabel lblHereIsYour = new JLabel("Here Is Your Sentence In Pig Latin:\n");
		lblHereIsYour.setFont(new Font("Noto Sans UI", Font.PLAIN, 15));
		lblHereIsYour.setBounds(40, 107, 245, 19);
		framePigLatinTranslator.getContentPane().add(lblHereIsYour);
		
		pigLatinTextField = new JTextField();
		pigLatinTextField.setEditable(false);
		pigLatinTextField.setFont(new Font("Noto Sans", Font.PLAIN, 14));
		pigLatinTextField.setBounds(40, 138, 575, 30);
		framePigLatinTranslator.getContentPane().add(pigLatinTextField);
		pigLatinTextField.setColumns(10);
		
		JButton btnTranslate = new JButton("Translate");
		btnTranslate.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String s = englishTextField.getText();
				System.out.println(s); 
				String s2 = controller.getTranslation(s);
				System.out.println(s2);
				pigLatinTextField.setText(s2);
			}
		});
		btnTranslate.setForeground(Color.DARK_GRAY);
		btnTranslate.setFont(new Font("Noto Sans UI", Font.PLAIN, 21));
		btnTranslate.setBounds(178, 225, 131, 46);
		framePigLatinTranslator.getContentPane().add(btnTranslate);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				englishTextField.setText("");
				pigLatinTextField.setText("");
			}
		});
		btnClear.setForeground(Color.DARK_GRAY);
		btnClear.setFont(new Font("Noto Sans UI", Font.PLAIN, 21));
		btnClear.setBounds(321, 225, 131, 46);
		framePigLatinTranslator.getContentPane().add(btnClear);
		
		lblNewLabel = new JLabel("\n");
		lblNewLabel.setIcon(new ImageIcon(TranslatorView.class.getResource("/pig.png")));
		lblNewLabel.setBounds(520, 198, 130, 130);
		framePigLatinTranslator.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TranslatorView.class.getResource("/pigLatin.png")));
		lblNewLabel_1.setBounds(161, 174, 172, 53);
		framePigLatinTranslator.getContentPane().add(lblNewLabel_1);
	}
}
