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

	private JFrame framePigLatinTranslator;
	private JTextField englishTextField;
	private JTextField pigLatinTextField;

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
		
		JLabel lblPleaseEnterA = new JLabel("Please Enter A Sentence");
		lblPleaseEnterA.setFont(new Font("Noto Sans UI", Font.PLAIN, 15));
		lblPleaseEnterA.setBounds(40, 25, 182, 19);
		framePigLatinTranslator.getContentPane().add(lblPleaseEnterA);
		
		englishTextField = new JTextField();
		englishTextField.setBounds(40, 54, 575, 30);
		framePigLatinTranslator.getContentPane().add(englishTextField);
		englishTextField.setColumns(10);
		
		JLabel lblHereIsYour = new JLabel("Here Is Your Sentence In Pig Latin");
		lblHereIsYour.setFont(new Font("Noto Sans UI", Font.PLAIN, 15));
		lblHereIsYour.setBounds(40, 107, 245, 19);
		framePigLatinTranslator.getContentPane().add(lblHereIsYour);
		
		pigLatinTextField = new JTextField();
		pigLatinTextField.setBounds(40, 138, 575, 30);
		framePigLatinTranslator.getContentPane().add(pigLatinTextField);
		pigLatinTextField.setColumns(10);
		
		JButton btnTranslate = new JButton("Translate");
		btnTranslate.setForeground(Color.DARK_GRAY);
		btnTranslate.setFont(new Font("Noto Sans UI", Font.PLAIN, 21));
		btnTranslate.setBounds(253, 223, 131, 46);
		framePigLatinTranslator.getContentPane().add(btnTranslate);
	}
	
//	public void displayView(JFrame frame, JTextField english, JTextField latin, JButton translateButton)
//	{
//		TranslatorView view = new TranslatorView();
//	}
}
