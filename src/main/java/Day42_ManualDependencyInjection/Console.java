package Day42_ManualDependencyInjection;

public class Console implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Console log : " + message);
		System.out.println();
	}
}
