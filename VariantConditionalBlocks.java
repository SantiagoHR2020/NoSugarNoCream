
public class ConditionalBlocks {

	public static void main(String[] args) {
		boolean b1=false;
		boolean b2=true;
		
		
		if(b1) {
			System.out.println("inside the if");
			if(b2) {
				System.out.println("inside the nested if");
			}
		}
		else if(b2) {
			System.out.println("inside the else-if");
		}
		else {
			System.out.println("inside the else");
		}
		System.out.println("outside the if");
	}

}
