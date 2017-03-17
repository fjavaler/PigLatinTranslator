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
		
		String[] textString = string.split("\\s+");
		StringBuilder newWord;
		StringBuilder newSentence = new StringBuilder(string.length());
		boolean firstWord = true;
		boolean capitalizedFlag = false;
		for(String token : textString)
		{
			
//			ensures adequate capacity
			newWord = new StringBuilder(token.length() + 3);
			
			int upperCase = 0;
			
//			Looks for period at end of token
			boolean periodFlag = false;
			if(token.endsWith("."))
			{
				periodFlag = true;
				token = token.replaceAll("\\.", "");
			}
			
//			Looks for question mark at end of token
			boolean questionFlag = false;
			if(token.endsWith("?"))
			{
				questionFlag = true;
				token = token.replaceAll("\\?", "");
			}
			
//			Looks for exclamation at end of token
			boolean exclamationFlag = false;
			if(token.endsWith("!"))
			{
				exclamationFlag = true;
				token = token.replaceAll("\\!", "");
			}
			
			//finds voweled portion of string and seperates from non-voweled portion.
			for(int i = 0; i < token.length(); i++)
			{
				
				if(Character.isUpperCase(token.charAt(i)))
				{
					token = token.toLowerCase();
					capitalizedFlag = true;
					upperCase = i;
				}
				if(token.charAt(i) == 'a' || token.charAt(i) == 'e' || token.charAt(i) == 'i' 
						|| token.charAt(i) == 'o' || token.charAt(i) == 'u' || token.charAt(i) == 'y')
				{
					newWord.insert(0, token.substring(i, token.length()));
					if(i == 0)
					{
						newWord.append("way");
					}
					else
					{
						newWord.append("ay");
					}
					break;
				}
				else
				{
					newWord.append(token.charAt(i));
				}
			}
			if(periodFlag == true)
			{
				newWord.append('.');
				periodFlag = false;
			}
			if(questionFlag == true)
			{
				newWord.append('?');
				questionFlag = false;
			}
			if(exclamationFlag == true)
			{
				newWord.append('!');
				exclamationFlag = false;
			}
			if(capitalizedFlag == true)
			{
				String temp = newWord.toString();
				newWord.replace(0, newWord.length(), temp.substring(0, 1).toUpperCase() + temp.substring(1));
				capitalizedFlag = false;
			}
			if(!newWord.toString().contains(".") && firstWord == true)
			{
				newSentence.append(newWord + " ");
				firstWord = false;
			}
			else if(!newWord.toString().contains(".") && firstWord == false)
			{
				newSentence.append(newWord + " ");
			}
			else
			{
				newSentence.append(newWord);
			}
		}
		return newSentence.toString();
	}
	
}
