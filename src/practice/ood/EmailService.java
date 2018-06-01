package practice.ood;

public class EmailService {

	public static void main(String[] args) {
	
		RegisterEmailTemplate template = new RegisterEmailTemplate();
		template.setTo("abc");
		template.setFrom("xyz");
		template.setBody("Hello!!!");
		
		
		EmailBuilder emailBuilder = new RegisterEmailBuilder(template);
		emailBuilder.sendEmail(template);

	}
	
}
