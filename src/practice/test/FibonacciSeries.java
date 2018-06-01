package practice.test;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		FibonacciSeries s = new FibonacciSeries();
		s.printFibonacciSeries(10);
	}
	
	public void printFibonacciSeries(int limit) {
		
		int first = 0;
		int second = 1;
		int third;
		
		System.out.print(first);
		System.out.print(" " + second);
		for(int i = 1; i < limit; i++) {
			third = first + second;
			first = second;
			second = third;
			
			System.out.print(" " + third);
		}
	}
}
