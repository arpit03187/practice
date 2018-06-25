package practice.test;

import java.util.ArrayList;
import java.util.List;

public class PerfectTeam {
	
public static void main(String[] args) {
		
		String skills1 = "pcmppp";
		String skills2 = "pcmbzpcmbz";
		String skills3 = "pcmbbbzzzpcmbzpcmbzpcbmz";
		String skills4 = "pcmbbbzzzpcmbzpcmbzpcbmzpcmbbbzzzpcmbzpcmbzpcbmzpcmbbbzzzpcmbzpcmbzpcbmzpcmbbbzzzpcmbzpcmbzpcbmzpcmbbbzzzpcmbzpcmbzpcbmzpcmbbbzzzpcmbzpcmbzpcbmzpcmbbbzzzpcmbzpcmbzpcbmzpcmbbbzzzpcmbzpcmbzpcbmzpcmbbbzzzpcmbzpcmbzpcbmzpcmbbbzzzpcmbzpcmbzpcbmzpcmbbbzzzpcmbzpcmbzpcbmzpcmbbbzzzpcmbzpcmbzpcbmz";
		
		// Tests
		System.out.println(numberOfTeams(skills1));
		System.out.println(numberOfTeams(skills2));
		System.out.println(numberOfTeams(skills3));
		System.out.println(numberOfTeams(skills4));
		
	}
	
	public static int countOccurrences(String skills, char singleSkill)
	{
	    int count = 0;
	    for (int i=0; i < skills.length(); i++)
	    {
	        if (skills.charAt(i) == singleSkill)
	        {
	             count++;
	        }
	    }
	    return count;
	}
	
	public static int numberOfTeams(String str) {
		List<Integer> countOfCharacters = new ArrayList<>();
		
		char skillsArray [] = {'p', 'c', 'm', 'b', 'z'};
		
		for(int i = 0 ; i < skillsArray.length ; i++) {
			
			countOfCharacters.add(countOccurrences(str, skillsArray[i]));
		}
		
		return countOfCharacters.stream().mapToInt(v -> v)
	      .min().getAsInt();
		
	}
	 
}
