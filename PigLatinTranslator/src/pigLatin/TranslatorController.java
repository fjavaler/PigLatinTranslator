package pigLatin;

import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * 
 * @author Frederick Javalera
 */
public class TranslatorController
{	
	TranslatorModel model = new TranslatorModel();

	public String getTranslation(String englishText)
	{
		String convertedString = model.convertToLatin(englishText);
		return convertedString;
	}
	
	
}
