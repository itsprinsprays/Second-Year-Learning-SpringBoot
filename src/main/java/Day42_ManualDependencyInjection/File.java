package Day42_ManualDependencyInjection;

public class File implements Logger{

	@Override
	public void log(String message) {
		System.out.println("File log : " + message);
		System.out.println();

	}
}
