package practice.ood;

import java.util.Iterator;

public interface Document {
	
	public String getDocId();
	
	public String getWord();
	
	public Iterator<String> getWords();

}
