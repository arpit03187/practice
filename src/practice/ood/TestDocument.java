package practice.ood;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestDocument {

	public static void main(String[] args) {
		
		List<String> words = new ArrayList<>();
		words.add("I");
		words.add("Blue Fox");
		words.add("Hidden here");
		
		List<String> words2 = new ArrayList<>();
		words2.add("I");
		words2.add("Blue Fox");
		words2.add("Hidden here");
		
		Iterator<String> wordsIterator = words.iterator();
		Iterator<String> wordsIterator2 = words2.iterator();
		
		DocumentImpl docImpl = new DocumentImpl();
		docImpl.setDocId("A1SV");
		docImpl.setWords(wordsIterator);
		
		DocumentImpl docImpl2 = new DocumentImpl();
		docImpl2.setDocId("A1SV21");
		docImpl2.setWords(wordsIterator2);
		
		DocumentIndex index = new DocumentIndex();
		
		index.add(docImpl);
		index.add(docImpl2);
		
		List<String> docIds = index.getDocIds("Blue Fox");
		
		docIds.stream().forEach(System.out::println);
		
	}
}
