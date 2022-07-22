
public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main method end");
	}

	private static void method1() {
		try {
			method2();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("method1 end");
	}

	private static void method2() {
		try {
			method3();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("method2 end");
	}

	private static void method3() throws Exception {

		throw new Exception("Something goes wrong");
	}

}
