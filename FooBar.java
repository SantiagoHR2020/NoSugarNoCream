
public class FooBar {
	public static void main(String[]args) {
		fooBar(100);
	}
	
	public static void fooBar(int x) {
		for(int i=1; i<=x; i++) {
			if(i%5==0 && i%3==0) {
				System.out.println("FooBar");
			}else if(i%3==0) {
				System.out.println("Bar");
			}else if(i%5==0) {
				System.out.println("Foo");
			}else {
				System.out.println(i);
			}
		}
	}

}
