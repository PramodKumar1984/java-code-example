package dependencyInjectionTraditionalCode;

public class MyApplication {

	private EmailService email = null;

	public MyApplication() {
		this.email = new EmailService();
	}

	public void processMessages(String msg, String rec) {
		// do some msg validation, manipulation logic etc
		this.email.sendEmail(msg, rec);
	}
}
