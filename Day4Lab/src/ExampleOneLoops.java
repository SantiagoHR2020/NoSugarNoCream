
public class ExampleOneLoops {
	public static void main(String[] args) {
		boolean on = true;
		while (on) {
			System.out.println("Inside the while loop");
			on = false;
		}
		doWhileExample();
	}
	
	public static void doWhileExample() {
		boolean on = false;
		do {
			System.out.println("Inside the do-while loop");
		}while(on);
	}
}
