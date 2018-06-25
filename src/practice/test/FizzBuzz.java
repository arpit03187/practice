package practice.test;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {

	public static void main(String[] args) {

		// fizzBuzz(100);

		fizzBuzzInJava8(45);

	}

	public static void fizzBuzz(int n) {

		for (int i = 1; i <= n; i++) {
			// number divisible by 5, print 'Buzz'
			// in place of the number
			if (i % 15 == 0)
				System.out.print("Buzz" + " ");

			// number divisible by 3, print 'Fizz'
			// in place of the number
			else if (i % 3 == 0)
				System.out.print("Fizz" + " ");

			// number divisible by 15(divisible by
			// both 3 & 5), print 'FizzBuzz' in
			// place of the number
			else if (i % 5 == 0)
				System.out.print("FizzBuzz" + " ");

			else // print the numbers
				System.out.print(i + " ");
		}
	}

	public static void fizzBuzzInJava8(int number) {

		String result = Optional.of(number).map(n -> (n % 3 == 0 ? "Fizz" : "") + (n % 5 == 0 ? "Buzz" : "")).get();
		if (result.isEmpty())
			System.out.println(Integer.toString(number));
		else
			System.out.println(result);
	}

}
