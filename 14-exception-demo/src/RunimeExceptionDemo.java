
public class RunimeExceptionDemo {

	public static void main(String[] args) {

		method1();
		System.out.println("main method end");
	}

	private static void method1() {
		method2();
		System.out.println("method1 end");
	}

	private static void method2() {
		try {
			method3();
		} catch (Exception e) {
			System.out.println("Exception handeled");
		}

		System.out.println("method2 end");
	}

	private static void method3() {

		throw new RuntimeException("Something goes wrong");
	}

}
