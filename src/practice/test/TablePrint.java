package practice.test;

public class TablePrint {
	
	public static void main(String[] args) {
	    int a;
	    int b;
	    int sum;
	    for (a = 1; a <= 12; ++a) {
	        for (b = 1; b <= 12; ++b) {
	            sum = a * b;
	            System.out.print(sum);
	            if(sum < 10){
	                System.out.print("    ");
	        }else if(sum >= 100){
	            System.out.print("  ");
	        }else if(sum >= 10){
	            System.out.print("   ");
	            }

	        }
	        System.out.println();
	    }
	}

}
