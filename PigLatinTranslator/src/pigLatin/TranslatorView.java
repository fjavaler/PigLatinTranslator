package pigLatin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class TranslatorView
{

	private JFrame frmPigLatinTranslator;
	private JTextField textField;
	private JTextField textField_1;

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
					window.frmPigLatinTranslator.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
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
		frmPigLatinTranslator = new JFrame();
		frmPigLatinTranslator.setFont(new Font("Noto Sans UI", Font.PLAIN, 14));
		frmPigLatinTranslator.setTitle("Pig Latin Translator");
		frmPigLatinTranslator.setBounds(100, 100, 650, 350);
		frmPigLatinTranslator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPigLatinTranslator.getContentPane().setLayout(null);
		
		JLabel lblPleaseEnterA = new JLabel("Please Enter A Sentence");
		lblPleaseEnterA.setFont(new Font("Noto Sans UI", Font.PLAIN, 15));
		lblPleaseEnterA.setBounds(40, 25, 182, 19);
		frmPigLatinTranslator.getContentPane().add(lblPleaseEnterA);
		
		textField = new JTextField();
		textField.setBounds(40, 54, 575, 30);
		frmPigLatinTranslator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblHereIsYour = new JLabel("Here Is Your Sentence In Pig Latin");
		lblHereIsYour.setFont(new Font("Noto Sans UI", Font.PLAIN, 15));
		lblHereIsYour.setBounds(40, 107, 245, 19);
		frmPigLatinTranslator.getContentPane().add(lblHereIsYour);
		
		textField_1 = new JTextField();
		textField_1.setBounds(40, 138, 575, 30);
		frmPigLatinTranslator.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnTranslate = new JButton("Translate");
		btnTranslate.setForeground(Color.DARK_GRAY);
		btnTranslate.setFont(new Font("Noto Sans UI", Font.PLAIN, 21));
		btnTranslate.setBounds(253, 223, 131, 46);
		frmPigLatinTranslator.getContentPane().add(btnTranslate);
	}
}
