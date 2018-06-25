package practice.ood;

import java.util.Iterator;

public class DocumentImpl implements Document{

	private String docId;
	private String word;
	private Iterator<String> words;
	
	
	@Override
	public String getDocId() {
		
		return docId;
	}

	@Override
	public String getWord() {
		return word;
	}

	@Override
	public Iterator<String> getWords() {
		return words;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public void setWords(Iterator<String> words) {
		this.words = words;
	}
	
	

	
}
