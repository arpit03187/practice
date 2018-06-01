package practice.ood;

public class RegisterEmailTemplate extends BaseEmailTemplate {
	
	private String body;

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	@Override
	public String toString() {
		return "To : " + getTo() + " from : " + getFrom() + " body " + getBody();
		
	}
	

}
