package practice.ood;

public abstract class EmailBuilder {
	
	public abstract void prepareEmail();
	
	private BaseEmailTemplate baseEmailTemplate;
	
	public BaseEmailTemplate getBaseEmailTemplate() {
		return baseEmailTemplate;
	}

	public void setBaseEmailTemplate(BaseEmailTemplate baseEmailTemplate) {
		this.baseEmailTemplate = baseEmailTemplate;
	}

	protected EmailBuilder(BaseEmailTemplate baseEmailTemplate) {
		this.baseEmailTemplate = baseEmailTemplate;
	}
	
	public void sendEmail(RegisterEmailTemplate registerEmailTemplate) {
		System.out.println(registerEmailTemplate);
	}

}
