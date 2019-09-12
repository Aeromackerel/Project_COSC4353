package editorP;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public class textareaMonitor implements DocumentListener
{
	String newline = "\n";

	/* Want to check if the user enters in an operator, boolean, string
	 * then change it to respective colors.
	 * (non-Javadoc)
	 * @see javax.swing.event.DocumentListener#changedUpdate(javax.swing.event.DocumentEvent)
	 */
	
	@Override
	public void changedUpdate(DocumentEvent docEvent) 
	{
		Document source = docEvent.getDocument();
		parseAndChangeFont(docEvent);

	}

	@Override
	public void insertUpdate(DocumentEvent docEvent)
	{
		Document source = docEvent.getDocument();
		parseAndChangeFont(docEvent);
	}

	@Override
	public void removeUpdate(DocumentEvent docEvent) 
	{
		System.out.println(docEvent);
	}
	
	// Parses the new input/edit to see if it one of the target string(s)/char(s)
	// returns single char -> gives us font color to append to the JTextArea.
	
	public void parseAndChangeFont (DocumentEvent docEvent)
	{
		Document source = docEvent.getDocument();
		try
		{String sourceText = source.getText(0, source.getLength());}
		catch (BadLocationException badLocation)
		{
			System.out.println("Contents : unknown");
			System.exit(1);
		}
		
		documentParser parser = new documentParser();
		
		
	}
}
	
