/********************************************************
 *
 *  Project :  Pig Latin Translator
 *  File    :  TranslatorController.java
 *  Name    :  Frederick Javalera
 *  Date    :  Created: 3/16/2017(Due: 3/20/2017)
 *
 *  Description : (Narrative description, not code)
 *
 *    1) What is the purpose of the code; what problem does the code solve.
 *    The purpose of this code is to act as the mutual controller for both
 *    the TranslatorView and TranslatorModel classes.
 *	  
 *    2) What data-structures are used.
 *    No data structures were used here.
 *
 *    3) What algorithms, techniques, etc. are used in implementing the data structures.
 *	  the convertToLatin method's algorithm is of major importance for the entire application
 *	  since it converts the english text to Pig Latin.
 *
 *    4) What methods are implemented (optional).
 *    The getTranslation method.
 *
 *  Changes :  <Description|date of modifications>
 *
 ********************************************************/
package pigLatin;

/**
 * This class acts as a controller for model.
 * 
 * @author Frederick Javalera
 */
public class TranslatorController
{	
	TranslatorModel model = new TranslatorModel();

	/**
	 * This method receives enlishText from the TranslatorView and calls the
	 * convertToLatin method from the TranslatorModel. 
	 */
	public String getTranslation(String englishText)
	{
		String convertedString = model.convertToLatin(englishText);
		return convertedString;
	}
}
