package dependencyInjection;

public class SMSServiceImpl implements MessageService {

	@Override
	public void sendMessage(String msg, String email) {
		System.out.println("SMS sent to "+email+ " with Message="+msg);
	}
}
