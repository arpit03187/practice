package practice.ood;

import java.util.Optional;

public class OptionalTest {
	
	
	public static void main(String[] args) {
		System.out.println(optionalTesting(null));
	}
	
	public static Optional<String> optionalTesting(String s) {
//		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        boolean userIsPresent = (null != s);
        return userIsPresent ? Optional.of(s) : Optional.empty();
	}

}
