package practice.test;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		FibonacciSeries s = new FibonacciSeries();
		System.out.println(s.printFibonacciSeries(254125644));
	}
	
	public int printFibonacciSeries(int limit) {
		
		int first = 0;
		int second = 1;
		
		int third = 0;
		
		for(int i = 1; i < limit; i++) {
			third = first + second;
			first = second;
			second = third;		
			
		}
		
		return third;
	}
}
