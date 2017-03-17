/**
 * 
 */
package pigLatin;

/**
 * @author Frederick Javalera
 *
 */
public class TranslatorModel
{

	public String convertToLatin(String string)
	{
		String[] textString = string.split(" ");
		String newWord1 = "";
		String newWord2 = "";
		String newWord = "";
		for(String word : textString)
		{
			for(int i = 0; i < word.length(); i++)
			{
				if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' 
						|| word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'y')
				{
					for(int j = i; j < word.length(); j++)
					{
						newWord1 += word.charAt(i);
					}
				}
				else
				{
					newWord2 += word.charAt(i);
				}
				newWord = newWord1 + newWord2;
			}
		}
		return newWord;
	}
	
}
