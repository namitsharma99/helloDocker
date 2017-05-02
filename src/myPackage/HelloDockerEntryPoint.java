package myPackage;

public class HelloDockerEntryPoint {

	public static void main(String[] args) {

		for (int i = 6; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("<< Hello from the test project << ");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
