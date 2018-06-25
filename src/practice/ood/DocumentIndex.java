package practice.ood;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentIndex {
	
	Map<String, List<String>> documentMap = new HashMap<>();
	
	/**
	 * Adds a new document
	 * @param doc
	 */
	public void add(Document doc) {
		
		while(doc.getWords().hasNext()) {
			
			String word = doc.getWords().next();
			
			List<String> docIds = new ArrayList<>();
			docIds.add(doc.getDocId());
			
			if(!documentMap.containsKey(word)) {
				documentMap.put(word, docIds);
				
			}
			else {
				
			//	documentMap.put(word, documentMap.get(word).stream().);	
				
			}
			
			
			
		}
		
	}
	
	/**
	 * Returs document Ids that contain the word
	 * @param word
	 * @return
	 */
	public List<String> getDocIds(String word){
		
		return documentMap.get(word);
		
	}
 
}
