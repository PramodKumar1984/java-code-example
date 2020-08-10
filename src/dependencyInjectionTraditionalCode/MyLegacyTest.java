package dependencyInjectionTraditionalCode;

public class MyLegacyTest {
	public static void main(String[] args) {
		MyApplication service = new MyApplication();
		service.processMessages("HI", "Test@com");
	}
}
