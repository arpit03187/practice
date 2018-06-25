package practice.hackerrank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradingSystem {
	
	static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */

       List<Integer> gradesList = new ArrayList<>(); 
       for(int grade: grades) {
           
           if(grade < 38) {
               gradesList.add(grade);
           } else {
               gradesList.add(getMultipleOfFive(grade));
           }
       }
       
      return gradesList.stream().mapToInt(i->i).toArray();

    }
    
    public static int getMultipleOfFive(int num) {
        
        int newNumber = num;
        for(int i = 1; i < 3; i++) {
            if((num+i) % 5 == 0) {
                newNumber = num+i;
                return newNumber;
            }
        }
        return newNumber;
            
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);
        
        for(int res: result) {
        	System.out.println(res);
        }
        
    }

}
