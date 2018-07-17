package practice.list.test;


import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainTransaction {

	public static void main(String[] args) {
		
		Map<Currency, List<Transaction>> transactionsByCurrencies = 
				populateCurrencyData().stream().collect(Collectors.groupingBy(Transaction::getCurrency));
	}
		
		
	
	public static List<Transaction> populateCurrencyData() {
		
		Currency c1 = new Currency("USD", 220.00);
		Currency c2 = new Currency("USD", 530.00);
		Currency c3 = new Currency("USD", 154.00);
		
		Transaction tx1 = new Transaction(new Random().nextInt() ,c1);
		Transaction tx2 = new Transaction(new Random().nextInt() ,c2);
		Transaction tx3 = new Transaction(new Random().nextInt() ,c3);
		
		return Stream.of(tx1, tx2, tx3).collect(Collectors.toList());
	}
}
