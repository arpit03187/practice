package practice.ood;

public class RegisterEmailBuilder extends EmailBuilder {
	
	protected RegisterEmailBuilder(RegisterEmailTemplate registerEmailTemplate) {
		super(registerEmailTemplate);
		this.registerEmailTemplate = registerEmailTemplate;
	}

	private RegisterEmailTemplate registerEmailTemplate;

	public void prepareEmail() {

	}

	public RegisterEmailTemplate getRegisterEmailTemplate() {
		return registerEmailTemplate;
	}

	public void setRegisterEmailTemplate(RegisterEmailTemplate registerEmailTemplate) {
		this.registerEmailTemplate = registerEmailTemplate;
	}
	
}
